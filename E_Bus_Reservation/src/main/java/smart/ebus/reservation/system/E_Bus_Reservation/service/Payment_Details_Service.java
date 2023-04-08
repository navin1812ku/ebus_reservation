package smart.ebus.reservation.system.E_Bus_Reservation.service;


import smart.ebus.reservation.system.E_Bus_Reservation.model.Journey_Details;

public interface Payment_Details_Service {
    Journey_Details total_amount(Journey_Details journey_details);
}
