package hw_2.Student_components;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Car {
    private String model;
    private int year;
    private int power;
}
