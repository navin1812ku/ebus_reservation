package smart.ebus.reservation.system.E_Bus_Reservation.model;


import lombok.Data;

import java.util.Date;

@Data
public class Ticket_Booking_Request {
    private String source;
    private String destination;
    private Date travel_date;
}
