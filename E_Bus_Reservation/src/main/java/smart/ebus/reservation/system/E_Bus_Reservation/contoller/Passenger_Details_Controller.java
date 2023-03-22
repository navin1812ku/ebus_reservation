package smart.ebus.reservation.system.E_Bus_Reservation.contoller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import smart.ebus.reservation.system.E_Bus_Reservation.model.Booking_page;
import smart.ebus.reservation.system.E_Bus_Reservation.model.Journey_Details;
import smart.ebus.reservation.system.E_Bus_Reservation.model.Passenger_Journey_Details;
import smart.ebus.reservation.system.E_Bus_Reservation.service.Passenger_Details_Service;

@RestController
@RequestMapping("/passenger_details")
public class Passenger_Details_Controller {
    @Autowired
    Passenger_Details_Service passenger_details_service;


    @PostMapping("/passenger_details")
    public ResponseEntity<Journey_Details> passenger_details(@RequestBody Booking_page booking_page)
    {
        return new ResponseEntity<Journey_Details>(passenger_details_service.find_buses(booking_page), HttpStatus.CREATED);
    }
}
