package smart.ebus.reservation.system.E_Bus_Reservation.buses;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Timer;

@Entity
@Data
public class Orange_Tour_Travels {
    @Id
    public String bus_id;
    @Column(nullable = false)
    @JsonFormat(shape = JsonFormat.Shape.ANY, pattern = "yyyy-MM-dd")
    public LocalDate traveldate;
    @Column(nullable = false)
    public String bus_timing;
    @Column(nullable = false)
    public String source;
    @Column(nullable = false)
    public String destination;
    @Column(nullable = false)
    public String destination_stop;
    @Column(nullable = false)
    public String amenities;
    @ElementCollection
    public List<String> seat_available;
    @Column(nullable = false)
    public Double bus_fare;
    @Column(nullable = false)
    public String start_time;
    @Column(nullable = false)
    public String end_time;
    @ElementCollection
    private Map<String,Integer> hotel_booked_seat;
}
