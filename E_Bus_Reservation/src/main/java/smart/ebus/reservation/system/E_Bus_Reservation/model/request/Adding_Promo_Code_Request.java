package smart.ebus.reservation.system.E_Bus_Reservation.model.request;

import lombok.Data;

import java.time.LocalDate;

@Data
public class Adding_Promo_Code_Request {
    private Double discount;
    private LocalDate valid_date;
}
