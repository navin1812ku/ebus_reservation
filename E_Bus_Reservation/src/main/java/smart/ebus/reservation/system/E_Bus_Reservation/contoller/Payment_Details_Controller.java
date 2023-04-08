package smart.ebus.reservation.system.E_Bus_Reservation.contoller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import smart.ebus.reservation.system.E_Bus_Reservation.model.Journey_Details;
import smart.ebus.reservation.system.E_Bus_Reservation.model.Passenger_Journey_Details;
import smart.ebus.reservation.system.E_Bus_Reservation.model.Ticket_Booking_Request;
import smart.ebus.reservation.system.E_Bus_Reservation.service.Journey_Details_Service;
import smart.ebus.reservation.system.E_Bus_Reservation.service.Payment_Details_Service;

@RestController
@RequestMapping("/payment_details")
public class Payment_Details_Controller {

    @Autowired
    Payment_Details_Service payment_details_service;

    @GetMapping("/total_amount")
    public ResponseEntity<Journey_Details> payment_details(@RequestBody Journey_Details journey_details)
    {
        return new ResponseEntity<Journey_Details>(payment_details_service.total_amount(journey_details), HttpStatus.CREATED);
    }


}
