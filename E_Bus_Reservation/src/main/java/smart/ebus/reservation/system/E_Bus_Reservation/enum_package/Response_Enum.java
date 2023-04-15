package smart.ebus.reservation.system.E_Bus_Reservation.enum_package;

public enum Response_Enum {
    LOGIN_SUCCESS("User name and password matched login successfully"),
    LOGIN_FAILURE("User name and password not matched login failure"),
    PASSWORD_CHANGED("Password Changed Successfully"),
    PASSWORD_NOT_CHANGED("Security Questions Answers are not matched"),
    SIGN_UP_SUCCESSFUL("User Details Registered In DB Successsfully,Try To Login Now"),
    USER_ALREADY_EXISTS("Email Id Already Exists Try With Different One"),
    LOGOUT_SUCCESSFUL("Logged Out Successfully..."),
    BUS_DETAILS_UPDATED_SUCCESSFUL("Bus details are stored in DB successfully");
    Response_Enum(String s) {

    }
}
