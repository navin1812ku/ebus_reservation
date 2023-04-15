package smart.ebus.reservation.system.E_Bus_Reservation.service.implementation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.convert.threeten.Jsr310JpaConverters;
import org.springframework.stereotype.Service;
import smart.ebus.reservation.system.E_Bus_Reservation.entity.Journey_Details_Entity;
import smart.ebus.reservation.system.E_Bus_Reservation.entity.Passenger_Journey_Details_Entity;
import smart.ebus.reservation.system.E_Bus_Reservation.entity.Promo_Code_Entity;
import smart.ebus.reservation.system.E_Bus_Reservation.model.request.Ticket_Cancellation_Request;
import smart.ebus.reservation.system.E_Bus_Reservation.repository.Passenger_Journey_Details_Repository;
import smart.ebus.reservation.system.E_Bus_Reservation.service.Ticket_Cancellation_Service;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.List;

@Service
public class Ticket_Cancellation_Impl implements Ticket_Cancellation_Service {

    @Autowired
    Passenger_Journey_Details_Repository passenger_journey_details_repository;

    @Override
    public Passenger_Journey_Details_Entity cancelling_ticket(Ticket_Cancellation_Request ticket_cancellation_request) {
        Passenger_Journey_Details_Entity passenger_journey_details_entity=passenger_journey_details_repository.findById(ticket_cancellation_request.getUser_email_id()).orElse(null);
        List<Journey_Details_Entity> journey_details_entityList=passenger_journey_details_entity.getJourney_detailEntities();
        int index=0;
        for(Journey_Details_Entity journey_details_entity:journey_details_entityList)
        {
            if(journey_details_entity.getPNR_number().equals(ticket_cancellation_request.getPNR_Number()))
            {
                journey_details_entity.setStatus_of_journey("CAN");

                SimpleDateFormat sd1 = new SimpleDateFormat("yyyy:MM:dd");
                Date c_date = new Date();
                String cDate=sd1.format(c_date);
                int current_date=Integer.parseInt(cDate.substring(cDate.length()-2,cDate.length()));

                String b_date=journey_details_entity.getTravel_date().toString();
                int bus_date=Integer.parseInt(b_date.substring(b_date.length()-2,b_date.length()));

                int date=current_date > bus_date ? current_date-bus_date : bus_date-current_date;

                SimpleDateFormat sd = new SimpleDateFormat("HH:mm");
                Date date_time = new Date();
                String c_time=sd.format(date_time).substring(0,2);

                String b_time= journey_details_entity.getStart_time().substring(0,2);

                int current_time=Integer.parseInt(c_time);
                int bus_time=Integer.parseInt(b_time);

                int time1=current_time>bus_time?current_time-bus_time:bus_time-current_time;

                int time=time1>24 ? time1-24:24-time1;

                if(date<=1 && current_time<bus_time)
                {
                    if(time>=24)
                    {
                        journey_details_entity.setRefund_amount((journey_details_entity
                                .getTotal_amount()*90)/100
                        );
                    }
                    else if(time>=12)
                    {
                        journey_details_entity.setRefund_amount((journey_details_entity
                                .getTotal_amount()*75)/100
                        );
                    }
                    else if (time>=6)
                    {
                        journey_details_entity.setRefund_amount((journey_details_entity
                                .getTotal_amount()*50)/100
                        );
                    }
                    else
                    {
                        journey_details_entity.setRefund_amount(0.0);
                    }
                }
                else if(date>1)
                {
                    journey_details_entity.setRefund_amount((journey_details_entity
                                    .getTotal_amount()*90)/100
                    );
                }
                else
                {
                    journey_details_entity.setRefund_amount(0.0);
                }
                journey_details_entity.setRefund_status("INI");
                journey_details_entity.setCancellation_date(cDate);
                journey_details_entity.setCancellation_time(sd.format(date_time));
                journey_details_entity.setReason_for_cancellation(ticket_cancellation_request.getReason_for_cancellation());

                journey_details_entityList.set(index,journey_details_entity);

                passenger_journey_details_entity.setJourney_detailEntities(journey_details_entityList);

                passenger_journey_details_repository.save(passenger_journey_details_entity);

                break;
            }
            index++;
        }
        return passenger_journey_details_entity;
    }
}

/*
if(promo_code_request.getPromo_code()!=null)
                {
                    Promo_Code_Entity promo_code_entity=promo_code_repository.findById(promo_code_request.getPromo_code().toUpperCase()).orElse(null);
                    Double total_amount;/*=journey_details_entity.getTotal_amount()*(promo_code_entity.getDiscount()/100);

                    total_amount=journey_details_entity.getTotal_amount()-(journey_details_entity.getTotal_amount()*(promo_code_entity.getDiscount()/100));
                            /*((100-promo_code_entity.getDiscount())*journey_details_entity.getTotal_amount())/100;

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
 */