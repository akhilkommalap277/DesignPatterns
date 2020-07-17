package FilterDesignPattern;

import java.util.ArrayList;
import java.util.List;

public class CriteriaMale implements Criteria{
    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        List<Person> male=new ArrayList<>();
        for (Person person:persons){
            if (person.getGender().equalsIgnoreCase("Male"))
                male.add(person);
        }
        return male;
    }
}
