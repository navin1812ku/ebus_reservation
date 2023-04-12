package smart.ebus.reservation.system.E_Bus_Reservation.model.response;


import lombok.Data;

import java.util.List;

@Data
public class Available_Bus_Response {
    private String bus_name;
    private List<String> seat_available;
    private Double bus_fare;
    private String bus_amenities;
    private String start_time;
    private String end_time;

   // static Available_Bus_Response available_bus_response=null;

   /* public static Available_Bus_Response getInstance()
    {
        if(available_bus_response==null)
        {
            return new Available_Bus_Response(bus_name,seat_available,bus_fare,bus_amenities,start_time,end_time);
        }
        return available_bus_response;
    } */

   /* public Available_Bus_Response(String bus_name, List<String> seat_available, Double bus_fare, String bus_amenities, String start_time, String end_time) {
        this.bus_name = bus_name;
        this.seat_available = seat_available;
        this.bus_fare = bus_fare;
        this.bus_amenities = bus_amenities;
        this.start_time = start_time;
        this.end_time = end_time;
    }*/
}
