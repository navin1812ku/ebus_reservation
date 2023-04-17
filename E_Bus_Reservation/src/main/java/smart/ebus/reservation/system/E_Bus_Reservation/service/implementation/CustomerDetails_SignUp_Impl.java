package smart.ebus.reservation.system.E_Bus_Reservation.service.implementation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import smart.ebus.reservation.system.E_Bus_Reservation.entity.Customer_Details_Entity;
import smart.ebus.reservation.system.E_Bus_Reservation.entity.Login_Table_Entity;
import smart.ebus.reservation.system.E_Bus_Reservation.enum_package.Response_Enum;
import smart.ebus.reservation.system.E_Bus_Reservation.model.request.Sign_Up_Request;
import smart.ebus.reservation.system.E_Bus_Reservation.model.response.Response;
import smart.ebus.reservation.system.E_Bus_Reservation.repository.Customer_Details_Table_Repository;
import smart.ebus.reservation.system.E_Bus_Reservation.repository.Login_Table_Repository;
import smart.ebus.reservation.system.E_Bus_Reservation.service.Customer_Details_Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class CustomerDetails_SignUp_Impl implements Customer_Details_Service {

    @Autowired
    Customer_Details_Table_Repository customer_details_table_repository;

    @Autowired
    Login_Table_Repository login_table_repository;

    @Override
    public Response customer_details(Sign_Up_Request sign_up_request) {
        Response response=new Response();
        //Login_Table login_table=login_table_repository.findById(sign_up_request.getUser_email_id()).isEmpty();
        if(login_table_repository.findById(sign_up_request.getUser_email_id()).isPresent())
        {
            response.setResponse(Response_Enum.USER_ALREADY_EXISTS);
            return response;
        }
        else
        {
            Login_Table_Entity login_tableEntity1 = new Login_Table_Entity();
            login_tableEntity1.setUser_email_id(sign_up_request.getUser_email_id());
            login_tableEntity1.setUser_password(sign_up_request.getPassword());

            login_table_repository.save(login_tableEntity1);

            Customer_Details_Entity customer_details_entity =new Customer_Details_Entity();
            customer_details_entity.setUser_email_id(sign_up_request.getUser_email_id());
            customer_details_entity.setFirst_name(sign_up_request.getFirst_name());
            customer_details_entity.setLast_name(sign_up_request.getLast_name());
            customer_details_entity.setGender(sign_up_request.getGender());
            customer_details_entity.setDate_of_birth(sign_up_request.getDate_of_birth());
            customer_details_entity.setPlace(sign_up_request.getPlace());
            customer_details_entity.setAadhar_number(sign_up_request.getAadhar_number());
            customer_details_entity.setPhone_number(sign_up_request.getPhone_number());

            Map<String,String> security_question1=new HashMap<>();
            security_question1.put(sign_up_request.getSecurity_Question1(), sign_up_request.getSecurity_Answer1());
            Map<String,String> security_question2=new HashMap<>();
            security_question2.put(sign_up_request.getSecurity_Question2(), sign_up_request.getSecurity_Answer2());

            customer_details_entity.setSecurity_Question1(security_question1);
            customer_details_entity.setSecurity_Question2(security_question2);

            customer_details_table_repository.save(customer_details_entity);
            response.setResponse(Response_Enum.SIGN_UP_SUCCESSFUL);
            return response;
        }
    }
}
