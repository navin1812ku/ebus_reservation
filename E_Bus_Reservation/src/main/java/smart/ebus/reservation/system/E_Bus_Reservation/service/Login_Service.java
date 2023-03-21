package smart.ebus.reservation.system.E_Bus_Reservation.service;

import smart.ebus.reservation.system.E_Bus_Reservation.model.Customer_Details_Table;
import smart.ebus.reservation.system.E_Bus_Reservation.model.Login_Details;

public interface Login_Service {
    Customer_Details_Table user_login(Login_Details login_details);
}
