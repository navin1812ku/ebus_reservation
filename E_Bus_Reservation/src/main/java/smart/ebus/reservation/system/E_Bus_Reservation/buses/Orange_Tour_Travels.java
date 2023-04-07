package smart.ebus.reservation.system.E_Bus_Reservation.buses;

import javax.persistence.Column;
import java.util.Date;
import java.util.Timer;

public class Orange_Tour_Travels {
    @Column(nullable = false)
    public Date travel_date;
    @Column(nullable = false)
    public Timer bus_timing;
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
}
