package smart.ebus.reservation.system.E_Bus_Reservation.service.implementation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import smart.ebus.reservation.system.E_Bus_Reservation.model.Booking_page;
import smart.ebus.reservation.system.E_Bus_Reservation.model.Journey_Details;
import smart.ebus.reservation.system.E_Bus_Reservation.model.Passenger_Journey_Details;
import smart.ebus.reservation.system.E_Bus_Reservation.repository.Passenger_Details_Repository;
import smart.ebus.reservation.system.E_Bus_Reservation.service.Passenger_Details_Service;


@Service
public class Passenger_Details_impl implements Passenger_Details_Service {

    @Autowired
    public Passenger_Details_Repository passenger_details_repository;

    @Override
    public Journey_Details find_buses(Booking_page booking_page) {
        Passenger_Journey_Details passenger_journey_details = null;
        Journey_Details journey_details=null;
        passenger_details_repository.save(passenger_journey_details);
        return null;
    }
}
