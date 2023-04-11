package smart.ebus.reservation.system.E_Bus_Reservation.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import smart.ebus.reservation.system.E_Bus_Reservation.entity.Customer_Details_Entity;

@Repository
public interface Customer_Details_Table_Repository extends JpaRepository<Customer_Details_Entity,String> {
}
