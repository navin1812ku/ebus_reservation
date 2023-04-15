package smart.ebus.reservation.system.E_Bus_Reservation.model.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.time.LocalTime;

@Data
public class Ticket_Cancellation_Request {
    private String user_email_id;
    @JsonProperty("PNR_Number")
    private String PNR_Number;
    private String reason_for_cancellation;
}
