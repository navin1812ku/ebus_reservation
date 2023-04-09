package smart.ebus.reservation.system.E_Bus_Reservation.service.implementation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import smart.ebus.reservation.system.E_Bus_Reservation.model.Getting_Journey_Details;
import smart.ebus.reservation.system.E_Bus_Reservation.entity.Hotel_Details_Table;
import smart.ebus.reservation.system.E_Bus_Reservation.entity.Journey_Details;
import smart.ebus.reservation.system.E_Bus_Reservation.entity.Passenger_Details;
import smart.ebus.reservation.system.E_Bus_Reservation.repository.Hotel_Details_Repository;
import smart.ebus.reservation.system.E_Bus_Reservation.repository.Journey_Details_Repository;
import smart.ebus.reservation.system.E_Bus_Reservation.repository.Passenger_Details_Repository;
import smart.ebus.reservation.system.E_Bus_Reservation.service.Journey_Details_Service;


@Service
public class Journey_Details_Impl implements Journey_Details_Service {

    @Autowired
    Journey_Details_Repository journey_details_repository;

    @Autowired
    Passenger_Details_Repository passenger_details_repository;

    @Autowired
    Hotel_Details_Repository hotel_details_repository;

    @Override
    public Journey_Details customer_details(Getting_Journey_Details getting_journey_details) {
        Journey_Details journey_details= new Journey_Details();
        journey_details.setSource(getting_journey_details.getPick_up());
        journey_details.setDestination(getting_journey_details.getDrop());
        journey_details_repository.save(journey_details);

        Passenger_Details passenger_details=new Passenger_Details();
        passenger_details.setPassenger_name(getting_journey_details.getName());
        passenger_details.setPassenger_age(getting_journey_details.getAge());
        passenger_details_repository.save(passenger_details);

        Hotel_Details_Table hotel_details_table=new Hotel_Details_Table();
        hotel_details_table.setNumber_of_seats(hotel_details_table.getNumber_of_seats());
        hotel_details_repository.save(hotel_details_table);

        return null;
    }
}
