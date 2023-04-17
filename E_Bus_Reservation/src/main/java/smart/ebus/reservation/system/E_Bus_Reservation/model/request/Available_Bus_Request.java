package smart.ebus.reservation.system.E_Bus_Reservation.model.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.time.LocalDate;
import java.util.Date;

@Data
public class Available_Bus_Request {
    private String source;
    private String destination;
    @JsonProperty("travel_date")
    private LocalDate traveldate;
}
