package smart.ebus.reservation.system.E_Bus_Reservation.service.implementation;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import smart.ebus.reservation.system.E_Bus_Reservation.entity.Login_Table_Entity;
import smart.ebus.reservation.system.E_Bus_Reservation.model.request.Login_Request;
import smart.ebus.reservation.system.E_Bus_Reservation.model.request.Logout_Request;
import smart.ebus.reservation.system.E_Bus_Reservation.repository.Login_Table_Repository;
import smart.ebus.reservation.system.E_Bus_Reservation.service.Logout_service;

import java.util.Date;

@Service
public class Logout_Impl implements Logout_service {

    @Autowired
    Login_Table_Repository login_table_repository;

    @Override
    public String user_logout(Logout_Request logout_request) {
        Login_Table_Entity login_table_entity=login_table_repository.findById(logout_request.getUser_email_id()).orElse(null);

        Date date = new Date();

        login_table_entity.setLogout_time(date);

        login_table_repository.save(login_table_entity);

        return "Logged Out Successfully...";
    }
}
