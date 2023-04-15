package smart.ebus.reservation.system.E_Bus_Reservation.service;

import smart.ebus.reservation.system.E_Bus_Reservation.model.request.Logout_Request;

public interface Logout_service {
    String user_logout(Logout_Request logout_request);
}
