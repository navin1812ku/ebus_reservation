package smart.ebus.reservation.system.E_Bus_Reservation.exception;



public class User_Not_Found_Exception extends RuntimeException{
    public String user_mail_id;

    public String getUser_mail_id() {
        return user_mail_id;
    }

    public void setUser_mail_id(String user_mail_id) {
        this.user_mail_id = user_mail_id;
    }
    public User_Not_Found_Exception(String message) {
        super("Given user email id not even have an account so create an account by clicking sign_up");
    }
}
