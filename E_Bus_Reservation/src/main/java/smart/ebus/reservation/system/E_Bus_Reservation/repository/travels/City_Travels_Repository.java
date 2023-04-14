package smart.ebus.reservation.system.E_Bus_Reservation.repository.travels;

import org.springframework.data.jpa.repository.JpaRepository;
import smart.ebus.reservation.system.E_Bus_Reservation.buses.City_Travels;

import java.time.LocalDate;

public interface City_Travels_Repository extends JpaRepository<City_Travels,String> {

    City_Travels findBySourceAndDestinationAndTraveldate(String source, String destination, LocalDate traveldate);

}
