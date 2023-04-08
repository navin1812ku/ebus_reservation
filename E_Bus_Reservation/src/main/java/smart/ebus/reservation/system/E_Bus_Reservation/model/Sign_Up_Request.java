package smart.ebus.reservation.system.E_Bus_Reservation.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.math.BigInteger;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

@Data
public class Sign_Up_Request {
    private String user_email_id;
    private String first_name;
    private String last_name;
    private String gender;
    @JsonFormat(shape = JsonFormat.Shape.ANY, pattern = "dd-MM-yyyy")
    private Date Date_of_birth;
    @JsonProperty("Place")
    private String Place;
    @JsonProperty("Aadhar_number")
    private String Aadhar_number;
    @JsonProperty("Phone_number")
    private BigInteger Phone_number;
    @JsonProperty("Security_Question1")
    private String Security_Question1;
    @JsonProperty("Security_Answer1")
    private String Security_Answer1;
    @JsonProperty("Security_Question2")
    private String Security_Question2;
    @JsonProperty("Security_Answer2")
    private String Security_Answer2;
    private String password;
}
