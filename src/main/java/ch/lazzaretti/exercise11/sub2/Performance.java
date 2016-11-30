package ch.lazzaretti.exercise11.sub2;

import ch.lazzaretti.exercise10.sub1.Gender;
import ch.lazzaretti.exercise10.sub1.Person;
import ch.lazzaretti.exercise11.sub1.PeopleData;
import ch.lazzaretti.exercise11.sub1.Program;

import java.io.IOException;
import java.util.List;

/**
 * Created by fab on 30.11.2016.
 */
public class Performance {

    public static void main(String args[]) throws IOException {
        List<Person> people = PeopleData.read("data/large.csv");
        for(int i=0;i<5;i++) {
            people.addAll(people);
        }
        long start;
        for(int i=0;i<1000;i++) {
            System.out.println("Without Stream");
            start = System.currentTimeMillis();
            System.out.println(withoutStream(people));
            System.out.println(System.currentTimeMillis() - start);

            System.out.println("Single Stream");
            start = System.currentTimeMillis();
            System.out.println(singleStream(people));
            System.out.println(System.currentTimeMillis() - start);

            System.out.println("Parallel Stream");
            start = System.currentTimeMillis();
            System.out.println(parallelStream(people));
            System.out.println(System.currentTimeMillis() - start);
        }
    }

    public static double withoutStream(List<Person> people){
        int size = people.size();
        int avg = 0;
        int male = 0;
        for (int i=0;i<size;i++) {
            Person p = people.get(i);
        if (p.getGender() == Gender.MALE){
            avg += p.getAge();
            male++;
            }
        }
        return (double)avg / (double)male;
    }

    public static double singleStream(List<Person> people){
        return Program.getMaleAverageAge(people);
    }

    public static double parallelStream(List<Person> people){
        return people.parallelStream()
                .filter(p->p.getGender() == Gender.MALE)
                .mapToDouble(p->p.getAge())
                .average().getAsDouble();
    }
}
