package hw_2.PC_hierarchy;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Ultrabook {
    private Laptop laptop;
    private Boolean longerBatteryLife;
    private Boolean ultramobile;
}
