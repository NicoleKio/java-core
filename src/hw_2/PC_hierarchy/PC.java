package hw_2.PC_hierarchy;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PC {
    private String processor;
    private Boolean powerUnit;
    private Boolean harddisk;

}
