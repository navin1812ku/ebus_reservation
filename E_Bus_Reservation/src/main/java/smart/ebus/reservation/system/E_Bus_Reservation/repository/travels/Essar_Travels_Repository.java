package smart.ebus.reservation.system.E_Bus_Reservation.repository.travels;

import org.springframework.data.jpa.repository.JpaRepository;
import smart.ebus.reservation.system.E_Bus_Reservation.buses.Air_India_Travels;
import smart.ebus.reservation.system.E_Bus_Reservation.buses.Essar_Travels;

import java.time.LocalDate;
import java.util.Date;

public interface Essar_Travels_Repository extends JpaRepository<Essar_Travels,String> {

    Essar_Travels findBySourceAndDestinationOrTraveldate(String source, String destination, LocalDate traveldate);
}
