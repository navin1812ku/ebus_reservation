package smart.ebus.reservation.system.E_Bus_Reservation.service.implementation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import smart.ebus.reservation.system.E_Bus_Reservation.exception.User_Not_Found_Exception;
import smart.ebus.reservation.system.E_Bus_Reservation.model.Customer_Details_Table;
import smart.ebus.reservation.system.E_Bus_Reservation.model.Forget_Password_Details;
import smart.ebus.reservation.system.E_Bus_Reservation.model.Login_Details;
import smart.ebus.reservation.system.E_Bus_Reservation.model.Login_Table;
import smart.ebus.reservation.system.E_Bus_Reservation.repository.Customer_Details_Table_Repository;
import smart.ebus.reservation.system.E_Bus_Reservation.repository.Login_Table_Repository;
import smart.ebus.reservation.system.E_Bus_Reservation.service.Login_Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class Login_Details_Impl implements Login_Service {

    @Autowired
    Login_Table_Repository login_table_repository;

    @Autowired
    Customer_Details_Table_Repository customer_details_table_repository;

    @Override
    public Login_Table user_login(Login_Details login_details) {
        Login_Table login_table=login_table_repository.findById(login_details.getUser_email_id()).
                orElseThrow(() -> new User_Not_Found_Exception("Given user email id not even have an account so create an account by clicking sign_up"));
        if(login_details.getUser_password().equals(login_table.getUser_password()))
        {
            System.out.println("User name and password matched login permitted");
        }
        else
        {
            System.out.println("User name and password not matched login not permitted");
        }
        return login_table;
    }

    @Override
    public Login_Table change_password(Forget_Password_Details forget_password_details) {
        Customer_Details_Table customer_details_table = customer_details_table_repository.findById(forget_password_details.getUser_email_id())
                .orElseThrow(() -> new User_Not_Found_Exception("Given user email id not even have an account so create an account by clicking sign_up"));
        Map<String,String> Security_Question1=customer_details_table.getSecurity_Question1();
        Map<String,String> Security_Question2=customer_details_table.getSecurity_Question2();
        if(Security_Question1.get(forget_password_details.security_question1).equals(forget_password_details.getSecurity_answer1())&&
                Security_Question2.get(forget_password_details.security_question2).equals(forget_password_details.getSecurity_answer2()))
        {
            Login_Table login_table=login_table_repository.findById(forget_password_details.getUser_email_id()).
                    orElseThrow(() -> new User_Not_Found_Exception("Given user email id not even have an account so create an account by clicking sign_up"));
            login_table.setUser_password(forget_password_details.getNew_password());
            login_table_repository.save(login_table);
        }
        return null;
    }
}
