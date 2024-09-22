package hw_4.task_3;


import lombok.*;



import java.util.List;
import java.util.Map;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ZooClub {
    private Map<Person, List<Pet>> club;

    public void addOwner(String newPerson) {
        club.put(new Person(newPerson), null);

//
//    public String addPetToOwner(String newPetName, String newPetBreed ) {
//        club.get(Person).add(new (newPetName, newPetBreed));
//    }


    }
}


