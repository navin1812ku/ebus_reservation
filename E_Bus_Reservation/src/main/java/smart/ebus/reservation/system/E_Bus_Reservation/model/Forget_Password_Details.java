package smart.ebus.reservation.system.E_Bus_Reservation.model;


import lombok.Data;

@Data
public class Forget_Password_Details {
    public String user_email_id;
    public String security_answer1;
    public String security_answer2;
    public String new_password;
}