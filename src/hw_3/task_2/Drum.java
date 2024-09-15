package hw_3.task_2;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Drum implements Instrument{
    private static String name = "Drum";
    private int size;

    @Override
    public void play() {
        System.out.println(name + " is playing," + "size is " + this.size);
    }
}
