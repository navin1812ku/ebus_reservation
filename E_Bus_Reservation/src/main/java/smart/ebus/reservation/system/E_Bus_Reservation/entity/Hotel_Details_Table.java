package smart.ebus.reservation.system.E_Bus_Reservation.entity;


import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Data
public class Hotel_Details_Table {
    @Id
    private String PNR_number;
    @Column(nullable = false)
    private Integer number_of_seats;
}
