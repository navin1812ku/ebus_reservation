package smart.ebus.reservation.system.E_Bus_Reservation.service;


import smart.ebus.reservation.system.E_Bus_Reservation.entity.Passenger_Journey_Details_Entity;
import smart.ebus.reservation.system.E_Bus_Reservation.model.Ticket_Booking_Request;

public interface Ticket_Booking_Service {

    Passenger_Journey_Details_Entity ticket_booking(Ticket_Booking_Request ticket_booking_request);
}
