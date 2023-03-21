package smart.ebus.reservation.system.E_Bus_Reservation.contoller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import smart.ebus.reservation.system.E_Bus_Reservation.model.Customer_Details_Table;
import smart.ebus.reservation.system.E_Bus_Reservation.service.Customer_Details_Service;

@RestController
@RequestMapping("/customer_details/")
public class Customer_Details_Controller {
    @Autowired
    Customer_Details_Service smart_eBus_reservationService;

    @PostMapping("/sign_up_page/")
    public ResponseEntity<Customer_Details_Table> new_customer_details(@RequestBody Customer_Details_Table customer_details_table)
    {
        return new ResponseEntity<Customer_Details_Table>(smart_eBus_reservationService.customer_details(customer_details_table), HttpStatus.ACCEPTED);
    }
}
