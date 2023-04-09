package smart.ebus.reservation.system.E_Bus_Reservation.service;

import smart.ebus.reservation.system.E_Bus_Reservation.entity.Customer_Details_Table;
import smart.ebus.reservation.system.E_Bus_Reservation.model.Sign_Up_Request;

public interface Customer_Details_Service {
    String customer_details(Sign_Up_Request sign_up_request);
}
