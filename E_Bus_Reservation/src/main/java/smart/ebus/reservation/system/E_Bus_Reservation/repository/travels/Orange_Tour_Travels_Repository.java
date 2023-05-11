package smart.ebus.reservation.system.E_Bus_Reservation.repository.travels;

import org.aspectj.weaver.ast.Or;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import smart.ebus.reservation.system.E_Bus_Reservation.buses.City_Travels;
import smart.ebus.reservation.system.E_Bus_Reservation.buses.Orange_Tour_Travels;

import java.time.LocalDate;
import java.util.Date;

public interface Orange_Tour_Travels_Repository extends JpaRepository<Orange_Tour_Travels,String> {

    Orange_Tour_Travels findBySourceAndDestinationOrTraveldate(String source, String destination, LocalDate traveldate);

}
