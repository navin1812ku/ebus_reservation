package smart.ebus.reservation.system.E_Bus_Reservation.contoller;


import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import smart.ebus.reservation.system.E_Bus_Reservation.entity.Passenger_Journey_Details_Entity;
import smart.ebus.reservation.system.E_Bus_Reservation.model.request.Available_Bus_Request;
import smart.ebus.reservation.system.E_Bus_Reservation.model.request.Login_Request;
import smart.ebus.reservation.system.E_Bus_Reservation.model.request.Ticket_Cancellation_Request;
import smart.ebus.reservation.system.E_Bus_Reservation.model.response.Available_Bus_Response;
import smart.ebus.reservation.system.E_Bus_Reservation.service.Ticket_Cancellation_Service;

import java.util.List;

@RestController
@RequestMapping("/ticket_cancellation/")
public class Ticket_Cancellation_Controller {

    @Autowired
    Ticket_Cancellation_Service ticket_cancellation_service;

    @Operation(summary = "Ticket cancellation process",description = "Taking user mail id we will check the " +
            "Booked ticket and we show the ticket to the user " +
            "then they can cancel the ticket following some conditions.",tags = "Get")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200",description = "Cancelling the ticket and getting the refundable amount",
                    content = {@Content(mediaType = "application/json",
                            schema = @Schema(implementation = Login_Request.class))}),
            @ApiResponse(responseCode = "404",description = "User ID Not Found",
                    content = @Content)
    })
    @GetMapping("cancelling/")
    public ResponseEntity<Passenger_Journey_Details_Entity> check_available_buses(@RequestBody Ticket_Cancellation_Request ticket_cancellation_request)
    {
        return new ResponseEntity<Passenger_Journey_Details_Entity>(ticket_cancellation_service.cancelling_ticket(ticket_cancellation_request), HttpStatus.ACCEPTED);
    }
}
