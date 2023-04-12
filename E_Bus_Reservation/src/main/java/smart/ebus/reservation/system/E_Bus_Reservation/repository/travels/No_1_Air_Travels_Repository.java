package smart.ebus.reservation.system.E_Bus_Reservation.repository.travels;

import org.springframework.data.jpa.repository.JpaRepository;
import smart.ebus.reservation.system.E_Bus_Reservation.buses.City_Travels;
import smart.ebus.reservation.system.E_Bus_Reservation.buses.No_1_Air_Travels;

import java.util.Date;

public interface No_1_Air_Travels_Repository extends JpaRepository<No_1_Air_Travels,String> {
    No_1_Air_Travels findBySourceAndDestinationOrTraveldate(String source, String destination, Date traveldate);
}
