package smart.ebus.reservation.system.E_Bus_Reservation.contoller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import smart.ebus.reservation.system.E_Bus_Reservation.model.Forget_Password_Request;
import smart.ebus.reservation.system.E_Bus_Reservation.model.Login_Request;
import smart.ebus.reservation.system.E_Bus_Reservation.service.Login_Service;

@RestController
@RequestMapping("/login_details/")
public class Login_Controller {
    @Autowired
    Login_Service login_service;

    @GetMapping("/login_page/")
    public ResponseEntity<String> check_user(@RequestBody Login_Request login_request)
    {
        return new ResponseEntity<String>(login_service.user_login(login_request), HttpStatus.OK);
    }

    @PutMapping("/login/forget_password/")
    public ResponseEntity<String> change_password(@RequestBody Forget_Password_Request forget_password_request)
    {
        return new ResponseEntity<String>(login_service.change_password(forget_password_request),HttpStatus.CONTINUE);
    }
}
