package smart.ebus.reservation.system.E_Bus_Reservation.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import smart.ebus.reservation.system.E_Bus_Reservation.model.Passenger_Journey_Details;

@Repository
public interface Passenger_Journey_Details_Repository extends JpaRepository<Passenger_Journey_Details,String> {
}
