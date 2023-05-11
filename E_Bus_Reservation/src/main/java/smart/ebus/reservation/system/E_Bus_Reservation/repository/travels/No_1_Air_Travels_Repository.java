package smart.ebus.reservation.system.E_Bus_Reservation.repository.travels;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import smart.ebus.reservation.system.E_Bus_Reservation.buses.City_Travels;
import smart.ebus.reservation.system.E_Bus_Reservation.buses.No_1_Air_Travels;

import java.time.LocalDate;
import java.util.Date;

public interface No_1_Air_Travels_Repository extends JpaRepository<No_1_Air_Travels,String> {
    No_1_Air_Travels findBySourceAndDestinationOrTraveldate(String source, String destination, LocalDate traveldate);
}
