package ch.lazzaretti.exercise10.sub1;

import ch.lazzaretti.exercise10.PeopleTests;
import ch.lazzaretti.exercise10.sub1.PeopleData;
import ch.lazzaretti.exercise10.sub1.Person;
import ch.lazzaretti.exercise10.sub1.PersonUtil;
import ch.lazzaretti.exercise10.sub1.SortStrategy;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

/**
 * Created by fab on 23.11.2016.
 */
public class SortTest extends PeopleTests {

    protected HashMap<SortStrategy,List<Person>> lists;

    @Before
    @Override
    public void beforeTest() throws IOException {
        super.beforeTest();
        lists = new HashMap<>();
        for (SortStrategy strategy : SortStrategy.values()){
            lists.put(strategy,(List)people.clone());
        }
    }

    @Test
    public void SortAgeTest(){
        for (SortStrategy strategy : SortStrategy.values()){
            PersonUtil.sortListByAge(lists.get(strategy),strategy);
        }
        compare();
    }

    @Test
    public void SortAgeReverseTest(){
        for (SortStrategy strategy : SortStrategy.values()){
            PersonUtil.sortListByAgeReverse(lists.get(strategy),strategy);
        }
        compare();
    }

    @Test
    public void SortNameTest(){
        for (SortStrategy strategy : SortStrategy.values()){
            PersonUtil.sortListByName(lists.get(strategy),strategy);
        }
        compare();
    }

    protected void compare(){
        for (SortStrategy strategy1 : SortStrategy.values()) {
            for (SortStrategy strategy2 : SortStrategy.values()) {
                if(strategy1!=strategy2){
                    assertEquals(strategy1.toString()+" and "+strategy2.toString()+" have not the same result!",
                            lists.get(strategy1),lists.get(strategy2));
                }
            }
        }
    }
}
