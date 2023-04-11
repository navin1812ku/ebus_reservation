package smart.ebus.reservation.system.E_Bus_Reservation.service.implementation;


import org.springframework.stereotype.Service;
import smart.ebus.reservation.system.E_Bus_Reservation.entity.Passenger_Journey_Details_Entity;
import smart.ebus.reservation.system.E_Bus_Reservation.model.Ticket_Booking_Request;
import smart.ebus.reservation.system.E_Bus_Reservation.service.Ticket_Booking_Service;

@Service
public class Ticket_Booking_Impl implements Ticket_Booking_Service {
    @Override
    public Passenger_Journey_Details_Entity ticket_booking(Ticket_Booking_Request ticket_booking_request) {
        return null;
    }
}
