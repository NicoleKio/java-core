package hw_3.task_1;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Book implements Printable {
    private String name;

    @Override
    public void print() {
        System.out.println("10 copies of " + this.name);
    }
}
