package smart.ebus.reservation.system.E_Bus_Reservation.service;

import smart.ebus.reservation.system.E_Bus_Reservation.model.Customer_Details_Table;
import smart.ebus.reservation.system.E_Bus_Reservation.model.Forget_Password_Details;
import smart.ebus.reservation.system.E_Bus_Reservation.model.Login_Details;
import smart.ebus.reservation.system.E_Bus_Reservation.model.Login_Table;

public interface Login_Service {
    Login_Table user_login(Login_Details login_details);

    Login_Table change_password(Forget_Password_Details forget_password_details);
}
