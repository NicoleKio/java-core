package hw_4.task_2;


import hw_2.Student_components.Skill;

import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
public class Student {
    private int id;
    private String name;
    private String surname;
    private String email;
    private int age;
    private Gender gender;
    private List<Skill> skills = new ArrayList<Skill>();
    private Car car;


//    @Override
//    public int compareTo(Student o) {
//        return this.id - o.id;
//    }
}
