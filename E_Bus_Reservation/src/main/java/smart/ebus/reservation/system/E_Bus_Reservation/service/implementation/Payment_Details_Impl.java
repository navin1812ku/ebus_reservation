package smart.ebus.reservation.system.E_Bus_Reservation.service.implementation;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import smart.ebus.reservation.system.E_Bus_Reservation.entity.Journey_Details_Entity;
import smart.ebus.reservation.system.E_Bus_Reservation.entity.Passenger_Journey_Details_Entity;
import smart.ebus.reservation.system.E_Bus_Reservation.entity.Promo_Code_Entity;
import smart.ebus.reservation.system.E_Bus_Reservation.exception.Mail_ID_Not_Found_Exception;
import smart.ebus.reservation.system.E_Bus_Reservation.model.request.Promo_Code_Request;
import smart.ebus.reservation.system.E_Bus_Reservation.repository.Passenger_Journey_Details_Repository;
import smart.ebus.reservation.system.E_Bus_Reservation.repository.Promo_Code_Repository;
import smart.ebus.reservation.system.E_Bus_Reservation.service.Payment_Details_Service;

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
        for(Journey_Details_Entity journey_details_entity:journey_details_entityList)
        {
            if(journey_details_entity.getPNR_number().equals(promo_code_request.getPNR_Number()))
            {
                if(promo_code_request.getPromo_code()!=null)
                {
                    Promo_Code_Entity promo_code_entity=promo_code_repository.findById(promo_code_request.getPromo_code().toUpperCase()).orElse(null);
                    Double total_amount;/*=journey_details_entity.getTotal_amount()*(promo_code_entity.getDiscount()/100);*/

                    total_amount=(journey_details_entity.getTotal_amount()*promo_code_entity.getDiscount())/100;
                            /*((100-promo_code_entity.getDiscount())*journey_details_entity.getTotal_amount())/100;*/

                    journey_details_entity.setTotal_amount(total_amount);
                    journey_details_entity.setOffer_applied(true);
                    journey_details_entity.setPromo_code_applied(promo_code_request.getPromo_code());
                    journey_details_entity.setPayment_status("Paid");

                    journey_details_entityList.set(index,journey_details_entity);

                    passenger_journey_details_entity.setJourney_detailEntities(journey_details_entityList);

                    passenger_journey_details_repository.save(passenger_journey_details_entity);
                    break;
                }
                else
                {
                    journey_details_entity.setPayment_status("Not Paid");

                    journey_details_entityList.set(index,journey_details_entity);

                    passenger_journey_details_entity.setJourney_detailEntities(journey_details_entityList);

                    passenger_journey_details_repository.save(passenger_journey_details_entity);
                }
                break;
            }
            index++;
        }
        return passenger_journey_details_entity;
    }
}
