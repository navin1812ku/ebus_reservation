package smart.ebus.reservation.system.E_Bus_Reservation.model.request;

import lombok.Data;

import java.util.Date;

@Data
public class Available_Bus_Request {
    private String source;
    private String destination;
    private Date travel_date;
}