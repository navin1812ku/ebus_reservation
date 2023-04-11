package smart.ebus.reservation.system.E_Bus_Reservation.service.implementation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import smart.ebus.reservation.system.E_Bus_Reservation.entity.Passenger_Journey_Details_Entity;
import smart.ebus.reservation.system.E_Bus_Reservation.repository.Passenger_Journey_Details_Repository;
import smart.ebus.reservation.system.E_Bus_Reservation.service.Passenger_Details_Service;


@Service
public class Passenger_Details_impl implements Passenger_Details_Service {

    @Autowired
    public Passenger_Journey_Details_Repository passenger_details_repository;

    @Override
    public Passenger_Journey_Details_Entity passengers_details(Passenger_Journey_Details_Entity passenger_journey_detailsEntity) {
        return passenger_details_repository.save(passenger_journey_detailsEntity);
    }
}
