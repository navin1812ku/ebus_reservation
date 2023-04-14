package smart.ebus.reservation.system.E_Bus_Reservation.model.request;


import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.ElementCollection;
import java.time.LocalDate;
import java.util.List;
import java.util.Map;

@Data
public class Adding_Data_To_Travels_Request {
    public String bus_id;
    public LocalDate traveldate;
    public String bus_timing;
    public String source;
    public String destination;
    public String destination_stop;
    public String amenities;
    public List<String> seat_available;
    public Double bus_fare;
    public String start_time;
    public String end_time;
    private Map<String,Integer> hotel_booked_seat;
}
