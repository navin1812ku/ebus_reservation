package smart.ebus.reservation.system.E_Bus_Reservation.service.implementation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import smart.ebus.reservation.system.E_Bus_Reservation.exception.User_Not_Found_Exception;
import smart.ebus.reservation.system.E_Bus_Reservation.entity.Customer_Details_Entity;
import smart.ebus.reservation.system.E_Bus_Reservation.model.request.Forget_Password_Request;
import smart.ebus.reservation.system.E_Bus_Reservation.model.request.Login_Request;
import smart.ebus.reservation.system.E_Bus_Reservation.entity.Login_Table_Entity;
import smart.ebus.reservation.system.E_Bus_Reservation.repository.Customer_Details_Table_Repository;
import smart.ebus.reservation.system.E_Bus_Reservation.repository.Login_Table_Repository;
import smart.ebus.reservation.system.E_Bus_Reservation.service.Login_Service;

import java.util.Date;
import java.util.Map;

@Service
public class Login_Details_Impl implements Login_Service {

    @Autowired
    Login_Table_Repository login_table_repository;

    @Autowired
    Customer_Details_Table_Repository customer_details_table_repository;

    @Override
    public String user_login(Login_Request login_request) {
        Login_Table_Entity login_tableEntity =login_table_repository.findById(login_request.getUser_email_id()).
                orElseThrow(() -> new User_Not_Found_Exception("Given user email id not even have an " +
                        "account so create an account by clicking sign_up"));
        if(login_request.getUser_password().equals(login_tableEntity.getUser_password()))
        {
            Date date = new Date();
            login_tableEntity.setLogin_time(date);
            login_table_repository.save(login_tableEntity);
            System.out.println("User name and password matched login permitted");
            return "Login Successful";
        }
        else
        {
            System.out.println("User name and password not matched login not permitted");
            return "Login Failure";
        }
    }

    @Override
    public String change_password(Forget_Password_Request forget_password_request) {
        Customer_Details_Entity customer_details_entity = customer_details_table_repository
                .findById(forget_password_request.getUser_email_id())
                .orElseThrow(() -> new User_Not_Found_Exception("Given user email id not even have an " +
                        "account so create an account by clicking sign_up"));
        Map<String,String> Security_Question1= customer_details_entity.getSecurity_Question1();
        Map<String,String> Security_Question2= customer_details_entity.getSecurity_Question2();
        if(Security_Question1.get(forget_password_request.security_question1).
                equals(forget_password_request.getSecurity_answer1())&&
                Security_Question2.get(forget_password_request.security_question2).
                        equals(forget_password_request.getSecurity_answer2()))
        {
            Login_Table_Entity login_tableEntity =login_table_repository.findById(forget_password_request.getUser_email_id()).
                    orElseThrow(() -> new User_Not_Found_Exception("Given user email id not even have an " +
                            "account so create an account by clicking sign_up"));
            login_tableEntity.setUser_password(forget_password_request.getNew_password());
            login_table_repository.save(login_tableEntity);
            return "Password Changed Successfully";
        }
        else
        {
            return "Security Questions Answers are not matched";
        }
    }
}
