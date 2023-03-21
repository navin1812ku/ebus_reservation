package smart.ebus.reservation.system.E_Bus_Reservation.service.implementation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import smart.ebus.reservation.system.E_Bus_Reservation.model.Customer_Details_Table;
import smart.ebus.reservation.system.E_Bus_Reservation.model.Login_Details;
import smart.ebus.reservation.system.E_Bus_Reservation.repository.Customer_Details_Table_Repository;
import smart.ebus.reservation.system.E_Bus_Reservation.repository.Login_Table_Repository;
import smart.ebus.reservation.system.E_Bus_Reservation.service.Login_Service;

@Service
public class Login_Details_Impl implements Login_Service {
    @Autowired
    Login_Table_Repository login_table_repository;

    @Autowired
    Customer_Details_Table_Repository customer_details_table_repository;

    @Override
    public Customer_Details_Table user_login(Login_Details login_details) {
        Customer_Details_Table customer_details_table=customer_details_table_repository.getReferenceById(login_details.getUser_email_id());
        return null;
    }
}
