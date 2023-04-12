package smart.ebus.reservation.system.E_Bus_Reservation.service;

import smart.ebus.reservation.system.E_Bus_Reservation.model.request.Forget_Password_Request;
import smart.ebus.reservation.system.E_Bus_Reservation.model.request.Login_Request;

public interface Login_Service {
    String user_login(Login_Request login_request);

    String change_password(Forget_Password_Request forget_password_request);
}
