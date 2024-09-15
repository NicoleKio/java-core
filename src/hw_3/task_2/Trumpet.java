package hw_3.task_2;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class Trumpet implements Instrument{
    private static String name = "Trumpet";
    private int diameter;

    @Override
    public void play() {
        System.out.println(name + " is playing," + "diameter is " + this.diameter);
    }
}
