package FilterDesignPattern;

import java.util.ArrayList;
import java.util.List;

public class CriteriaFemale implements Criteria{

    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        List<Person> female=new ArrayList<>();
        for (Person person:persons){
            if (person.getGender().equalsIgnoreCase("FeMale"))
                female.add(person);
        }
        return female;
    }
}
