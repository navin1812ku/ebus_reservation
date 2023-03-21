package smart.ebus.reservation.system.E_Bus_Reservation.model;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Data
public class Passenger_Details {
    @Id
    private String PNR_number;
    @Column(nullable = false)
    private String passenger_name;
    @Column(nullable = false)
    private String seat_number;
}
