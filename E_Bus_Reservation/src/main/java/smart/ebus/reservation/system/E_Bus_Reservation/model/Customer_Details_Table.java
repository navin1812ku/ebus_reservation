package smart.ebus.reservation.system.E_Bus_Reservation.model;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

@Entity
@Table(name = "customer_details_table")
@Data
public class Customer_Details_Table {
    @Id
    private String user_email_id;
    @Column(nullable = false)
    private String first_name;
    @Column(nullable = false)
    private String last_name;
    @Column(nullable = false)
    private String gender;
    @Column(nullable = false)
    private Date Date_of_birth;
    @Column(nullable = false)
    private String Place;
    @Column(nullable = false)
    private String Aadhar_number;
    @Column(nullable = false)
    private Long Phone_number;
    @ElementCollection
    private Map<String,String> Security_Question1=new HashMap<String,String>();
    @ElementCollection
    private Map<String,String> Security_Question2=new HashMap<String,String>();
}
/*
    @ElementCollection
    private Map<String,String> map=new HashMap<String,String>();
 */