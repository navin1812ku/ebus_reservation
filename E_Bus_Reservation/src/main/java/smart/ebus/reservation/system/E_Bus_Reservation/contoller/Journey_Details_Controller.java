package smart.ebus.reservation.system.E_Bus_Reservation.contoller;


import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import smart.ebus.reservation.system.E_Bus_Reservation.entity.Passenger_Journey_Details_Entity;
import smart.ebus.reservation.system.E_Bus_Reservation.model.request.Getting_Journey_Request;
import smart.ebus.reservation.system.E_Bus_Reservation.model.request.Login_Request;
import smart.ebus.reservation.system.E_Bus_Reservation.service.Passenger_Journey_Details_Service;

@RestController
@RequestMapping("/reserve_book_journey_details/")
public class Journey_Details_Controller {

    @Autowired
    Passenger_Journey_Details_Service passenger_journey_details_service;

    @Operation(summary = "Journey Details getting process",description = "king name, age, pickup and drop point we will " +
            "generate the ticket for the passengers with given information. While booking ticket we will give the option " +
            "to reserve the seat in the hotel for food during journey. " +
            "Taking option and number of seats we reserve the seat in the hotel as they requested.",tags = "Post")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200",description = "Getting passenger details",
                    content = {@Content(mediaType = "application/json",
                            schema = @Schema(implementation = Login_Request.class))}),
            @ApiResponse(responseCode = "404",description = "User ID Not Found",
                    content = @Content)
    })

    @PostMapping("ticket_booking/")
    public ResponseEntity<Passenger_Journey_Details_Entity> journey_details(@RequestBody Getting_Journey_Request getting_journey_request)
    {
        return new ResponseEntity<Passenger_Journey_Details_Entity>(passenger_journey_details_service.customer_details(getting_journey_request), HttpStatus.ACCEPTED);

    }
}
