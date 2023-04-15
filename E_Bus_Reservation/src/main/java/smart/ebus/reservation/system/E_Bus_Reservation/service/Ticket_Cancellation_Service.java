package smart.ebus.reservation.system.E_Bus_Reservation.service;

import smart.ebus.reservation.system.E_Bus_Reservation.entity.Passenger_Journey_Details_Entity;
import smart.ebus.reservation.system.E_Bus_Reservation.model.request.Ticket_Cancellation_Request;

public interface Ticket_Cancellation_Service {
    Passenger_Journey_Details_Entity cancelling_ticket(Ticket_Cancellation_Request ticket_cancellation_request);
}
