package smart.ebus.reservation.system.E_Bus_Reservation.repository.travels;

import org.springframework.data.jpa.repository.JpaRepository;
import smart.ebus.reservation.system.E_Bus_Reservation.buses.City_Travels;
import smart.ebus.reservation.system.E_Bus_Reservation.buses.National_Travels;

import java.util.Date;

public interface National_Travels_Repository extends JpaRepository<National_Travels,String> {
    National_Travels findBySourceAndDestinationOrTraveldate(String source, String destination, Date traveldate);
}
