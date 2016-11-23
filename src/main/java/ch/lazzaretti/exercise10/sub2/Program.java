package ch.lazzaretti.exercise10.sub2;

import ch.lazzaretti.exercise10.sub1.PeopleData;
import ch.lazzaretti.exercise10.sub1.Person;

import java.io.IOException;
import java.util.List;

public class Program {
	public static void main(String[] args) throws IOException {
		List<Person> people = PeopleData.read("data/people.csv");

		people = PersonUtil.filterByAgeMaleZurich(people,30,65);

		PeopleData.write("out/sorted.csv", people);
	}
}
