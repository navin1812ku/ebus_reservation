package smart.ebus.reservation.system.E_Bus_Reservation.contoller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import smart.ebus.reservation.system.E_Bus_Reservation.entity.Journey_Details_Entity;
import smart.ebus.reservation.system.E_Bus_Reservation.entity.Passenger_Journey_Details_Entity;
import smart.ebus.reservation.system.E_Bus_Reservation.model.request.Promo_Code_Request;
import smart.ebus.reservation.system.E_Bus_Reservation.service.Payment_Details_Service;

@RestController
@RequestMapping("/payment_details/")
public class Payment_Details_Controller {

    @Autowired
    Payment_Details_Service payment_details_service;

    @GetMapping("total_amount/")
    public ResponseEntity<Passenger_Journey_Details_Entity> payment_details(@RequestBody Promo_Code_Request promo_code_request)
    {
        return new ResponseEntity<Passenger_Journey_Details_Entity>(payment_details_service.total_amount(promo_code_request), HttpStatus.CREATED);
    }


}
