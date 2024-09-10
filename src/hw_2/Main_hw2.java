package hw_2;

import hw_2.PC_hierarchy.Laptop;
import hw_2.PC_hierarchy.PC;
import hw_2.PC_hierarchy.Ultrabook;
import hw_2.PC_hierarchy.Workstation;
import hw_2.Papers_units.Book;
import hw_2.Papers_units.Comics;
import hw_2.Papers_units.Magazine;
import hw_2.Papers_units.Papyrus;
import hw_2.Student_components.Car;
import hw_2.Student_components.Gender;
import hw_2.Student_components.Skill;
import hw_2.User_components.Address;
import hw_2.User_components.Company;
import hw_2.User_components.Geo;

import java.util.ArrayList;

public class Main_hw2 {
    public static void main(String[] args) {

        User user = new User();
        user.setId(1);
        user.setName("Lola");
        user.setUsername("LolaKu");
        user.setEmail("kio8@gmail.com");
        user.setAddress(
                new Address("Kulas Light", "Apt. 556", "Gwenborough", "92998-3874",
                new Geo(-37.3159, 81.1496)));
        user.setPhone(1-770-736-8031);
        user.setWebsite("hildegard.org");
        user.setCompany(
                new Company("Romaguera-Crona", "Multi-layered", "harness real-time e-markets"));

        System.out.println(user);



        //---------------------------------------
        PC pc1 = new PC("Intel Core i9-13900KS 6,0-5,7", true, true);
        Laptop laptop2 = new Laptop(
                new PC("Intel Core i9-13900KS 6,0-5,7", true, true),
                17);
        Ultrabook ultrabook3 = new Ultrabook(
                new Laptop(
                new PC("Intel Core i9-13900KS 6,0-5,7", true, true),
                17),
                true, true);
        Workstation workstation4 = new Workstation(
                new Laptop(
                        new PC("Intel Core i9-13900KS 6,0-5,7", true, true),
                        17),
                "big", "soft");

        System.out.println(ultrabook3);



        //----------------------------------------

        Papyrus papyrus1 = new Papyrus(1);
        Book book1 = new Book("solid", "white");
        Magazine magazine1 = new Magazine("Adelaide de Azu", "Green Apple", "Rabbit's Hat Company", 20021);
        Comics comics1 = new Comics("Ray Sentolomew", "Sacral Flame", "horror", true);

        System.out.println(comics1);



        //----------------------------------------------

        Student student = new Student();
        student.setId(1);
        student.setName("Luise");
        student.setSurname("Viagarti");
        student.setAge(13);
        student.setGender(Gender.FEMALE);
        ArrayList<Skill> skills = new ArrayList<>();
        skills.add(new Skill("java",10));
        skills.add(new Skill("C++",8));
        student.setSkills(skills);
        student.setCar(new Car(
             "tesla", 2022, 250
        ));

        System.out.println(student);
    }

}
