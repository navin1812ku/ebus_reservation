package smart.ebus.reservation.system.E_Bus_Reservation.repository.travels;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import smart.ebus.reservation.system.E_Bus_Reservation.buses.Air_India_Travels;
import smart.ebus.reservation.system.E_Bus_Reservation.buses.Ganapathy_Travels;

import java.time.LocalDate;
import java.util.Date;

public interface Ganapathy_Travels_Repository extends JpaRepository<Ganapathy_Travels,String> {
    Ganapathy_Travels findBySourceAndDestinationOrTraveldate(String source, String destination, LocalDate traveldate);
}
