package ch.lazzaretti.exercise10.sub4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

interface PersonFactory {
	Person createPerson(String firstName, String lastName, Gender gender, String city, int age, int salary);
}

public class Lambdas {
	public static void main(String[] args) {
		taskA();
		taskB();
		taskC();
	}
	
	private static void taskA() {
		List<Person> personList = new ArrayList<>();
		personList.add(new Person("Hans", "Meier", Gender.MALE, "Z�rich", 34, 40000));
		personList.add(new Person("Petra", "M�ller", Gender.FEMALE, "Rapperswil", 25, 60000));
		personList.add(new Person("Klaus", "Schmid", Gender.MALE, "Wetzikon", 30, 21000));
		personList.add(new Person("Claudia", "Schneider", Gender.FEMALE, "Z�rich", 40, 92000));
		sort(personList);
	}
	
	private static void sort(List<Person> personList) {
		int count = 0;
		Collections.sort(personList, (p1, p2) -> {
				//count++; // Compile error TODO
				return p1.getLastName().compareTo(p2.getLastName());
			});
		System.out.println("Number of comparisons: " + count);
	}
		
	private static void taskB() {
		String[] names = { "UPPER", "up", "DOWN", "do", "reset", "REPEAT" };
		Arrays.sort(names, String::compareToIgnoreCase);
		for (String item: names) {
			System.out.print(item + " ");
		}
		System.out.println();
	}
	
	private static void taskC() {
		System.out.println(createPersonList(Person::new, 10));
	}
	
	private static List<Person> createPersonList(PersonFactory factory, int amount) {
		List<Person> list = new ArrayList<>();
		for (int i = 0; i < amount; i++) {
			list.add(factory.createPerson("FirstName" + i, "LastName" + i, Gender.MALE, "Z�rich", 30, 0));
		}
		return list;
	}
}

