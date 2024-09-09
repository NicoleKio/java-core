package hw_2.PC_hierarchy;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Workstation {
    private Laptop laptop;
    private String table;
    private String armchair;

}
