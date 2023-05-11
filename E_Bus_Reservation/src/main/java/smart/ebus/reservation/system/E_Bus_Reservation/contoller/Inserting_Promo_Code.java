package smart.ebus.reservation.system.E_Bus_Reservation.contoller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import smart.ebus.reservation.system.E_Bus_Reservation.entity.Promo_Code_Entity;
import smart.ebus.reservation.system.E_Bus_Reservation.enum_package.Response_Enum;
import smart.ebus.reservation.system.E_Bus_Reservation.model.request.Adding_Promo_Code_Request;
import smart.ebus.reservation.system.E_Bus_Reservation.model.response.Response;
import smart.ebus.reservation.system.E_Bus_Reservation.repository.Promo_Code_Repository;

import java.security.SecureRandom;
import java.util.Random;

@RestController
@RequestMapping("/adding")
public class Inserting_Promo_Code {

    @Autowired
    Promo_Code_Repository promo_code_repository;

    @PostMapping("/promo_code")
    public Response adding_promo_code(@RequestBody Adding_Promo_Code_Request promo_code_request)
    {
        char[] chars = "abcdefghijklmnopqrstuvwxyz1234567890".toCharArray();
        StringBuilder sb = new StringBuilder();
        Random random = new SecureRandom();
        for (int i = 0; i < 8; i++) {
            char c = chars[random.nextInt(chars.length)];
            sb.append(c);
        }
        String promo_code = sb.toString().toUpperCase();
        Promo_Code_Entity promo_code_entity=new Promo_Code_Entity();
        promo_code_entity.setPromo_code(promo_code);
        promo_code_entity.setDiscount(promo_code_request.getDiscount());
        promo_code_entity.setValid_date(promo_code_request.getValid_date());
        promo_code_repository.save(promo_code_entity);

        Response response=new Response();
        response.setResponse(Response_Enum.PROMO_CODE);
        return response;
    }
}
