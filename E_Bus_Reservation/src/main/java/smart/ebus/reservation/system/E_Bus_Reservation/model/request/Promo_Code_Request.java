package smart.ebus.reservation.system.E_Bus_Reservation.model.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class Promo_Code_Request {
    private String user_email_id;
    @JsonProperty("PNR_Number")
    private String PNR_Number;
    private String promo_code;
}
