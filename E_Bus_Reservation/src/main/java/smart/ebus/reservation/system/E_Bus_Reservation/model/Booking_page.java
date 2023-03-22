package smart.ebus.reservation.system.E_Bus_Reservation.model;


import lombok.Data;

import java.util.Date;

@Data
public class Booking_page {
    public String source;
    public String destination;
    public Date travel_date;
}
