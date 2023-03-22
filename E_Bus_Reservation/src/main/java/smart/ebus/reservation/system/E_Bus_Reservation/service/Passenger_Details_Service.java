package smart.ebus.reservation.system.E_Bus_Reservation.service;

import smart.ebus.reservation.system.E_Bus_Reservation.model.Booking_page;
import smart.ebus.reservation.system.E_Bus_Reservation.model.Journey_Details;
import smart.ebus.reservation.system.E_Bus_Reservation.model.Passenger_Journey_Details;

public interface Passenger_Details_Service {

    Journey_Details find_buses(Booking_page booking_page);
}
