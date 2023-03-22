package smart.ebus.reservation.system.E_Bus_Reservation.service.implementation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import smart.ebus.reservation.system.E_Bus_Reservation.model.Customer_Details_Table;
import smart.ebus.reservation.system.E_Bus_Reservation.model.Forget_Password_Details;
import smart.ebus.reservation.system.E_Bus_Reservation.model.Login_Details;
import smart.ebus.reservation.system.E_Bus_Reservation.model.Login_Table;
import smart.ebus.reservation.system.E_Bus_Reservation.repository.Login_Table_Repository;
import smart.ebus.reservation.system.E_Bus_Reservation.service.Login_Service;

@Service
public class Login_Details_Impl implements Login_Service {
    @Autowired
    Login_Table_Repository login_table_repository;

    @Override
    public Login_Table user_login(Login_Details login_details) {
        Login_Table login_table=login_table_repository.getReferenceById(login_details.getUser_email_id());

        login_table.setLogin_time(login_details.login_time);
        login_table.setLogout_time(login_details.logout_time);
        login_table_repository.save(login_table);
        return login_table;
    }

    @Override
    public Login_Table change_password(Forget_Password_Details forget_password_details) {
        Login_Table login_table=login_table_repository.getReferenceById(forget_password_details.getUser_email_id());

        Customer_Details_Table customer_details_table = null;

        if(customer_details_table.getSecurity_Question1().get(customer_details_table.getSecurity_Question1()).equals(forget_password_details.getSecurity_answer1())
        && customer_details_table.getSecurity_Question2().get(customer_details_table.getSecurity_Question2()).equals(forget_password_details.getSecurity_answer2()))
        {
            login_table.setUser_password(forget_password_details.getNew_password());
        }
        login_table_repository.save(login_table);
        return login_table;
    }
}
