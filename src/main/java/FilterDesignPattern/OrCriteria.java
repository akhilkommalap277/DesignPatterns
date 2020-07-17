package FilterDesignPattern;

import java.util.ArrayList;
import java.util.List;

public class OrCriteria implements Criteria{

    private Criteria criteria;
    private Criteria otherCriteria;

    public OrCriteria(Criteria single, Criteria female) {
        this.criteria = single;
        this.otherCriteria = female;
    }

    @Override
    public List<Person> meetCriteria(List<Person> persons) {

        List<Person> firstCriteriaItems = criteria.meetCriteria(persons);
        List<Person> otherCriteriaItems = otherCriteria.meetCriteria(persons);

        for (Person person : otherCriteriaItems) {
            if(!firstCriteriaItems.contains(person)){
                firstCriteriaItems.add(person);
            }
        }
        return firstCriteriaItems;
    }
}


