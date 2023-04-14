package smart.ebus.reservation.system.E_Bus_Reservation.model.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.time.LocalDate;
import java.util.Date;

@Data
public class Getting_Journey_Request {
    @JsonProperty("user_mail_id")
    private String user_mail_id;
    @JsonProperty("PNRNumber")
    private String PNRNumber;
    @JsonProperty("name")
    private String name;
    @JsonProperty("age")
    private Integer age;
    @JsonProperty("seat_number")
    private String seat_number;
    @JsonProperty("phone_number")
    private Long phone_number;
    @JsonProperty("pick_up")
    private String pick_up;
    @JsonProperty("drop")
    private String drop;
    @JsonProperty("bus_id")
    private String bus_id;
    @JsonProperty("travel_date")
    private LocalDate travel_date;
    @JsonProperty("number_of_seats")
    private Integer number_of_seats;
    @JsonProperty("bus_fare_per_person")
    private Double bus_fare_per_person;
}
