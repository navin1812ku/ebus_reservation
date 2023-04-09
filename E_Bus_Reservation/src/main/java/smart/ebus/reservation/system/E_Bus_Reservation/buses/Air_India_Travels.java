package smart.ebus.reservation.system.E_Bus_Reservation.buses;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;
import java.util.Map;

@Entity
@Data
public class Air_India_Travels {
    @Id
    public String bus_id;
    @Column(nullable = false)
    public Date travel_date;
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
    @Column(nullable = false)
    public String seat_available;
    @Column(nullable = false)
    public Double bus_fare;
    @ElementCollection
    private Map<String,Integer> hotel_booked_seat;
}