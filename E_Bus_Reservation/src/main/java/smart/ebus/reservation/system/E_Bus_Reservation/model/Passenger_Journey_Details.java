package smart.ebus.reservation.system.E_Bus_Reservation.model;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "passenger_journey_details")
@Data
public class Passenger_Journey_Details {
    @Id
    private String user_email_id;
    /*@JoinColumn(name = "PNR_number")
    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Journey_Details> journey_details;*/
}
