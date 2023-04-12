package smart.ebus.reservation.system.E_Bus_Reservation.contoller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import smart.ebus.reservation.system.E_Bus_Reservation.model.request.Available_Bus_Request;
import smart.ebus.reservation.system.E_Bus_Reservation.model.response.Available_Bus_Response;
import smart.ebus.reservation.system.E_Bus_Reservation.service.Check_Bus_Availability_Service;

import java.util.List;

@RestController
@RequestMapping("/check_bus_availability/")
public class Check_Bus_Availability_Controller {

    @Autowired
    Check_Bus_Availability_Service check_bus_availability_service;

    @GetMapping("/available_buses/")
    public ResponseEntity<List<Available_Bus_Response>> check_available_buses(@RequestBody Available_Bus_Request available_bus_request)
    {
        return new ResponseEntity<List<Available_Bus_Response>>(check_bus_availability_service.check_bus_availability(available_bus_request), HttpStatus.ACCEPTED);
    }
}
