package smart.ebus.reservation.system.E_Bus_Reservation.contoller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import smart.ebus.reservation.system.E_Bus_Reservation.model.Customer_Details_Table;
import smart.ebus.reservation.system.E_Bus_Reservation.model.Forget_Password_Details;
import smart.ebus.reservation.system.E_Bus_Reservation.model.Login_Details;
import smart.ebus.reservation.system.E_Bus_Reservation.model.Login_Table;
import smart.ebus.reservation.system.E_Bus_Reservation.service.Login_Service;

@RestController
@RequestMapping("/login_details/")
public class Login_Controller {
    @Autowired
    Login_Service login_service;

    @GetMapping("/login_page/")
    public ResponseEntity<Login_Table> check_user(@RequestBody Login_Details login_details)
    {
        return new ResponseEntity<Login_Table>(login_service.user_login(login_details), HttpStatus.OK);
    }

    @PostMapping("/lofgin/forget_password/")
    public ResponseEntity<Login_Table> change_password(@RequestBody Forget_Password_Details forget_password_details)
    {
        return new ResponseEntity<Login_Table>(login_service.change_password(forget_password_details),HttpStatus.CONTINUE);
    }
}
