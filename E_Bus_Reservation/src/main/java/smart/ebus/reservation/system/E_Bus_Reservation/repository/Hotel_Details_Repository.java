package smart.ebus.reservation.system.E_Bus_Reservation.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import smart.ebus.reservation.system.E_Bus_Reservation.entity.Hotel_Details_Table;

@Repository
public interface Hotel_Details_Repository extends JpaRepository<Hotel_Details_Table,String> {

}
