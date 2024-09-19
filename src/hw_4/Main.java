package hw_4;

import hw_2.Student_components.Car;
import hw_2.Student_components.Skill;
import hw_4.task_2.Gender;
import hw_4.task_2.Student;
import lombok.Builder;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        List<User> users = new ArrayList<User>();
        users.add(User.builder().name("John").age(12).build());
        users.add(User.builder().name("Nana").age(15).build());
        users.add(User.builder().name("Mio").age(16).build());
        users.add(User.builder().name("Linn").age(14).build());

        users.sort(Comparator.comparing(User::getAge));
        System.out.println(users);


        HashSet<Student> students = new HashSet<Student>();
        students.add(Student.builder()
                .id(1)
                .name("Eric")
                .surname("Wonder")
                .age(20)
                .email("er111@gmail.com")
                .gender(Gender.MALE)
                .skills(
                        new Skill("k", 5),
                        new Skill("java", 8)
                )
                .car( new Car("tesla", 2005, 55)).build()

                );

    }
}
