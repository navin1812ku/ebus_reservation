package smart.ebus.reservation.system.E_Bus_Reservation.model.request;


import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;


@Data
public class Login_Request {
    @JsonProperty("user_email_id")
    public String user_email_id;
    @JsonProperty("user_password")
    public String user_password;
}
