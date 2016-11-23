package ch.lazzaretti.exercise10.sub1;

import java.util.Comparator;
import java.util.List;

/**
 * Created by fab on 23.11.2016.
 */
public class PersonUtil {

    public static void sortListByAge(List<Person> people, SortStrategy strategy){
        switch (strategy){
            case METHODE_REFERENCE:
                //1. Sort with method reference
                people.sort(PersonUtil::sortByAge);
                break;
            case COMPARATOR:
                //2. Sort with Lambda
                people.sort((p1,p2)->p1.getAge() - p2.getAge());
                break;
            case LAMDA:
                //3. Sort with Comparator
                people.sort(Comparator.comparing(Person::getAge));
                break;
        }
    }

    public static int sortByAge(Person p1, Person p2){
        return p1.getAge() - p2.getAge();
    }

    public static int sortByAgeReverse(Person p1, Person p2){
        return p2.getAge() - p1.getAge();
    }

    public static int sortByName(Person p1, Person p2){
        int sort = p1.getLastName().compareTo(p2.getLastName());
        if (sort==0){
            sort = p1.getFirstName().compareTo(p2.getFirstName());
        }
        return sort;
    }


    public static void sortListByAgeReverse(List<Person> people, SortStrategy strategy) {
        switch (strategy){
            case METHODE_REFERENCE:
                //1. Sort with method reference
                people.sort(PersonUtil::sortByAgeReverse);
                break;
            case COMPARATOR:
                //2. Sort with Lambda
                people.sort((p1,p2)->p2.getAge() - p1.getAge());
                break;
            case LAMDA:
                //3. Sort with Comparator
                people.sort(Comparator.comparing(Person::getAge).reversed());
                break;
        }
    }



    public static void sortListByName(List<Person> people, SortStrategy strategy) {
        switch (strategy){
            case METHODE_REFERENCE:
                //1. Sort with method reference
                people.sort(PersonUtil::sortByName);
                break;
            case COMPARATOR:
                //2. Sort with Lambda
                people.sort((p1,p2)->{
                    int sort = p1.getLastName().compareTo(p2.getLastName());
                    if (sort==0){
                        sort = p1.getFirstName().compareTo(p2.getFirstName());
                    }
                    return sort;
                });
                break;
            case LAMDA:
                //3. Sort with Comparator
                people.sort(Comparator.comparing(Person::getLastName).thenComparing(Person::getFirstName));
                break;
        }
    }
}
