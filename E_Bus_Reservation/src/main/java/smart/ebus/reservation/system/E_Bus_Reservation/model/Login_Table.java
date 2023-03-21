package smart.ebus.reservation.system.E_Bus_Reservation.model;

import lombok.Data;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.LocalDateTime;

@Entity
@Table(name = "login_table")
@Data
public class Login_Table {
    @Id
    @Column(nullable = false)
    String user_email_id;
    @Column(nullable = false)
    String user_password;
    @Column(nullable = false)
    LocalDateTime login_time;
    @Column(nullable = false)
    LocalDateTime logout_time;
    //
}
