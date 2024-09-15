package hw_3.task_2;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Guitar implements Instrument {
    private static String name = "Guitar";
    private int stringsAmount;

    @Override
    public void play() {
        System.out.println(name + " is playing," + "strings amount is " + this.stringsAmount);
    }
}
