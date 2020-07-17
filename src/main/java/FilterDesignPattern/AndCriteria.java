package FilterDesignPattern;

import java.util.ArrayList;
import java.util.List;

public class AndCriteria implements Criteria{

    private Criteria criteria;
    private Criteria otherCriteria;

    public AndCriteria(Criteria single, Criteria male){
        this.criteria=single;
        this.otherCriteria=male;
    }


    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        List<Person> firstCriteriaPerson = criteria.meetCriteria(persons);

        return otherCriteria.meetCriteria(firstCriteriaPerson);
    }
}

