package hw_4.task_3;


import lombok.*;


import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import static jdk.nio.zipfs.ZipFileAttributeView.AttrID.owner;

@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
public class ZooClub {
    private Map<Person, List<Pet>> club;

    public void addOwner(String newPerson) {
        club.put(new Person(newPerson, new ArrayList<>()), new ArrayList<>());


    public void addPetToOwner(String newOwner, String pet) {
            club.;
    }


    }
}


