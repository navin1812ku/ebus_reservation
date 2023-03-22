package smart.ebus.reservation.system.E_Bus_Reservation.service.implementation;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import smart.ebus.reservation.system.E_Bus_Reservation.model.Customer_Details_Table;
import smart.ebus.reservation.system.E_Bus_Reservation.repository.Customer_Details_Table_Repository;
import smart.ebus.reservation.system.E_Bus_Reservation.repository.Login_Table_Repository;
import smart.ebus.reservation.system.E_Bus_Reservation.service.Customer_Details_Service;

@Service
public class CustomerDetails_Impl implements Customer_Details_Service {

    @Autowired
    public Customer_Details_Table_Repository customer_details_table_repository;

    @Override
    public Customer_Details_Table customer_details(Customer_Details_Table customer_details_table) {
        return customer_details_table_repository.save(customer_details_table);
    }
}
