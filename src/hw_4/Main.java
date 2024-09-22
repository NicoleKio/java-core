package hw_4;

import hw_2.Student_components.Skill;
import hw_4.task_2.Car;
import hw_4.task_2.Gender;
import hw_4.task_2.Student;
import java.util.*;

public class Main {
    public static void main(String[] args) {

        // task 1
        List<User> users = new ArrayList<User>();
        users.add(User.builder().name("John").age(12).build());
        users.add(User.builder().name("Nana-nana").age(15).build());
        users.add(User.builder().name("Mio").age(16).build());
        users.add(User.builder().name("Lyney").age(14).build());


        users.sort(Comparator.comparing(User::getAge));
        System.out.println(users);

        // - відсортувати його за кількістю знаків в імені  (зростання , а потім окремо спадання)

//        users.sort(new Comparator<User>(){
//            public int compare(User o1, User o2) {
//                return o1.getName().length() - o2.getName().length();
//            }
//        }
//        );

        System.out.println("--------------------------------");
        users.sort(Comparator.comparingInt(o -> o.getName().length())
        );
        System.out.println(users);


        System.out.println("--------------------------------");



        //task 2

        List<String> characters = new ArrayList<>();
        characters.add("Lacus");
        characters.add("Adelaide");
        characters.add("Luise");
        characters.add("Aqzert");
        characters.add("Ray");
        characters.add("Dalia");
        characters.add("Doloria");
        characters.add("Ghran");
        characters.add("Claude");
        characters.add("Naygrim");
        characters.add("Lutikoria");
        characters.add("Liam");
        characters.add("Ines");
        characters.add("Vi");
        characters.add("Elsa");

        System.out.println(characters);
        Collections.sort(characters);
        System.out.println(characters);

        System.out.println("--------------------------------");

        // task 3
        HashSet<Student> students = new HashSet<>();
        //Створити HashSet з 10 об'єктів, проітерувати її, видалити всіх чоловіків

        students.add(
                new Student(1, "Eric", "Wonder", "er111@gmail.com", 20, Gender.MALE,
                List.of(new Skill("s1", 5), new Skill("s2", 5), new Skill("s3", 5)),
                Car.builder().model("k").power(5).year(2005).build())
        );
        students.add(
                new Student(2, "Lilith", "Wonder", "er111@gmail.com", 20, Gender.FEMALE,
                        List.of(new Skill("s1", 5)),
                        Car.builder().model("k").power(5).year(2005).build())
        );
        students.add(
                new Student(3, "Minerva", "Wonder", "er111@gmail.com", 20, Gender.FEMALE,
                List.of(new Skill("s1", 5), new Skill("s2", 5)),
                Car.builder().model("k").power(5).year(2005).build()));

        students.add(
                new Student(4, "Lacus", "Wonder", "er111@gmail.com", 20, Gender.MALE,
                        List.of(new Skill("s1", 5), new Skill("s2", 5), new Skill("s3", 5),
                                new Skill("s4", 5), new Skill("s5", 5), new Skill("s6", 5)),
                        Car.builder().model("k").power(5).year(2005).build())
        );

        students.add(
                new Student(5, "Yukisa", "Wonder", "er111@gmail.com", 20, Gender.FEMALE,
                        List.of(new Skill("s1", 5), new Skill("s2", 5), new Skill("s3", 5),
                                new Skill("s4", 5)),
                        Car.builder().model("k").power(5).year(2005).build())
        );

        students.add(
                new Student(6, "Dalia", "Wonder", "er111@gmail.com", 20, Gender.MALE,
                        List.of(new Skill("s1", 5), new Skill("s2", 5), new Skill("3", 5),
                                new Skill("s4", 5), new Skill("s5", 5)),
                        Car.builder().model("k").power(5).year(2005).build())
        );

        students.add(
                new Student(7, "Ray", "Wonder", "er111@gmail.com", 20, Gender.MALE,
                        List.of(new Skill("s1", 5)),
                        Car.builder().model("k").power(5).year(2005).build())
        );

        students.add(
                new Student(8, "Caroline", "Wonder", "er111@gmail.com", 20, Gender.FEMALE,
                        List.of(new Skill("s1", 5)),
                        Car.builder().model("k").power(5).year(2005).build())
        );

        students.add(
                new Student(9, "Lutikoria", "Wonder", "er111@gmail.com", 20, Gender.FEMALE,
                        List.of(new Skill("s1", 5), new Skill("s2", 5), new Skill("s3", 5)),
                        Car.builder().model("k").power(5).year(2005).build())
        );

        students.add(
                new Student(10, "Adelaide", "Wonder", "er111@gmail.com", 20, Gender.FEMALE,
                        List.of(new Skill("s1", 5), new Skill("s2", 5)),
                        Car.builder().model("k").power(5).year(2005).build())
        );

//        Iterator<Student> iterator = students.iterator();
//        while (iterator.hasNext()) {
//            Student next = iterator.next();
//            if (next.getGender() == Gender.MALE) {
//                iterator.remove();
//            }
//        }
        students.removeIf(next -> next.getGender() == Gender.MALE);

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

        System.out.println("--------------------------------");

        // Створити TreeSet з 10 об'єктів, посортовану за кількістю скілів від меньшого до більшого

        SortedSet<Student> studentsSkills = new TreeSet<>(new Comparator<Student>() {
            public int compare(Student s1, Student s2) {
                return s1.getSkills().size() - s2.getSkills().size();
            }
        });

        studentsSkills.add(
                new Student(1, "Eric", "Wonder", "er111@gmail.com", 20, Gender.MALE,
                        List.of(new Skill("s1", 5), new Skill("s2", 5), new Skill("s3", 5)),
                        Car.builder().model("k").power(5).year(2005).build())
        );
        studentsSkills.add(
                new Student(2, "Lilith", "Wonder", "er111@gmail.com", 20, Gender.FEMALE,
                        List.of(new Skill("s1", 5)),
                        Car.builder().model("k").power(5).year(2005).build())
        );
        studentsSkills.add(
                new Student(3, "Minerva", "Wonder", "er111@gmail.com", 20, Gender.FEMALE,
                        List.of(new Skill("s1", 5), new Skill("s2", 5)),
                        Car.builder().model("k").power(5).year(2005).build()));

        studentsSkills.add(
                new Student(4, "Lacus", "Wonder", "er111@gmail.com", 20, Gender.MALE,
                        List.of(new Skill("s1", 5), new Skill("s2", 5), new Skill("s3", 5),
                                new Skill("s4", 5), new Skill("s5", 5), new Skill("s6", 5)),
                        Car.builder().model("k").power(5).year(2005).build())
        );

        studentsSkills.add(
                new Student(5, "Yukisa", "Wonder", "er111@gmail.com", 20, Gender.FEMALE,
                        List.of(new Skill("s1", 5), new Skill("s2", 5), new Skill("s3", 5),
                                new Skill("s4", 5)),
                        Car.builder().model("k").power(5).year(2005).build())
        );

        studentsSkills.add(
                new Student(6, "Dalia", "Wonder", "er111@gmail.com", 20, Gender.MALE,
                        List.of(new Skill("s1", 5), new Skill("s2", 5), new Skill("3", 5),
                                new Skill("s4", 5), new Skill("s5", 5)),
                        Car.builder().model("k").power(5).year(2005).build())
        );

        studentsSkills.add(
                new Student(7, "Ray", "Wonder", "er111@gmail.com", 20, Gender.MALE,
                        List.of(new Skill("s1", 5)),
                        Car.builder().model("k").power(5).year(2005).build())
        );

        studentsSkills.add(
                new Student(8, "Caroline", "Wonder", "er111@gmail.com", 20, Gender.FEMALE,
                        List.of(new Skill("s1", 5)),
                        Car.builder().model("k").power(5).year(2005).build())
        );

        studentsSkills.add(
                new Student(9, "Lutikoria", "Wonder", "er111@gmail.com", 20, Gender.FEMALE,
                        List.of(new Skill("s1", 5), new Skill("s2", 5), new Skill("s3", 5)),
                        Car.builder().model("k").power(5).year(2005).build())
        );

        studentsSkills.add(
                new Student(10, "Adelaide", "Wonder", "er111@gmail.com", 20, Gender.FEMALE,
                        List.of(new Skill("s1", 5), new Skill("s2", 5)),
                        Car.builder().model("k").power(5).year(2005).build())
        );


        System.out.println(studentsSkills);





    }
}
