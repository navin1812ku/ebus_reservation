package smart.ebus.reservation.system.E_Bus_Reservation.repository.travels;

import org.springframework.data.jpa.repository.JpaRepository;
import smart.ebus.reservation.system.E_Bus_Reservation.buses.Air_India_Travels;

import java.time.LocalDate;
import java.util.Date;

public interface Air_India_Travels_Repository extends JpaRepository<Air_India_Travels,String> {
    //List<Laptop> findByNameAndBrand(String name, String brand);
    Air_India_Travels findBySourceAndDestinationAndTraveldate(String source, String destination, LocalDate traveldate);
}
