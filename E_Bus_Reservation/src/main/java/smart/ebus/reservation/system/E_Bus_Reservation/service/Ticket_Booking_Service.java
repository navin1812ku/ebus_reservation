package smart.ebus.reservation.system.E_Bus_Reservation.service;


import smart.ebus.reservation.system.E_Bus_Reservation.model.Passenger_Journey_Details;
import smart.ebus.reservation.system.E_Bus_Reservation.model.Ticket_Booking_Request;

public interface Ticket_Booking_Service {

    Passenger_Journey_Details ticket_booking(Ticket_Booking_Request ticket_booking_request);
}
