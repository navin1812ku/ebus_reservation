package smart.ebus.reservation.system.E_Bus_Reservation.service.implementation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import smart.ebus.reservation.system.E_Bus_Reservation.entity.Passenger_Journey_Details_Entity;
import smart.ebus.reservation.system.E_Bus_Reservation.model.request.Getting_Journey_Request;
import smart.ebus.reservation.system.E_Bus_Reservation.entity.Hotel_Details_Entity;
import smart.ebus.reservation.system.E_Bus_Reservation.entity.Journey_Details_Entity;
import smart.ebus.reservation.system.E_Bus_Reservation.entity.Passenger_Details_Entity;
import smart.ebus.reservation.system.E_Bus_Reservation.repository.Hotel_Details_Repository;
import smart.ebus.reservation.system.E_Bus_Reservation.repository.Journey_Details_Repository;
import smart.ebus.reservation.system.E_Bus_Reservation.repository.Passenger_Details_Repository;
import smart.ebus.reservation.system.E_Bus_Reservation.repository.Passenger_Journey_Details_Repository;
import smart.ebus.reservation.system.E_Bus_Reservation.service.Passenger_Journey_Details_Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class Passenger_Journey_Details_Impl implements Passenger_Journey_Details_Service {

    @Autowired
    Passenger_Journey_Details_Repository passenger_journey_details_repository;

    @Override
    public Passenger_Journey_Details_Entity customer_details(Getting_Journey_Request getting_journey_request) {
        Passenger_Journey_Details_Entity passenger_journey_details_entity=new Passenger_Journey_Details_Entity();
        passenger_journey_details_entity.setUser_email_id(getting_journey_request.getUser_mail_id());

        Passenger_Details_Entity passenger_detailsEntity =new Passenger_Details_Entity();
        passenger_detailsEntity.setUser_email_id(getting_journey_request.getUser_mail_id());
        passenger_detailsEntity.setPNR_number(getting_journey_request.getPNRNumber());
        passenger_detailsEntity.setPassenger_name(getting_journey_request.getName());
        passenger_detailsEntity.setPassenger_age(getting_journey_request.getAge());
        passenger_detailsEntity.setSeat_number(getting_journey_request.getSeat_number());

        List<Passenger_Details_Entity> passenger_details_entities_list=new ArrayList<>();
        passenger_details_entities_list.add(passenger_detailsEntity);

        Journey_Details_Entity journey_detailsEntity = new Journey_Details_Entity();
        journey_detailsEntity.setUser_email_id(getting_journey_request.getUser_mail_id());
        journey_detailsEntity.setPNR_number(getting_journey_request.getPNRNumber());
        journey_detailsEntity.setPassenger_detailEntities(passenger_details_entities_list);
        journey_detailsEntity.setPhone_number(getting_journey_request.getPhone_number());
        journey_detailsEntity.setSource(getting_journey_request.getPick_up());
        journey_detailsEntity.setDestination(getting_journey_request.getDrop());
        journey_detailsEntity.setBus_name(getting_journey_request.getBus_id());
        journey_detailsEntity.setTravel_date(getting_journey_request.getTravel_date());
        journey_detailsEntity.setNumber_of_seats(getting_journey_request.getNumber_of_seats());
        journey_detailsEntity.setTotal_amount(getting_journey_request.getBus_fare_per_person());
        journey_detailsEntity.setOffer_applied(false);
        journey_detailsEntity.setPromo_code_applied("NA");
        journey_detailsEntity.setStatus_of_journey("SCH");

        List<Journey_Details_Entity> journey_details_entities_list=new ArrayList<>();
        journey_details_entities_list.add(journey_detailsEntity);
        passenger_journey_details_entity.setJourney_detailEntities(journey_details_entities_list);


        passenger_journey_details_repository.save(passenger_journey_details_entity);

        return passenger_journey_details_entity;
    }
}
