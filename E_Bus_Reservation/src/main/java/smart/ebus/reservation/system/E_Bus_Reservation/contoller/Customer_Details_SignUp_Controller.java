package smart.ebus.reservation.system.E_Bus_Reservation.contoller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import smart.ebus.reservation.system.E_Bus_Reservation.model.request.Sign_Up_Request;
import smart.ebus.reservation.system.E_Bus_Reservation.service.Customer_Details_Service;

@RestController
@RequestMapping("/customer_details/")
public class Customer_Details_SignUp_Controller {
    @Autowired
    Customer_Details_Service customer_details_service;

    @PostMapping("/sign_up_page/")
    public ResponseEntity<String> new_customer_details(@RequestBody Sign_Up_Request sign_up_request)
    {
        return new ResponseEntity<String>(customer_details_service.customer_details(sign_up_request), HttpStatus.ACCEPTED);
    }
}
