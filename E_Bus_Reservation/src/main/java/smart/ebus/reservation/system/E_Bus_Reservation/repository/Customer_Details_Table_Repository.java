package smart.ebus.reservation.system.E_Bus_Reservation.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import smart.ebus.reservation.system.E_Bus_Reservation.model.Customer_Details_Table;

public interface Customer_Details_Table_Repository extends JpaRepository<Customer_Details_Table,String> {
}
