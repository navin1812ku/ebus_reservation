package smart.ebus.reservation.system.E_Bus_Reservation.model;

import lombok.Data;

@Data
public class Getting_Journey_Details {
    private String name;
    private Integer age;
    private String pick_up;
    private String drop;
    private Boolean AC_type;
    private String number_of_seats;
}
