package smart.ebus.reservation.system.E_Bus_Reservation.contoller;


import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import smart.ebus.reservation.system.E_Bus_Reservation.model.request.Forget_Password_Request;
import smart.ebus.reservation.system.E_Bus_Reservation.model.request.Login_Request;
import smart.ebus.reservation.system.E_Bus_Reservation.model.response.Response;
import smart.ebus.reservation.system.E_Bus_Reservation.service.Login_Service;


@RestController
@RequestMapping("/login/")
public class Login_Controller {
    @Autowired
    Login_Service login_service;

    @Operation(summary = "Login process",description = "Taking the username and password as the parameter and " +
            "check against the DB to check valid user or not.",tags = "Get")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200",description = "Found the user",
                    content = {@Content(mediaType = "application/json",
                            schema = @Schema(implementation = Login_Request.class))}),
            @ApiResponse(responseCode = "404",description = "User Not Found",
                    content = @Content)
    })
    @GetMapping("login_page/")
    public ResponseEntity<Response> check_user(@RequestBody Login_Request login_request)
    {
        return new ResponseEntity<Response>(login_service.user_login(login_request), HttpStatus.OK);
    }

    @Operation(summary = "Forget password process",description = "Taking user_mail_id as a input and check if it is existing user " +
            "then they can able to reset password either with OTP nor with security questions. ",tags = "Put")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200",description = "User password changed successfully",
                    content = {@Content(mediaType = "application/json",
                            schema = @Schema(implementation = Login_Request.class))}),
            @ApiResponse(responseCode = "404",description = "User Not Found",
                    content = @Content)
    })
    @PutMapping("forget_password/")
    public ResponseEntity<Response> change_password(@RequestBody Forget_Password_Request forget_password_request)
    {
        return new ResponseEntity<Response>(login_service.change_password(forget_password_request),HttpStatus.CONTINUE);
    }
}
