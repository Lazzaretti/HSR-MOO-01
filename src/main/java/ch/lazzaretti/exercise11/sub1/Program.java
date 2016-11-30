package ch.lazzaretti.exercise11.sub1;

import ch.lazzaretti.exercise10.sub1.Gender;
import ch.lazzaretti.exercise10.sub1.Person;

import java.io.IOException;
import java.util.*;
import java.util.stream.Collectors;

public class Program {
	public static void main(String[] args) throws IOException {
		List<Person> people = PeopleData.read("data/people.csv");

		System.out.println(getFemaleFirstName(people).stream().collect(Collectors.joining(", ")));

		PeopleData.write("sorted.csv", people);
	}

	public static Set<String> getFemaleFirstName(List<Person> people){
		return people.stream()
				.filter(p -> p.getGender() == Gender.FEMALE)
				.filter(p->p.getFirstName().length()<=3)
				.map(Person::getFirstName)
				.distinct()
				//.collect(Collectors.toList());
				.collect(Collectors.toCollection(HashSet::new));
	}

	public static double getMaleAverageAge(List<Person> people){
		return people.stream()
				.filter(p->p.getGender() == Gender.MALE)
				.mapToDouble(p->p.getAge())
				.average().getAsDouble();
	}

	public static double getMaxAgeInZh(List<Person> people){
		return people.stream()
				.filter(p->p.getCity().equals("Zürich"))
				.mapToDouble(p->p.getAge())
				.max().getAsDouble();
	}

	public static double getMinAgeInZh(List<Person> people){
		return people.stream()
				.filter(p->p.getCity().equals("Zürich"))
				.mapToDouble(p->p.getAge())
				.min().getAsDouble();
	}

	public static List<Person> getTopTenEarner(List<Person> people){
		return people.stream()
				.sorted((p1,p2)-> p2.getSalary() - p1.getSalary())
				.limit(10)
				.collect(Collectors.toList());
	}

	public static Map<String, Double> getAverageAgePerCity(ArrayList<Person> people) {
		return people.stream()
				.collect(Collectors.groupingBy(Person::getCity,Collectors.averagingDouble(Person::getAge)));
	}
}
