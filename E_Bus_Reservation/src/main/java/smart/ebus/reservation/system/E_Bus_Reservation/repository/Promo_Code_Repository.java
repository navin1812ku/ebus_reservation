package smart.ebus.reservation.system.E_Bus_Reservation.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import smart.ebus.reservation.system.E_Bus_Reservation.entity.Promo_Code_Entity;

public interface Promo_Code_Repository extends JpaRepository<Promo_Code_Entity,String> {
}
