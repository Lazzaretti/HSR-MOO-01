package ch.lazzaretti.exercise10.sub1;

import java.io.IOException;
import java.util.Comparator;
import java.util.List;

public class Program {
	public static void main(String[] args) throws IOException {
		List<Person> people = PeopleData.read("data/people.csv");

        PersonUtil.sortListByAge(people,SortStrategy.COMPARATOR);

		PeopleData.write("out/sorted.csv", people);
	}
}
