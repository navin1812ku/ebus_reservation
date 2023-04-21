package smart.ebus.reservation.system.E_Bus_Reservation.model.response;


import lombok.Data;

import java.util.List;

@Data
public class Available_Bus_Response {
    private String bus_name;
    private List<String> seat_available;
    private Double bus_fare;
    private String bus_amenities;
    private String start_time;
    private String end_time;
}
