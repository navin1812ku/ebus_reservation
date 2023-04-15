package smart.ebus.reservation.system.E_Bus_Reservation.repository.travels;

import org.springframework.data.jpa.repository.JpaRepository;
import smart.ebus.reservation.system.E_Bus_Reservation.buses.City_Travels;
import smart.ebus.reservation.system.E_Bus_Reservation.buses.Krish_Travels;

import java.time.LocalDate;
import java.util.Date;

public interface Krish_Travels_Repository extends JpaRepository<Krish_Travels,String> {
    Krish_Travels findBySourceAndDestinationOrTraveldate(String source, String destination, LocalDate traveldate);
}
