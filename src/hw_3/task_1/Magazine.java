package hw_3.task_1;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class Magazine implements Printable {
    private String brand;

    @Override
    public void print() {
        System.out.println("12 copies of " + this.brand);
    }
}
