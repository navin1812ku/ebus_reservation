package smart.ebus.reservation.system.E_Bus_Reservation.contoller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import smart.ebus.reservation.system.E_Bus_Reservation.model.request.Adding_Data_To_Travels_Request;
import smart.ebus.reservation.system.E_Bus_Reservation.service.Adding_Data_To_Tables_Service;

@RestController
@RequestMapping("/adding_data/")
public class Inserting_Data_To_Entities_Controller {

    @Autowired
    Adding_Data_To_Tables_Service adding_data_to_tables_service;

    @PostMapping("/air_india_travels/")
    public ResponseEntity<String> air_india_travels(@RequestBody Adding_Data_To_Travels_Request adding_data_to_travels_request)
    {
        return new ResponseEntity<String>(adding_data_to_tables_service.air_india_travels_details(adding_data_to_travels_request), HttpStatus.ACCEPTED);
    }

    @PostMapping("/city_travels/")
    public ResponseEntity<String> city_travels(@RequestBody Adding_Data_To_Travels_Request adding_data_to_travels_request)
    {
        return new ResponseEntity<String>(adding_data_to_tables_service.city_travels_details(adding_data_to_travels_request), HttpStatus.ACCEPTED);
    }

    @PostMapping("/essar_travels/")
    public ResponseEntity<String> essar_travels(@RequestBody Adding_Data_To_Travels_Request adding_data_to_travels_request)
    {
        return new ResponseEntity<String>(adding_data_to_tables_service.essar_travels_details(adding_data_to_travels_request), HttpStatus.ACCEPTED);
    }

    @PostMapping("/ganapathy_travels/")
    public ResponseEntity<String> ganapathy_travels(@RequestBody Adding_Data_To_Travels_Request adding_data_to_travels_request)
    {
        return new ResponseEntity<String>(adding_data_to_tables_service.ganapathy_travels_details(adding_data_to_travels_request), HttpStatus.ACCEPTED);
    }

    @PostMapping("/krish_travels/")
    public ResponseEntity<String> krish_travels(@RequestBody Adding_Data_To_Travels_Request adding_data_to_travels_request)
    {
        return new ResponseEntity<String>(adding_data_to_tables_service.krish_travels_details(adding_data_to_travels_request), HttpStatus.ACCEPTED);
    }

    @PostMapping("/mayurra_travels/")
    public ResponseEntity<String> mayurra_travels(@RequestBody Adding_Data_To_Travels_Request adding_data_to_travels_request)
    {
        return new ResponseEntity<String>(adding_data_to_tables_service.mayurra_travels_details(adding_data_to_travels_request), HttpStatus.ACCEPTED);
    }

    @PostMapping("/national_travels/")
    public ResponseEntity<String> national_travels(@RequestBody Adding_Data_To_Travels_Request adding_data_to_travels_request)
    {
        return new ResponseEntity<String>(adding_data_to_tables_service.national_travels_details(adding_data_to_travels_request), HttpStatus.ACCEPTED);
    }

    @PostMapping("/no_1_air_travels/")
    public ResponseEntity<String> no_1_air_travels(@RequestBody Adding_Data_To_Travels_Request adding_data_to_travels_request)
    {
        return new ResponseEntity<String>(adding_data_to_tables_service.no_1_air_travels_details(adding_data_to_travels_request), HttpStatus.ACCEPTED);
    }

    @PostMapping("/orange_tour_travels/")
    public ResponseEntity<String> orange_tour_travels(@RequestBody Adding_Data_To_Travels_Request adding_data_to_travels_request)
    {
        return new ResponseEntity<String>(adding_data_to_tables_service.orange_tour_travels_details(adding_data_to_travels_request), HttpStatus.ACCEPTED);
    }

    @PostMapping("/sri_krishna_travels/")
    public ResponseEntity<String> sri_krishna_travels(@RequestBody Adding_Data_To_Travels_Request adding_data_to_travels_request)
    {
        return new ResponseEntity<String>(adding_data_to_tables_service.sri_krishna_travels_travels(adding_data_to_travels_request), HttpStatus.ACCEPTED);
    }

}
