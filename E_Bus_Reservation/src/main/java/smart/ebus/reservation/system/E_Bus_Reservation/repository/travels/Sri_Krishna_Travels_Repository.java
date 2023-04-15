package smart.ebus.reservation.system.E_Bus_Reservation.repository.travels;

import org.springframework.data.jpa.repository.JpaRepository;
import smart.ebus.reservation.system.E_Bus_Reservation.buses.City_Travels;
import smart.ebus.reservation.system.E_Bus_Reservation.buses.Sri_Krishna_Travels;

import java.time.LocalDate;
import java.util.Date;

public interface Sri_Krishna_Travels_Repository extends JpaRepository<Sri_Krishna_Travels,String> {

    Sri_Krishna_Travels findBySourceAndDestinationOrTraveldate(String source, String destination, LocalDate traveldate);
}
