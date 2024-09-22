package hw_4.task_3;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


import java.util.ArrayList;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Person {
    private String name;
    public List<Pet> pets = new ArrayList<>();
//    static private List myPets = new ArrayList();
//    private void myPet(){
//        Pet pet = new Pet();
//        myPets.add(pet);
//    }


}
