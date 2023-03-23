package smart.ebus.reservation.system.E_Bus_Reservation.model;


import lombok.Data;

import java.util.Date;
import java.util.List;

@Data
public class Booking_page {
    private String user_email_id;
    private List<Journey_Details> journey_details;
}
