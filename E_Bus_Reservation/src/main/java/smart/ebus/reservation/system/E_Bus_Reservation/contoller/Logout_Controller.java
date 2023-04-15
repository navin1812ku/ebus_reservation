package smart.ebus.reservation.system.E_Bus_Reservation.contoller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import smart.ebus.reservation.system.E_Bus_Reservation.model.request.Login_Request;
import smart.ebus.reservation.system.E_Bus_Reservation.model.request.Logout_Request;
import smart.ebus.reservation.system.E_Bus_Reservation.model.response.Response;
import smart.ebus.reservation.system.E_Bus_Reservation.service.Logout_service;

@RestController
@RequestMapping("/log_out/")
public class Logout_Controller {

    @Autowired
    Logout_service logout_service;

    @PutMapping("process/")
    public ResponseEntity<Response> check_user(@RequestBody Logout_Request logout_request)
    {
        return new ResponseEntity<Response>(logout_service.user_logout(logout_request), HttpStatus.ACCEPTED);
    }

}
