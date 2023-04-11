package smart.ebus.reservation.system.E_Bus_Reservation.service.implementation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import smart.ebus.reservation.system.E_Bus_Reservation.model.Getting_Journey_Request;
import smart.ebus.reservation.system.E_Bus_Reservation.entity.Hotel_Details_Entity;
import smart.ebus.reservation.system.E_Bus_Reservation.entity.Journey_Details_Entity;
import smart.ebus.reservation.system.E_Bus_Reservation.entity.Passenger_Details_Entity;
import smart.ebus.reservation.system.E_Bus_Reservation.repository.Hotel_Details_Repository;
import smart.ebus.reservation.system.E_Bus_Reservation.repository.Journey_Details_Repository;
import smart.ebus.reservation.system.E_Bus_Reservation.repository.Passenger_Details_Repository;
import smart.ebus.reservation.system.E_Bus_Reservation.service.Journey_Details_Service;

@Service
public class Journey_Details_Impl implements Journey_Details_Service {

    @Autowired
    Journey_Details_Repository journey_details_repository;

    @Autowired
    Passenger_Details_Repository passenger_details_repository;

    @Autowired
    Hotel_Details_Repository hotel_details_repository;

    @Override
    public Journey_Details_Entity customer_details(Getting_Journey_Request getting_journey_request) {
        Journey_Details_Entity journey_detailsEntity = new Journey_Details_Entity();
        journey_detailsEntity.setSource(getting_journey_request.getPick_up());
        journey_detailsEntity.setDestination(getting_journey_request.getDrop());
        journey_details_repository.save(journey_detailsEntity);

        Passenger_Details_Entity passenger_detailsEntity =new Passenger_Details_Entity();
        passenger_detailsEntity.setPassenger_name(getting_journey_request.getName());
        passenger_detailsEntity.setPassenger_age(getting_journey_request.getAge());
        passenger_details_repository.save(passenger_detailsEntity);

        Hotel_Details_Entity hotel_details_entity =new Hotel_Details_Entity();
        hotel_details_entity.setNumber_of_seats(hotel_details_entity.getNumber_of_seats());
        hotel_details_repository.save(hotel_details_entity);

        return null;
    }
}
