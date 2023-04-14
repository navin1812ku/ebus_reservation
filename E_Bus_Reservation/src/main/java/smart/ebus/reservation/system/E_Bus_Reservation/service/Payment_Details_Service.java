package smart.ebus.reservation.system.E_Bus_Reservation.service;


import smart.ebus.reservation.system.E_Bus_Reservation.entity.Journey_Details_Entity;
import smart.ebus.reservation.system.E_Bus_Reservation.entity.Passenger_Journey_Details_Entity;
import smart.ebus.reservation.system.E_Bus_Reservation.model.request.Promo_Code_Request;

public interface Payment_Details_Service {
    Passenger_Journey_Details_Entity total_amount(Promo_Code_Request promo_code_request);
}
