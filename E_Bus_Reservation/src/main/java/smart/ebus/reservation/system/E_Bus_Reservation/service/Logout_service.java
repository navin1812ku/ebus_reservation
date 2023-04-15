package smart.ebus.reservation.system.E_Bus_Reservation.service;

import smart.ebus.reservation.system.E_Bus_Reservation.model.request.Logout_Request;
import smart.ebus.reservation.system.E_Bus_Reservation.model.response.Response;

public interface Logout_service {
    Response user_logout(Logout_Request logout_request);
}
