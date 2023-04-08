package smart.ebus.reservation.system.E_Bus_Reservation.contoller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import smart.ebus.reservation.system.E_Bus_Reservation.model.Passenger_Journey_Details;
import smart.ebus.reservation.system.E_Bus_Reservation.model.Ticket_Booking_Request;
import smart.ebus.reservation.system.E_Bus_Reservation.service.Ticket_Booking_Service;

@RestController
@RequestMapping("/ticket_booking/")
public class Ticket_Booking_Controller {

    @Autowired
    Ticket_Booking_Service ticket_booking_service;

    @PostMapping("/available_buses")
    public ResponseEntity<Passenger_Journey_Details> passenger_details(@RequestBody Ticket_Booking_Request ticket_booking_request)
    {
        return new ResponseEntity<Passenger_Journey_Details>(ticket_booking_service.ticket_booking(ticket_booking_request), HttpStatus.CREATED);
    }
}
