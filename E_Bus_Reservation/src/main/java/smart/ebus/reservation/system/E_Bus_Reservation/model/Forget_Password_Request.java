package smart.ebus.reservation.system.E_Bus_Reservation.model;

import lombok.Data;

@Data
public class Forget_Password_Request {
    public String user_email_id;
    public String security_question1;
    public String security_answer1;
    public String security_question2;
    public String security_answer2;
    public String new_password;
}
