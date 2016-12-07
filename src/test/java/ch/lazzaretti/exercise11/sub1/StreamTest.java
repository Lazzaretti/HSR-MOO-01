package ch.lazzaretti.exercise11.sub1;

import ch.lazzaretti.exercise10.PeopleTest;
import ch.lazzaretti.exercise10.sub1.Person;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.util.*;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

/**
 * Created by fab on 30.11.2016.
 */
public class StreamTest extends PeopleTest {
    @Override
    @Before
    public void beforeTest() throws IOException {
        super.beforeTest();
    }

    @Test
    public void getFemaleFirstNameTest(){
        String solName = "Mia, Lea, Pia, Ida, Zoe, Lia, Amy, Eva, Kim, Ela, Ina, Liv, Ava, Eda, Ann, Joy, Ada, Liz, Lou, Nea, Ria, Ivy, Nia, Tia, Isa, Zoé, Jil";
        Set<String> prog = Program.getFemaleFirstName(people);
        Set<String> sol = new HashSet<String>();
        Collections.addAll(sol, solName.split(", "));

        assertEquals(sol,prog);
    }

    @Test
    public void getMaleAverageAgeTest(){
        double avg = Program.getMaleAverageAge(people);

        assertEquals(44.37609841827768,avg,0.000000001);
    }

    @Test
    public void getMaxAgeInZhTest(){
        double max = Program.getMaxAgeInZh(people);

        assertEquals(70,max,0.000000001);
    }

    @Test
    public void getMinAgeInZhTest(){
        double min = Program.getMinAgeInZh(people);

        assertEquals(21,min,0.000000001);
    }

    @Test
    public void getTopEarnerTest(){
        List<Person> top = Program.getTopTenEarner(people);
        assertEquals(10,top.size());
        assertEquals("Malin Kopp Arbon",top.get(0).getFullName()+" "+top.get(0).getCity());
        assertEquals("Lynn Langer Oberwil",top.get(9).getFullName()+" "+top.get(9).getCity());
    }

    @Test
    public void getAverageAgePerCityTest(){
        Map<String,Double> avg = Program.getAverageAgePerCity(people);
        assertEquals(48.375,avg.get("Val-de-Travers").doubleValue(),0.001);
        assertEquals(52.888888888888886,avg.get("Thun").doubleValue(),0.001);
    }
}
