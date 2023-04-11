package smart.ebus.reservation.system.E_Bus_Reservation.model;

import lombok.Data;

import java.util.Date;

@Data
public class Getting_Journey_Request {
    private String name;
    private Integer age;
    private String pick_up;
    private String drop;
    private String bus_id;
    private Date travel_date;
    private String number_of_seats;
}
