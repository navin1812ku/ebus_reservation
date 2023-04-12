package smart.ebus.reservation.system.E_Bus_Reservation.service.implementation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import smart.ebus.reservation.system.E_Bus_Reservation.buses.Air_India_Travels;
import smart.ebus.reservation.system.E_Bus_Reservation.buses.City_Travels;
import smart.ebus.reservation.system.E_Bus_Reservation.model.request.Available_Bus_Request;
import smart.ebus.reservation.system.E_Bus_Reservation.model.response.Available_Bus_Response;
import smart.ebus.reservation.system.E_Bus_Reservation.repository.Air_India_Travels_Repository;
import smart.ebus.reservation.system.E_Bus_Reservation.repository.City_Travels_Repository;
import smart.ebus.reservation.system.E_Bus_Reservation.service.Check_Bus_Availability_Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class Check_Bus_Availability_Impl implements Check_Bus_Availability_Service {

    @Autowired
    Air_India_Travels_Repository air_india_travels_repository;

    @Autowired
    City_Travels_Repository city_travels_repository;

    @Override
    public List<Available_Bus_Response> check_bus_availability(Available_Bus_Request available_bus_request) {
        List<Available_Bus_Response> available_bus_responses_list=new ArrayList<>();
        Air_India_Travels air_india_travels=air_india_travels_repository.findBySourceAndDestinationOrTraveldate(available_bus_request.getSource(),available_bus_request.getDestination(),available_bus_request.getTravel_date());
       // available_bus_responses_list.add(create_object_of_available_buses(air_india_travels.getBus_id(),air_india_travels.getSeat_available(),
       //         air_india_travels.getAmenities(), air_india_travels.getStart_time(),air_india_travels.getEnd_time(),air_india_travels.getBus_fare()));

        City_Travels city_travels=city_travels_repository.findBySourceAndDestinationOrTraveldate(available_bus_request.getSource(),available_bus_request.getDestination(),available_bus_request.getTravel_date());
        available_bus_responses_list.add(create_object_of_available_buses(city_travels.getBus_id(),city_travels.getSeat_available(),
                city_travels.getAmenities(),city_travels.getStart_time(),city_travels.getEnd_time(),city_travels.getBus_fare()));
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


