package FilterDesignPattern;

import java.util.ArrayList;
import java.util.List;

public class CriteriaSingle implements Criteria{

    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        List<Person> single=new ArrayList<>();
        for (Person person:persons){
            if (person.getMartialStatus().equalsIgnoreCase("single"))
                single.add(person);
        }
        return single;
    }
}
