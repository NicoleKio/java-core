package hw_4;

import hw_2.Student_components.Skill;
import hw_4.task_2.Car;
import hw_4.task_2.Gender;
import hw_4.task_2.Student;


import java.lang.reflect.Array;
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


        //-----------------------------------------

        HashSet<Student> students = new HashSet<Student>();

        students.add(
                new Student(1, "Eric", "Wonder", "er111@gmail.com", 20, Gender.MALE,
                List.of(new Skill("l", 5), new Skill("m", 5), new Skill("s", 5)),
                Car.builder().model("k").power(5).year(2005).build())
        );
        students.add(
                new Student(2, "Lola", "Wonder", "er111@gmail.com", 20, Gender.MALE,
                        List.of(new Skill("l", 5), new Skill("m", 5), new Skill("s", 5)),
                        Car.builder().model("k").power(5).year(2005).build())
        );

//        Student eric = new Student(1, "Eric", "Wonder", "er111@gmail.com", 20, Gender.MALE,
//                        List.of(new Skill("l", 5), new Skill("m", 5), new Skill("s", 5)),
//                        Car.builder().model("k").power(5).year(2005).build());
//        students.add(eric);



//        eric.getSkills().add(new Skill("ts", 5));
//        eric.getSkills().add(new Skill("html", 7));
//        eric.getSkills().add(new Skill("java", 10));
//        eric.getSkills().add(new Skill("python", 5));

//        Student mira = new Student(1, "mira", "Wonder", "er111@gmail.com", 20, Gender.MALE,
//                null,
//                Car.builder().model("k").power(5).year(2005).build());
//        mira.getSkills().add(new Skill("ts", 5));
//        mira.getSkills().add(new Skill("js", 8));
//
//
//        Student kira = new Student(1, "mira", "Wonder", "er111@gmail.com", 20, Gender.MALE,
//                null,
//                Car.builder().model("k").power(5).year(2005).build());
//        kira.getSkills().add(new Skill("js", 8));
//
//        Student arian = new Student(1, "mira", "Wonder", "er111@gmail.com", 20, Gender.MALE,
//                null,
//                Car.builder().model("k").power(5).year(2005).build());
//        arian.getSkills().add(new Skill("js", 8));
//        arian.getSkills().add(new Skill("java", 9));
//        arian.getSkills().add(new Skill("c++", 4));


        System.out.println(students);




    }
}
