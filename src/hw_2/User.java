package hw_2;

import hw_2.User_components.Address;
import hw_2.User_components.Company;
import hw_2.User_components.Geo;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {
    private int id;
    private String name;
    private String username;
    private String email;
    private Address address;
    private long phone;
    private String website;
    private Company company;




}
