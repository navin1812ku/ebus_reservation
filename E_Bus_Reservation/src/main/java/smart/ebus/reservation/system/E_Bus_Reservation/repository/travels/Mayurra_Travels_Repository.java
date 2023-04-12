package smart.ebus.reservation.system.E_Bus_Reservation.repository.travels;

import org.springframework.data.jpa.repository.JpaRepository;
import smart.ebus.reservation.system.E_Bus_Reservation.buses.City_Travels;
import smart.ebus.reservation.system.E_Bus_Reservation.buses.Mayurra_Travels;

import java.util.Date;
import java.util.Map;

public interface Mayurra_Travels_Repository extends JpaRepository<Mayurra_Travels,String> {
    Mayurra_Travels findBySourceAndDestinationOrTraveldate(String source, String destination, Date traveldate);
}
