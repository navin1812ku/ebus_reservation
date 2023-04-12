package smart.ebus.reservation.system.E_Bus_Reservation.service;


import smart.ebus.reservation.system.E_Bus_Reservation.model.request.Available_Bus_Request;
import smart.ebus.reservation.system.E_Bus_Reservation.model.response.Available_Bus_Response;

import java.util.List;

public interface Check_Bus_Availability_Service {
    public List<Available_Bus_Response> check_bus_availability(Available_Bus_Request available_bus_request);
}
