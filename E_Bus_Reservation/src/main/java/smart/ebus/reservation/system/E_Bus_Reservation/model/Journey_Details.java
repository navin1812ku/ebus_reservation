package smart.ebus.reservation.system.E_Bus_Reservation.model;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;


@Entity
@Data
public class Journey_Details {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String PNR_number;
    @JoinColumn(name = "PNR_number")
    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Passenger_Details> passenger_details;
    @Column(nullable = false)
    private Long phone_number;
    @Column(nullable = false)
    private String source;
    @Column(nullable = false)
    private String destination;
    @Column(nullable = false)
    private Date travel_date;
    @Column(nullable = false)
    private String bus_name;
    @Column(nullable = false)
    private Float total_amount;
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
