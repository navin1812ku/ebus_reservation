package smart.ebus.reservation.system.E_Bus_Reservation.model;


import lombok.Data;

import java.time.LocalDateTime;

@Data
public class Login_Details {
    public String user_email_id;
    public String user_password;
    public LocalDateTime login_time;
    public LocalDateTime logout_time;
}
