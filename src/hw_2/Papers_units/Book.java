package hw_2.Papers_units;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Book extends Papyrus{
    private String wrap;
    private String pageColour;

}
