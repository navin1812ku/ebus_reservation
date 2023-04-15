package smart.ebus.reservation.system.E_Bus_Reservation.service;

import smart.ebus.reservation.system.E_Bus_Reservation.model.request.Sign_Up_Request;
import smart.ebus.reservation.system.E_Bus_Reservation.model.response.Response;

public interface Customer_Details_Service {
    Response customer_details(Sign_Up_Request sign_up_request);
}
