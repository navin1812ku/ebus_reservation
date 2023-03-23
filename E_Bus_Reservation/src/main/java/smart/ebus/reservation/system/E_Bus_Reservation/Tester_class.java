package smart.ebus.reservation.system.E_Bus_Reservation;

import org.springframework.web.client.RestTemplate;

import java.io.IOException;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.ProtocolException;
import java.net.URL;
import java.nio.charset.StandardCharsets;

public class Tester_class {
    public static void main(String[] args) throws IOException {
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

        System.out.println(http.getOutputStream() + " " + http.getResponseMessage());
        http.disconnect();
    }
}
