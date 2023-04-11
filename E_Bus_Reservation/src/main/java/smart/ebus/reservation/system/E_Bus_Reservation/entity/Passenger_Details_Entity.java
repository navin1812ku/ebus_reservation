package smart.ebus.reservation.system.E_Bus_Reservation.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class Passenger_Details_Entity {
    @Id
    private String PNR_number;
    @Column(nullable = false)
    private String passenger_name;
    @Column(nullable = false)
    private Integer passenger_age;
    @Column(nullable = false)
    private String seat_number;
}
