package ch.lazzaretti.exercise10.sub3;

import ch.lazzaretti.exercise10.PeopleTest;
import ch.lazzaretti.exercise10.sub1.Person;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.util.OptionalDouble;

import static org.junit.Assert.assertEquals;

/**
 * Created by fab on 29.11.2016.
 */
public class QueryListTest extends PeopleTest {

    protected QueryList<Person> queryList;

    @Before
    @Override
    public void beforeTest() throws IOException {
        super.beforeTest();
        queryList = new QueryList<>(people);
    }

    @Test
    public void averageTest(){
        double queryAvg = queryList.average(p ->p.getAge());
        OptionalDouble streamAvgOp = people.stream().mapToDouble(p->p.getAge()).average();
        double streamAvg = streamAvgOp.getAsDouble();
        assertEquals(streamAvg,queryAvg,0.0001);
    }

    @Test
    public void averageHardTest(){
        assertEquals(44.123,queryList.average(p ->p.getAge()),0.001);
    }

    @Test
    public void maximumTest(){
        double queryMax = queryList.maximum(p ->p.getAge());
        OptionalDouble streamMaxOp = people.stream().mapToDouble(p->p.getAge()).average();
        double streamMax = streamMaxOp.getAsDouble();
        assertEquals(streamMax,queryMax,0.0001);
    }

    @Test
    public void maximumHardTest(){
        double maximum = queryList.maximum(p ->p.getAge());
        assertEquals(70,maximum,0.0001);
    }

    @Test
    public void maximumElemHardTest(){
        assertEquals("Holly Hildebrandt",queryList.maximumElement(p->p.getFullName().length()));
    }

}
