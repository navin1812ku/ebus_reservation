package smart.ebus.reservation.system.E_Bus_Reservation.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class Passenger_Details {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String PNR_number;
    @Column(nullable = false)
    private String passenger_name;
    @Column(nullable = false)
    private Integer passenger_age;
    @Column(nullable = false)
    private String seat_number;
}
