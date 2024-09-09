package hw_2.Papers_units;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Comics extends Book{
    private String author;
    private String title;
    private String genre;
    private Boolean pictures;
}
