package smart.ebus.reservation.system.E_Bus_Reservation.entity;


import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.time.LocalDate;

@Entity
@Data
public class Promo_Code_Entity {
    @Id
    private String promo_code;
    @Column(nullable = false)
    private Double discount;
    @Column(nullable = false)
    private LocalDate valid_date;
}
