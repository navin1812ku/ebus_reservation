package smart.ebus.reservation.system.E_Bus_Reservation.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import smart.ebus.reservation.system.E_Bus_Reservation.model.Customer_Details_Table;

@Repository
public interface Customer_Details_Table_Repository extends JpaRepository<Customer_Details_Table,String> {
}
