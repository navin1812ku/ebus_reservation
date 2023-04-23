package smart.ebus.reservation.system.E_Bus_Reservation.contoller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import smart.ebus.reservation.system.E_Bus_Reservation.entity.Passenger_Journey_Details_Entity;
import smart.ebus.reservation.system.E_Bus_Reservation.model.request.Getting_Journey_Request;
import smart.ebus.reservation.system.E_Bus_Reservation.service.Passenger_Journey_Details_Service;

@RestController
@RequestMapping("/reserve_book_journey_details/")
public class Journey_Details_Controller {

    @Autowired
    Passenger_Journey_Details_Service passenger_journey_details_service;

    @PostMapping("ticket_booking/")
    public ResponseEntity<Passenger_Journey_Details_Entity> journey_details(@RequestBody Getting_Journey_Request getting_journey_request)
    {
        return new ResponseEntity<Passenger_Journey_Details_Entity>(passenger_journey_details_service.customer_details(getting_journey_request), HttpStatus.ACCEPTED);

    }
}
