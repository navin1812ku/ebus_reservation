package smart.ebus.reservation.system.E_Bus_Reservation.service;

import smart.ebus.reservation.system.E_Bus_Reservation.model.Getting_Journey_Details;
import smart.ebus.reservation.system.E_Bus_Reservation.entity.Journey_Details;

public interface Journey_Details_Service {
    Journey_Details customer_details(Getting_Journey_Details getting_journey_details);
}
