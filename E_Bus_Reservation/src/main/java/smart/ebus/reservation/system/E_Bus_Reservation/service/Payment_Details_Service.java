package smart.ebus.reservation.system.E_Bus_Reservation.service;


import smart.ebus.reservation.system.E_Bus_Reservation.entity.Journey_Details_Entity;

public interface Payment_Details_Service {
    Journey_Details_Entity total_amount(Journey_Details_Entity journey_detailsEntity);
}
