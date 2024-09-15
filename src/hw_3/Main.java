package hw_3;

import hw_3.task_1.Book;
import hw_3.task_1.Magazine;
import hw_3.task_1.Printable;
import hw_3.task_2.Drum;
import hw_3.task_2.Guitar;
import hw_3.task_2.Instrument;
import hw_3.task_2.Trumpet;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {


        List<Printable> lists1 = Arrays.asList(
                new Book("parfnoth1"),
                new Book("parfnoth2"),
                new Book("parfnoth3"),
                new Magazine("Ruu1"),
                new Magazine("Ruu2"),
                new Magazine("Ruu3")
        );

        for (Printable printable : lists1) {
            printable.print();
        }


        List<Instrument> instruments = Arrays.asList(
                new Guitar(5),
                new Trumpet(7),
                new Drum(35)
        );

        for (Instrument instrument : instruments) {
            instrument.play();
        }


    }
}
