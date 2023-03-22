package smart.ebus.reservation.system.E_Bus_Reservation.service.implementation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import smart.ebus.reservation.system.E_Bus_Reservation.model.Passenger_Journey_Details;
import smart.ebus.reservation.system.E_Bus_Reservation.repository.Passenger_Details_Repository;
import smart.ebus.reservation.system.E_Bus_Reservation.service.Passenger_Details_Service;


@Service
public class Passenger_Details_impl implements Passenger_Details_Service {

    @Autowired
    Passenger_Details_Repository passenger_details_repository;

    @Override
    public Passenger_Journey_Details get_passenger_journey_details(Passenger_Journey_Details journey_details) {
        return passenger_details_repository.save(journey_details);
    }

    @Override
    public Passenger_Journey_Details find_buses(Passenger_Journey_Details journey_details) {
        return null;
    }
}
