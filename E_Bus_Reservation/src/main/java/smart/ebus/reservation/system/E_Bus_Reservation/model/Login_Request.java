package smart.ebus.reservation.system.E_Bus_Reservation.model;


import lombok.Data;


@Data
public class Login_Request {
    public String user_email_id;
    public String user_password;
}
