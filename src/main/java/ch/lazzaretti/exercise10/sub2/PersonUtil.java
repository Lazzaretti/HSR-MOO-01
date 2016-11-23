package ch.lazzaretti.exercise10.sub2;

import ch.lazzaretti.exercise10.sub1.Gender;
import ch.lazzaretti.exercise10.sub1.Person;

import java.util.List;

/**
 * Created by fab on 23.11.2016.
 */
public class PersonUtil extends ch.lazzaretti.exercise10.sub1.PersonUtil {
    public static List<Person> filterByAgeMaleZurich(List<Person> list, int min, int max){
        return Search.search(list,
                (person -> min <= person.getAge() && person.getAge() <= max),
                (person -> person.getGender() == Gender.MALE),
                person -> person.getCity().equals("Zürich")
        );
    }
}
