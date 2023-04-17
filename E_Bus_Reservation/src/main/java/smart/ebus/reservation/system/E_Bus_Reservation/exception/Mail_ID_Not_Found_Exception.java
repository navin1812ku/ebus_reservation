package smart.ebus.reservation.system.E_Bus_Reservation.exception;

public class Mail_ID_Not_Found_Exception extends RuntimeException{
    private String user_mail_id;

    public Mail_ID_Not_Found_Exception(String message) {
        super(message);
    }

    public String getUser_mail_id() {
        return user_mail_id;
    }

    public void setUser_mail_id(String user_mail_id) {
        this.user_mail_id = user_mail_id;
    }
}
