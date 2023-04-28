package smart.ebus.reservation.system.E_Bus_Reservation.contoller;


import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import smart.ebus.reservation.system.E_Bus_Reservation.entity.Journey_Details_Entity;
import smart.ebus.reservation.system.E_Bus_Reservation.entity.Passenger_Journey_Details_Entity;
import smart.ebus.reservation.system.E_Bus_Reservation.model.request.Login_Request;
import smart.ebus.reservation.system.E_Bus_Reservation.model.request.Promo_Code_Request;
import smart.ebus.reservation.system.E_Bus_Reservation.service.Payment_Details_Service;

@RestController
@RequestMapping("/payment_details/")
public class Payment_Details_Controller {

    @Autowired
    Payment_Details_Service payment_details_service;

    @Operation(summary = "Payment process",description = "Taking promo code we will generate the ticket with total amount " +
            "after reducing the amount in that Promo code.",tags = "Get")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200",description = "Final ticket amount will be calculated",
                    content = {@Content(mediaType = "application/json",
                            schema = @Schema(implementation = Promo_Code_Request.class))}),
            @ApiResponse(responseCode = "404",description = "Promo code Not Found",
                    content = @Content)
    })
    @GetMapping("total_amount/")
    public ResponseEntity<Passenger_Journey_Details_Entity> payment_details(@RequestBody Promo_Code_Request promo_code_request)
    {
        return new ResponseEntity<Passenger_Journey_Details_Entity>(payment_details_service.total_amount(promo_code_request), HttpStatus.CREATED);
    }


}
