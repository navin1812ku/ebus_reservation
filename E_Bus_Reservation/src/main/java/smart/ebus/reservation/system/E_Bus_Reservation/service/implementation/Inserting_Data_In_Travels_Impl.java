package smart.ebus.reservation.system.E_Bus_Reservation.service.implementation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import smart.ebus.reservation.system.E_Bus_Reservation.buses.*;
import smart.ebus.reservation.system.E_Bus_Reservation.enum_package.Response_Enum;
import smart.ebus.reservation.system.E_Bus_Reservation.model.request.Adding_Data_To_Travels_Request;
import smart.ebus.reservation.system.E_Bus_Reservation.model.response.Response;
import smart.ebus.reservation.system.E_Bus_Reservation.repository.travels.*;
import smart.ebus.reservation.system.E_Bus_Reservation.service.Adding_Data_To_Tables_Service;

@Service
public class Inserting_Data_In_Travels_Impl implements Adding_Data_To_Tables_Service {

    @Autowired
    Air_India_Travels_Repository air_india_travels_repository;

    @Autowired
    City_Travels_Repository city_travels_repository;

    @Autowired
    Essar_Travels_Repository essar_travels_repository;

    @Autowired
    Ganapathy_Travels_Repository ganapathy_travels_repository;

    @Autowired
    Krish_Travels_Repository krish_travels_repository;

    @Autowired
    Mayurra_Travels_Repository mayurra_travels_repository;

    @Autowired
    National_Travels_Repository national_travels_repository;

    @Autowired
    No_1_Air_Travels_Repository no_1_air_travels_repository;

    @Autowired
    Orange_Tour_Travels_Repository orange_tour_travels_repository;

    @Autowired
    Sri_Krishna_Travels_Repository sri_krishna_travels_repository;


    @Override
    public Response air_india_travels_details(Adding_Data_To_Travels_Request adding_data_to_travels_request) {
        Air_India_Travels air_india_travels=new Air_India_Travels();
        air_india_travels.setBus_id(adding_data_to_travels_request.getBus_id());
        air_india_travels.setTraveldate(adding_data_to_travels_request.getTraveldate());
        air_india_travels.setBus_timing(adding_data_to_travels_request.getBus_timing());
        air_india_travels.setSource(adding_data_to_travels_request.getSource());
        air_india_travels.setDestination(adding_data_to_travels_request.getDestination());
        air_india_travels.setDestination_stop(adding_data_to_travels_request.getDestination_stop());
        air_india_travels.setAmenities(adding_data_to_travels_request.getAmenities());
        air_india_travels.setSeat_available(adding_data_to_travels_request.getSeat_available());
        air_india_travels.setBus_fare(adding_data_to_travels_request.getBus_fare());
        air_india_travels.setStart_time(adding_data_to_travels_request.getStart_time());
        air_india_travels.setEnd_time(adding_data_to_travels_request.getEnd_time());
        air_india_travels.setHotel_booked_seat(adding_data_to_travels_request.getHotel_booked_seat());
        air_india_travels_repository.save(air_india_travels);

        Response response=new Response();
        response.setResponse(Response_Enum.BUS_DETAILS_UPDATED_SUCCESSFUL);
        return response;
    }

    @Override
    public Response sri_krishna_travels_travels(Adding_Data_To_Travels_Request adding_data_to_travels_request) {
        City_Travels city_travels=new City_Travels();
        city_travels.setBus_id(adding_data_to_travels_request.getBus_id());
        city_travels.setTraveldate(adding_data_to_travels_request.getTraveldate());
        city_travels.setBus_timing(adding_data_to_travels_request.getBus_timing());
        city_travels.setSource(adding_data_to_travels_request.getSource());
        city_travels.setDestination(adding_data_to_travels_request.getDestination());
        city_travels.setDestination_stop(adding_data_to_travels_request.getDestination_stop());
        city_travels.setAmenities(adding_data_to_travels_request.getAmenities());
        city_travels.setSeat_available(adding_data_to_travels_request.getSeat_available());
        city_travels.setBus_fare(adding_data_to_travels_request.getBus_fare());
        city_travels.setStart_time(adding_data_to_travels_request.getStart_time());
        city_travels.setEnd_time(adding_data_to_travels_request.getEnd_time());
        city_travels.setHotel_booked_seat(adding_data_to_travels_request.getHotel_booked_seat());
        city_travels_repository.save(city_travels);

        Response response=new Response();
        response.setResponse(Response_Enum.BUS_DETAILS_UPDATED_SUCCESSFUL);
        return response;
    }

    @Override
    public Response orange_tour_travels_details(Adding_Data_To_Travels_Request adding_data_to_travels_request) {
        Orange_Tour_Travels orange_tour_travels=new Orange_Tour_Travels();
        orange_tour_travels.setBus_id(adding_data_to_travels_request.getBus_id());
        orange_tour_travels.setTraveldate(adding_data_to_travels_request.getTraveldate());
        orange_tour_travels.setBus_timing(adding_data_to_travels_request.getBus_timing());
        orange_tour_travels.setSource(adding_data_to_travels_request.getSource());
        orange_tour_travels.setDestination(adding_data_to_travels_request.getDestination());
        orange_tour_travels.setDestination_stop(adding_data_to_travels_request.getDestination_stop());
        orange_tour_travels.setAmenities(adding_data_to_travels_request.getAmenities());
        orange_tour_travels.setSeat_available(adding_data_to_travels_request.getSeat_available());
        orange_tour_travels.setBus_fare(adding_data_to_travels_request.getBus_fare());
        orange_tour_travels.setStart_time(adding_data_to_travels_request.getStart_time());
        orange_tour_travels.setEnd_time(adding_data_to_travels_request.getEnd_time());
        orange_tour_travels.setHotel_booked_seat(adding_data_to_travels_request.getHotel_booked_seat());
        orange_tour_travels_repository.save(orange_tour_travels);

        Response response=new Response();
        response.setResponse(Response_Enum.BUS_DETAILS_UPDATED_SUCCESSFUL);
        return response;
    }

    @Override
    public Response no_1_air_travels_details(Adding_Data_To_Travels_Request adding_data_to_travels_request) {
        No_1_Air_Travels no_1_air_travels=new No_1_Air_Travels();
        no_1_air_travels.setBus_id(adding_data_to_travels_request.getBus_id());
        no_1_air_travels.setTraveldate(adding_data_to_travels_request.getTraveldate());
        no_1_air_travels.setBus_timing(adding_data_to_travels_request.getBus_timing());
        no_1_air_travels.setSource(adding_data_to_travels_request.getSource());
        no_1_air_travels.setDestination(adding_data_to_travels_request.getDestination());
        no_1_air_travels.setDestination_stop(adding_data_to_travels_request.getDestination_stop());
        no_1_air_travels.setAmenities(adding_data_to_travels_request.getAmenities());
        no_1_air_travels.setSeat_available(adding_data_to_travels_request.getSeat_available());
        no_1_air_travels.setBus_fare(adding_data_to_travels_request.getBus_fare());
        no_1_air_travels.setStart_time(adding_data_to_travels_request.getStart_time());
        no_1_air_travels.setEnd_time(adding_data_to_travels_request.getEnd_time());
        no_1_air_travels.setHotel_booked_seat(adding_data_to_travels_request.getHotel_booked_seat());
        no_1_air_travels_repository.save(no_1_air_travels);

        Response response=new Response();
        response.setResponse(Response_Enum.BUS_DETAILS_UPDATED_SUCCESSFUL);
        return response;
    }

    @Override
    public Response national_travels_details(Adding_Data_To_Travels_Request adding_data_to_travels_request) {
        National_Travels national_travels=new National_Travels();
        national_travels.setBus_id(adding_data_to_travels_request.getBus_id());
        national_travels.setTraveldate(adding_data_to_travels_request.getTraveldate());
        national_travels.setBus_timing(adding_data_to_travels_request.getBus_timing());
        national_travels.setSource(adding_data_to_travels_request.getSource());
        national_travels.setDestination(adding_data_to_travels_request.getDestination());
        national_travels.setDestination_stop(adding_data_to_travels_request.getDestination_stop());
        national_travels.setAmenities(adding_data_to_travels_request.getAmenities());
        national_travels.setSeat_available(adding_data_to_travels_request.getSeat_available());
        national_travels.setBus_fare(adding_data_to_travels_request.getBus_fare());
        national_travels.setStart_time(adding_data_to_travels_request.getStart_time());
        national_travels.setEnd_time(adding_data_to_travels_request.getEnd_time());
        national_travels.setHotel_booked_seat(adding_data_to_travels_request.getHotel_booked_seat());
        national_travels_repository.save(national_travels);

        Response response=new Response();
        response.setResponse(Response_Enum.BUS_DETAILS_UPDATED_SUCCESSFUL);
        return response;
    }

    @Override
    public Response mayurra_travels_details(Adding_Data_To_Travels_Request adding_data_to_travels_request) {
        Mayurra_Travels mayurra_travels=new Mayurra_Travels();
        mayurra_travels.setBus_id(adding_data_to_travels_request.getBus_id());
        mayurra_travels.setTraveldate(adding_data_to_travels_request.getTraveldate());
        mayurra_travels.setBus_timing(adding_data_to_travels_request.getBus_timing());
        mayurra_travels.setSource(adding_data_to_travels_request.getSource());
        mayurra_travels.setDestination(adding_data_to_travels_request.getDestination());
        mayurra_travels.setDestination_stop(adding_data_to_travels_request.getDestination_stop());
        mayurra_travels.setAmenities(adding_data_to_travels_request.getAmenities());
        mayurra_travels.setSeat_available(adding_data_to_travels_request.getSeat_available());
        mayurra_travels.setBus_fare(adding_data_to_travels_request.getBus_fare());
        mayurra_travels.setStart_time(adding_data_to_travels_request.getStart_time());
        mayurra_travels.setEnd_time(adding_data_to_travels_request.getEnd_time());
        mayurra_travels.setHotel_booked_seat(adding_data_to_travels_request.getHotel_booked_seat());
        mayurra_travels_repository.save(mayurra_travels);

        Response response=new Response();
        response.setResponse(Response_Enum.BUS_DETAILS_UPDATED_SUCCESSFUL);
        return response;
    }

    @Override
    public Response krish_travels_details(Adding_Data_To_Travels_Request adding_data_to_travels_request) {
        Krish_Travels krish_travels=new Krish_Travels();
        krish_travels.setBus_id(adding_data_to_travels_request.getBus_id());
        krish_travels.setTraveldate(adding_data_to_travels_request.getTraveldate());
        krish_travels.setBus_timing(adding_data_to_travels_request.getBus_timing());
        krish_travels.setSource(adding_data_to_travels_request.getSource());
        krish_travels.setDestination(adding_data_to_travels_request.getDestination());
        krish_travels.setDestination_stop(adding_data_to_travels_request.getDestination_stop());
        krish_travels.setAmenities(adding_data_to_travels_request.getAmenities());
        krish_travels.setSeat_available(adding_data_to_travels_request.getSeat_available());
        krish_travels.setBus_fare(adding_data_to_travels_request.getBus_fare());
        krish_travels.setStart_time(adding_data_to_travels_request.getStart_time());
        krish_travels.setEnd_time(adding_data_to_travels_request.getEnd_time());
        krish_travels.setHotel_booked_seat(adding_data_to_travels_request.getHotel_booked_seat());
        krish_travels_repository.save(krish_travels);


        Response response=new Response();
        response.setResponse(Response_Enum.BUS_DETAILS_UPDATED_SUCCESSFUL);
        return response;
    }

    @Override
    public Response ganapathy_travels_details(Adding_Data_To_Travels_Request adding_data_to_travels_request) {
        Ganapathy_Travels ganapathy_travels=new Ganapathy_Travels();
        ganapathy_travels.setBus_id(adding_data_to_travels_request.getBus_id());
        ganapathy_travels.setTraveldate(adding_data_to_travels_request.getTraveldate());
        ganapathy_travels.setBus_timing(adding_data_to_travels_request.getBus_timing());
        ganapathy_travels.setSource(adding_data_to_travels_request.getSource());
        ganapathy_travels.setDestination(adding_data_to_travels_request.getDestination());
        ganapathy_travels.setDestination_stop(adding_data_to_travels_request.getDestination_stop());
        ganapathy_travels.setAmenities(adding_data_to_travels_request.getAmenities());
        ganapathy_travels.setSeat_available(adding_data_to_travels_request.getSeat_available());
        ganapathy_travels.setBus_fare(adding_data_to_travels_request.getBus_fare());
        ganapathy_travels.setStart_time(adding_data_to_travels_request.getStart_time());
        ganapathy_travels.setEnd_time(adding_data_to_travels_request.getEnd_time());
        ganapathy_travels.setHotel_booked_seat(adding_data_to_travels_request.getHotel_booked_seat());
        ganapathy_travels_repository.save(ganapathy_travels);

        Response response=new Response();
        response.setResponse(Response_Enum.BUS_DETAILS_UPDATED_SUCCESSFUL);
        return response;
    }

    @Override
    public Response essar_travels_details(Adding_Data_To_Travels_Request adding_data_to_travels_request) {
        Essar_Travels essar_travels=new Essar_Travels();
        essar_travels.setBus_id(adding_data_to_travels_request.getBus_id());
        essar_travels.setTraveldate(adding_data_to_travels_request.getTraveldate());
        essar_travels.setBus_timing(adding_data_to_travels_request.getBus_timing());
        essar_travels.setSource(adding_data_to_travels_request.getSource());
        essar_travels.setDestination(adding_data_to_travels_request.getDestination());
        essar_travels.setDestination_stop(adding_data_to_travels_request.getDestination_stop());
        essar_travels.setAmenities(adding_data_to_travels_request.getAmenities());
        essar_travels.setSeat_available(adding_data_to_travels_request.getSeat_available());
        essar_travels.setBus_fare(adding_data_to_travels_request.getBus_fare());
        essar_travels.setStart_time(adding_data_to_travels_request.getStart_time());
        essar_travels.setEnd_time(adding_data_to_travels_request.getEnd_time());
        essar_travels.setHotel_booked_seat(adding_data_to_travels_request.getHotel_booked_seat());
        essar_travels_repository.save(essar_travels);

        Response response=new Response();
        response.setResponse(Response_Enum.BUS_DETAILS_UPDATED_SUCCESSFUL);
        return response;
    }

    @Override
    public Response city_travels_details(Adding_Data_To_Travels_Request adding_data_to_travels_request) {
        City_Travels city_travels = new City_Travels();
        city_travels.setBus_id(adding_data_to_travels_request.getBus_id());
        city_travels.setTraveldate(adding_data_to_travels_request.getTraveldate());
        city_travels.setBus_timing(adding_data_to_travels_request.getBus_timing());
        city_travels.setSource(adding_data_to_travels_request.getSource());
        city_travels.setDestination(adding_data_to_travels_request.getDestination());
        city_travels.setDestination_stop(adding_data_to_travels_request.getDestination_stop());
        city_travels.setAmenities(adding_data_to_travels_request.getAmenities());
        city_travels.setSeat_available(adding_data_to_travels_request.getSeat_available());
        city_travels.setBus_fare(adding_data_to_travels_request.getBus_fare());
        city_travels.setStart_time(adding_data_to_travels_request.getStart_time());
        city_travels.setEnd_time(adding_data_to_travels_request.getEnd_time());
        city_travels.setHotel_booked_seat(adding_data_to_travels_request.getHotel_booked_seat());
        city_travels_repository.save(city_travels);

        Response response = new Response();
        response.setResponse(Response_Enum.BUS_DETAILS_UPDATED_SUCCESSFUL);
        return response;
    }
}
