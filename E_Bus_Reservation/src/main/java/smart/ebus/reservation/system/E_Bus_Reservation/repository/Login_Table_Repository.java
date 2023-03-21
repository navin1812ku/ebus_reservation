package smart.ebus.reservation.system.E_Bus_Reservation.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import smart.ebus.reservation.system.E_Bus_Reservation.model.Customer_Details_Table;
import smart.ebus.reservation.system.E_Bus_Reservation.model.Login_Table;

@Repository
public interface Login_Table_Repository extends JpaRepository<Login_Table,String> {
}
