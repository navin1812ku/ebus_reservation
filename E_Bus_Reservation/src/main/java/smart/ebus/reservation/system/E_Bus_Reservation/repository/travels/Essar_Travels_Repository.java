package smart.ebus.reservation.system.E_Bus_Reservation.repository.travels;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import smart.ebus.reservation.system.E_Bus_Reservation.buses.Essar_Travels;

import java.time.LocalDate;

public interface Essar_Travels_Repository extends JpaRepository<Essar_Travels,String> {

    Essar_Travels findBySourceAndDestinationOrTraveldate(String source, String destination, LocalDate traveldate);
}
