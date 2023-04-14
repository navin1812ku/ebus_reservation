package smart.ebus.reservation.system.E_Bus_Reservation.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;

@Entity
@Data
public class Journey_Details_Entity {
    @Id
    private String user_email_id;
    @Column(nullable = false)
    private String PNR_number;
    @JoinColumn(name = "user_email_id")
    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Passenger_Details_Entity> passenger_detailEntities;
    @Column(nullable = false)
    private Long phone_number;
    @Column(nullable = false)
    private String source;
    @Column(nullable = false)
    private String destination;
    @Column(nullable = false)
    @JsonFormat(shape = JsonFormat.Shape.ANY, pattern = "yyyy-MM-dd")
    private LocalDate travel_date;
    @Column(nullable = false)
    private String bus_name;
    @Column(nullable = true)
    private Integer number_of_seats;
    @Column(nullable = false)
    private Double total_amount;
    @Column(nullable = true)
    private String payment_status;
    @Column(nullable = false)
    private Boolean offer_applied;
    @Column(nullable = true)
    private String promo_code_applied;
    @Column(nullable = false)
    private String status_of_journey;
    @Column(nullable = true)
    private Float customer_rating_out_of_5;
    @Column(nullable = true)
    private String refund_status;
    @Column(nullable = true)
    private LocalDateTime cancellation_date;
    @Column(nullable = true)
    private String reason_for_cancellation;
    @Column(nullable = true)
    private Long refund_amount;

}
