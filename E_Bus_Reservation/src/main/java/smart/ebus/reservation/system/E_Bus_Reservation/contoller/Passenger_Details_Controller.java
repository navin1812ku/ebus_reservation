package smart.ebus.reservation.system.E_Bus_Reservation.contoller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import smart.ebus.reservation.system.E_Bus_Reservation.entity.Passenger_Journey_Details_Entity;
import smart.ebus.reservation.system.E_Bus_Reservation.service.Passenger_Details_Service;

@RestController
@RequestMapping("/passenger_details")
public class Passenger_Details_Controller {
    @Autowired
    Passenger_Details_Service passenger_details_service;



    @PostMapping("/passenger_details")
    public ResponseEntity<Passenger_Journey_Details_Entity> passenger_details(@RequestBody Passenger_Journey_Details_Entity passenger_journey_detailsEntity)
    {
        return new ResponseEntity<Passenger_Journey_Details_Entity>(passenger_details_service.passengers_details(passenger_journey_detailsEntity), HttpStatus.CREATED);
    }
}
