package ch.lazzaretti.exercise10.sub3;

import ch.lazzaretti.exercise10.sub1.PeopleData;
import ch.lazzaretti.exercise10.sub1.Person;
import ch.lazzaretti.exercise10.sub2.PersonUtil;

import java.io.IOException;
import java.util.List;

public class Program {
	public static void main(String[] args) throws IOException {
		QueryList<Person> list = new QueryList<>(PeopleData.read("data/people.csv"));
		// erzeugt eine QueryList mit dem Inhalt einer anderen Collection
		double average = list.average(p -> p.getAge());
		// rechnet den Durchschnitt über das Alter
		Person longNamer = list.maximumElement(p -> p.getLastName().length());

	}
}
