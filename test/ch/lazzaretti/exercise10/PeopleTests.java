package ch.lazzaretti.exercise10;

import ch.lazzaretti.exercise10.sub1.PeopleData;
import ch.lazzaretti.exercise10.sub1.Person;
import ch.lazzaretti.exercise10.sub1.SortStrategy;
import org.junit.Before;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import static org.junit.Assert.assertEquals;

/**
 * Created by fab on 29.11.2016.
 */
public class PeopleTests {

    protected ArrayList <Person> people;

    @Before
    public void beforeTest() throws IOException {
        //We need a ArrayList and internal it is one
        people = (ArrayList) PeopleData.read("data/people.csv");
    }


}
