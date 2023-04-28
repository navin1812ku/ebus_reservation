package smart.ebus.reservation.system.E_Bus_Reservation.service.implementation;


import models.SendEnhancedRequestBody;
import models.SendEnhancedResponseBody;
import models.SendRequestMessage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import services.Courier;
import services.SendService;
import smart.ebus.reservation.system.E_Bus_Reservation.entity.Journey_Details_Entity;
import smart.ebus.reservation.system.E_Bus_Reservation.entity.Passenger_Journey_Details_Entity;
import smart.ebus.reservation.system.E_Bus_Reservation.entity.Promo_Code_Entity;
import smart.ebus.reservation.system.E_Bus_Reservation.enum_package.Response_Enum;
import smart.ebus.reservation.system.E_Bus_Reservation.exception.Mail_ID_Not_Found_Exception;
import smart.ebus.reservation.system.E_Bus_Reservation.model.request.Promo_Code_Request;
import smart.ebus.reservation.system.E_Bus_Reservation.repository.Passenger_Journey_Details_Repository;
import smart.ebus.reservation.system.E_Bus_Reservation.repository.Promo_Code_Repository;
import smart.ebus.reservation.system.E_Bus_Reservation.service.Payment_Details_Service;

import java.io.IOException;
import java.time.LocalDate;
import java.util.HashMap;
import java.util.List;

@Service
public class Payment_Details_Impl implements Payment_Details_Service {

    @Autowired
    Promo_Code_Repository promo_code_repository;

    @Autowired
    Passenger_Journey_Details_Repository passenger_journey_details_repository;

    @Override
    public Passenger_Journey_Details_Entity total_amount(Promo_Code_Request promo_code_request) {
        Passenger_Journey_Details_Entity passenger_journey_details_entity=passenger_journey_details_repository.findById(promo_code_request.getUser_email_id()).orElseThrow(() -> new Mail_ID_Not_Found_Exception("Given E_mail ID have not booked ticket"));
        List<Journey_Details_Entity> journey_details_entityList=passenger_journey_details_entity.getJourney_detailEntities();
        int index=0;
        LocalDate current_date = LocalDate.now();
        for(Journey_Details_Entity journey_details_entity:journey_details_entityList)
        {
            if(journey_details_entity.getPNR_number().equals(promo_code_request.getPNR_Number()))
            {
                if(promo_code_request.getPromo_code()!=null)
                {
                    Promo_Code_Entity promo_code_entity=promo_code_repository.findById(promo_code_request.getPromo_code().toUpperCase()).orElse(null);
                    Double total_amount;/*=journey_details_entity.getTotal_amount()*(promo_code_entity.getDiscount()/100);*/
                    if(promo_code_entity!=null && promo_code_entity.getValid_date().isAfter(current_date)) {
                        total_amount = (journey_details_entity.getTotal_amount() * promo_code_entity.getDiscount()) / 100;
                        total_amount = journey_details_entity.getTotal_amount()-total_amount;
                        /*((100-promo_code_entity.getDiscount())*journey_details_entity.getTotal_amount())/100;*/
                    }
                    else
                    {
                        total_amount=journey_details_entity.getTotal_amount();
                    }

                    journey_details_entity.setTotal_amount(total_amount);
                    journey_details_entity.setOffer_applied(true);
                    journey_details_entity.setPromo_code_applied(promo_code_request.getPromo_code());
                    journey_details_entity.setPayment_status("Paid");

                    journey_details_entityList.set(index,journey_details_entity);

                    passenger_journey_details_entity.setResponse(Response_Enum.AMOUNT_PAID.toString());

                    passenger_journey_details_entity.setJourney_detailEntities(journey_details_entityList);

                    passenger_journey_details_repository.save(passenger_journey_details_entity);

                    ticketConfrimationMail(journey_details_entity);

                    break;
                }
                else
                {
                    journey_details_entity.setPayment_status("Not Paid");

                    journey_details_entityList.set(index,journey_details_entity);

                    passenger_journey_details_entity.setResponse(Response_Enum.AMOUNT_NOT_PAID.toString());

                    passenger_journey_details_entity.setJourney_detailEntities(journey_details_entityList);

                    passenger_journey_details_repository.save(passenger_journey_details_entity);
                }
                break;
            }
            index++;
        }
        return passenger_journey_details_entity;
    }

    private void ticketConfrimationMail(Journey_Details_Entity journey_details_entity) {
        Courier.init("pk_prod_NQM5KP2VHQ4X7FGPWTY8G6S1CCXH");

        SendEnhancedRequestBody sendEnhancedRequestBody = new SendEnhancedRequestBody();
        SendRequestMessage sendRequestMessage = new SendRequestMessage();
        HashMap<String, String> to = new HashMap<String, String>();
        to.put("email",journey_details_entity.getUser_email_id());
        sendRequestMessage.setTo(to);

        HashMap<String, String> content = new HashMap<String, String>();
        content.put("title", "Ticket Confirmed for Your Upcoming Journey");
        content.put("body", "Traveller Name: "+journey_details_entity.getPassenger_detailEntities().get(0).getPassenger_name()+"\n Travels Name: "+journey_details_entity.getBus_name()+"\nPNR Number: "+journey_details_entity.getPNR_number()+"\n Source: "+journey_details_entity.getSource()+
                "\n Destination: "+journey_details_entity.getDestination()+"\n Start Time: "+journey_details_entity.getStart_time()+"\n Date of Journey: "+journey_details_entity.getTraveldate()+
                "\n Seat no: "+journey_details_entity.getPassenger_detailEntities().get(0).getSeat_number()+"\n Bus Fare: "+journey_details_entity.getTotal_amount()+"\n Hotel Seat: "+journey_details_entity.getNumber_of_seats());
        sendRequestMessage.setContent(content);

        HashMap<String, Object> data = new HashMap<String, Object>();
        data.put("joke", "\n \n Thanks for booking With us, Wish you a safe and Happy Journey \n \n ");
        sendRequestMessage.setData(data);
        sendEnhancedRequestBody.setMessage(sendRequestMessage);

        try {
            SendEnhancedResponseBody response = new SendService().sendEnhancedMessage(sendEnhancedRequestBody);
            System.out.println(response);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
