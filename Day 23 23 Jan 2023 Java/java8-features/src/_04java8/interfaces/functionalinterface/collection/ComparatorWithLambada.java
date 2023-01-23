package _04java8.interfaces.functionalinterface.collection;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ComparatorWithLambada {

	public static void main(String[] args) {

		List<Developer> listDevs = getDevelopers();
		System.out.println("Before Sort");
		for (Developer developer : listDevs) {
			System.out.println(developer);
		}

		// sort by age
		listDevs.sort((Developer o1, Developer o2) -> o1.getAge() - o2.getAge());
		System.out.println("After Sort by age");
		listDevs.forEach((developer) -> System.out.println(developer));

		listDevs = getDevelopers();
		// sort by name
		listDevs.sort((Developer o1, Developer o2) -> o1.getName().compareTo(o2.getName()));
		System.out.println("After Sort by name");
		listDevs.forEach((developer) -> System.out.println(developer));

		listDevs = getDevelopers();
		// sort by salary
		Comparator<Developer> salaryComparator = (o1, o2) -> o1.getSalary().compareTo(o2.getSalary());
		listDevs.sort(salaryComparator);
		System.out.println("After Sort by salary");
		listDevs.forEach((developer) -> System.out.println(developer));

		listDevs = getDevelopers();
		// sort by salary reversed
		Comparator<Developer> salaryComparator2 = (o1, o2) -> o1.getSalary().compareTo(o2.getSalary());
		listDevs.sort(salaryComparator2.reversed());
		System.out.println("After Sort by salary in reversed order");
		listDevs.forEach((developer) -> System.out.println(developer));

	}

	private static List<Developer> getDevelopers() {

		List<Developer> result = new ArrayList<Developer>();
		result.add(new Developer("mkyong", new BigDecimal("70000"), 33));
		result.add(new Developer("alvin", new BigDecimal("80000"), 20));
		result.add(new Developer("jason", new BigDecimal("100000"), 10));
		result.add(new Developer("iris", new BigDecimal("170000"), 55));
		return result;

	}
}
