package smart.ebus.reservation.system.E_Bus_Reservation.service;

import smart.ebus.reservation.system.E_Bus_Reservation.model.Passenger_Journey_Details;

public interface Passenger_Details_Service {
    Passenger_Journey_Details get_passenger_journey_details(Passenger_Journey_Details journey_details);

    Passenger_Journey_Details find_buses(Passenger_Journey_Details journey_details);
}
