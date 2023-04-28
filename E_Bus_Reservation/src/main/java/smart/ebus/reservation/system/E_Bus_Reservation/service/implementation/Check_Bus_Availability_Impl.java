package smart.ebus.reservation.system.E_Bus_Reservation.service.implementation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import smart.ebus.reservation.system.E_Bus_Reservation.buses.*;
import smart.ebus.reservation.system.E_Bus_Reservation.model.request.Available_Bus_Request;
import smart.ebus.reservation.system.E_Bus_Reservation.model.response.Available_Bus_Response;
import smart.ebus.reservation.system.E_Bus_Reservation.repository.travels.*;
import smart.ebus.reservation.system.E_Bus_Reservation.service.Check_Bus_Availability_Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class Check_Bus_Availability_Impl implements Check_Bus_Availability_Service {

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
    public List<Available_Bus_Response> check_bus_availability(Available_Bus_Request available_bus_request) {
        List<Available_Bus_Response> available_bus_responses_list=new ArrayList<>();
        Air_India_Travels air_india_travels=air_india_travels_repository.findBySourceAndDestinationAndTraveldate(available_bus_request.getSource(),available_bus_request.getDestination(),available_bus_request.getTraveldate());
        available_bus_responses_list.add(create_object_of_available_buses(air_india_travels.getBus_id(),air_india_travels.getSeat_available(),
                air_india_travels.getAmenities(), air_india_travels.getStart_time(),air_india_travels.getEnd_time(),air_india_travels.getBus_fare()));

       /* City_Travels city_travels=city_travels_repository.findBySourceAndDestinationAndTraveldate(available_bus_request.getSource(),available_bus_request.getDestination(),available_bus_request.getTraveldate());
        available_bus_responses_list.add(create_object_of_available_buses(city_travels.getBus_id(),city_travels.getSeat_available(),
                city_travels.getAmenities(),city_travels.getStart_time(),city_travels.getEnd_time(),city_travels.getBus_fare()));

        Essar_Travels essar_travels=essar_travels_repository.findBySourceAndDestinationOrTraveldate(available_bus_request.getSource(),available_bus_request.getDestination(),available_bus_request.getTraveldate());
        available_bus_responses_list.add(create_object_of_available_buses(essar_travels.getBus_id(),essar_travels.getSeat_available(),
                essar_travels.getAmenities(),essar_travels.getStart_time(),essar_travels.getEnd_time(),essar_travels.getBus_fare()));

        Ganapathy_Travels ganapathy_travels=ganapathy_travels_repository.findBySourceAndDestinationOrTraveldate(available_bus_request.getSource(),available_bus_request.getDestination(),available_bus_request.getTraveldate());
        available_bus_responses_list.add(create_object_of_available_buses(ganapathy_travels.getBus_id(),ganapathy_travels.getSeat_available(),
                ganapathy_travels.getAmenities(),ganapathy_travels.getStart_time(),ganapathy_travels.getEnd_time(),ganapathy_travels.getBus_fare()));

       Krish_Travels krish_travels=krish_travels_repository.findBySourceAndDestinationOrTraveldate(available_bus_request.getSource(),available_bus_request.getDestination(),available_bus_request.getTraveldate());
        available_bus_responses_list.add(create_object_of_available_buses(krish_travels.getBus_id(),krish_travels.getSeat_available(),
                krish_travels.getAmenities(),krish_travels.getStart_time(),krish_travels.getEnd_time(),krish_travels.getBus_fare()));

        Mayurra_Travels mayurra_travels=mayurra_travels_repository.findBySourceAndDestinationOrTraveldate(available_bus_request.getSource(),available_bus_request.getDestination(),available_bus_request.getTraveldate());
        available_bus_responses_list.add(create_object_of_available_buses(mayurra_travels.getBus_id(),mayurra_travels.getSeat_available(),
                mayurra_travels.getAmenities(),mayurra_travels.getStart_time(),mayurra_travels.getEnd_time(),mayurra_travels.getBus_fare()));

        National_Travels national_travels=national_travels_repository.findBySourceAndDestinationOrTraveldate(available_bus_request.getSource(),available_bus_request.getDestination(),available_bus_request.getTraveldate());
        available_bus_responses_list.add(create_object_of_available_buses(national_travels.getBus_id(),national_travels.getSeat_available(),
                national_travels.getAmenities(),national_travels.getStart_time(),national_travels.getEnd_time(),national_travels.getBus_fare()));

        No_1_Air_Travels no_1_air_travels=no_1_air_travels_repository.findBySourceAndDestinationOrTraveldate(available_bus_request.getSource(),available_bus_request.getDestination(),available_bus_request.getTraveldate());
        available_bus_responses_list.add(create_object_of_available_buses(no_1_air_travels.getBus_id(),no_1_air_travels.getSeat_available(),
                no_1_air_travels.getAmenities(),no_1_air_travels.getStart_time(),no_1_air_travels.getEnd_time(),no_1_air_travels.getBus_fare()));

        Orange_Tour_Travels orange_tour_travels=orange_tour_travels_repository.findBySourceAndDestinationOrTraveldate(available_bus_request.getSource(),available_bus_request.getDestination(),available_bus_request.getTraveldate());
        available_bus_responses_list.add(create_object_of_available_buses(orange_tour_travels.getBus_id(),orange_tour_travels.getSeat_available(),
                orange_tour_travels.getAmenities(),orange_tour_travels.getStart_time(),orange_tour_travels.getEnd_time(),orange_tour_travels.getBus_fare()));

        Sri_Krishna_Travels sri_krishna_travels=sri_krishna_travels_repository.findBySourceAndDestinationOrTraveldate(available_bus_request.getSource(),available_bus_request.getDestination(),available_bus_request.getTraveldate());
        available_bus_responses_list.add(create_object_of_available_buses(sri_krishna_travels.getBus_id(),sri_krishna_travels.getSeat_available(),
                sri_krishna_travels.getAmenities(),sri_krishna_travels.getStart_time(),sri_krishna_travels.getEnd_time(),sri_krishna_travels.getBus_fare()));
*/
        return available_bus_responses_list;
    }

    public  Available_Bus_Response create_object_of_available_buses(String bus_id,List<String> seat_available,
                                                                    String bus_amenities,String start_time,String end_time,
                                                                    Double bus_fare)
    {
        Available_Bus_Response available_bus_response=new Available_Bus_Response();
        available_bus_response.setBus_name(bus_id);
        available_bus_response.setBus_amenities(bus_amenities);
        available_bus_response.setBus_fare(bus_fare);
        available_bus_response.setSeat_available(seat_available);
        available_bus_response.setStart_time(start_time);
        available_bus_response.setEnd_time(end_time);
        return available_bus_response;
    }
}

