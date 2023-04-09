package smart.ebus.reservation.system.E_Bus_Reservation.contoller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import smart.ebus.reservation.system.E_Bus_Reservation.model.Getting_Journey_Details;
import smart.ebus.reservation.system.E_Bus_Reservation.entity.Journey_Details;
import smart.ebus.reservation.system.E_Bus_Reservation.service.Journey_Details_Service;

@RestController
@RequestMapping("/reserve_book_journey_details/")
public class Journey_Details_Controller {

    @Autowired
    Journey_Details_Service journey_details_service;

    @PostMapping("/ticket_booking/")
    public ResponseEntity<Journey_Details> journey_details(@RequestBody Getting_Journey_Details getting_journey_details)
    {
        return new ResponseEntity<Journey_Details>(journey_details_service.customer_details(getting_journey_details), HttpStatus.ACCEPTED);

    }
}
