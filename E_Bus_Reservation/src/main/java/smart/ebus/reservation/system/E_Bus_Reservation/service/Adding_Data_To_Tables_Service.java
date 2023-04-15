package smart.ebus.reservation.system.E_Bus_Reservation.service;


import smart.ebus.reservation.system.E_Bus_Reservation.model.request.Adding_Data_To_Travels_Request;
import smart.ebus.reservation.system.E_Bus_Reservation.model.response.Response;

public interface Adding_Data_To_Tables_Service {
    Response air_india_travels_details(Adding_Data_To_Travels_Request adding_data_to_travels_request);

    Response sri_krishna_travels_travels(Adding_Data_To_Travels_Request adding_data_to_travels_request);

    Response orange_tour_travels_details(Adding_Data_To_Travels_Request adding_data_to_travels_request);

    Response no_1_air_travels_details(Adding_Data_To_Travels_Request adding_data_to_travels_request);

    Response national_travels_details(Adding_Data_To_Travels_Request adding_data_to_travels_request);

    Response mayurra_travels_details(Adding_Data_To_Travels_Request adding_data_to_travels_request);

    Response krish_travels_details(Adding_Data_To_Travels_Request adding_data_to_travels_request);

    Response ganapathy_travels_details(Adding_Data_To_Travels_Request adding_data_to_travels_request);

    Response essar_travels_details(Adding_Data_To_Travels_Request adding_data_to_travels_request);

    Response city_travels_details(Adding_Data_To_Travels_Request adding_data_to_travels_request);
}
