package smart.ebus.reservation.system.E_Bus_Reservation.service.implementation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import smart.ebus.reservation.system.E_Bus_Reservation.model.Booking_page;
import smart.ebus.reservation.system.E_Bus_Reservation.model.Journey_Details;
import smart.ebus.reservation.system.E_Bus_Reservation.model.Passenger_Journey_Details;
import smart.ebus.reservation.system.E_Bus_Reservation.repository.Passenger_Details_Repository;
import smart.ebus.reservation.system.E_Bus_Reservation.service.Passenger_Details_Service;

import java.io.IOException;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.StandardCharsets;


@Service
public class Passenger_Details_impl implements Passenger_Details_Service {

    @Autowired
    public Passenger_Details_Repository passenger_details_repository;

    public void bus_list_api() throws IOException {
        URL url = new URL("https://sandbox.rechapi.com/bus/busList.php");
        HttpURLConnection http = (HttpURLConnection)url.openConnection();
        http.setRequestMethod("POST");
        http.setDoOutput(true);
        http.setRequestProperty("accept", "application/json");
        http.setRequestProperty("content-type", "application/json");

        String data = "{\"token\":\"xxxxx\",\"sourceId\":\"1\",\"destinationId\":\"10\",\"journyDate\":\"2021-08-19\"}";

        byte[] out = data.getBytes(StandardCharsets.UTF_8);

        OutputStream stream = http.getOutputStream();
        stream.write(out);

        System.out.println(http.getResponseCode() + " " + http.getResponseMessage());
        http.disconnect();

    }


    @Override
    public Passenger_Journey_Details passengers_details(Passenger_Journey_Details passenger_journey_details) {
        return passenger_details_repository.save(passenger_journey_details);
    }
}
