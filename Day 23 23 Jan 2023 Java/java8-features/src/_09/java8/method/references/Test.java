package _09.java8.method.references;

import java.util.Arrays;
import java.util.stream.Stream;

class Person {
	String name;

	// constructor
	public Person(String name) {
		this.name = name;
	}

	// instance method 1
	public int personInstanceMethod1(Person person) {
		return this.name.compareTo(person.name);
	}

	// instance method 2
	public int personInstanceMethod2(Person person1, Person person2) {
		return person1.name.compareTo(person2.name);
	}

	@Override
	public String toString() {
		return "Person [name=" + name + "]";
	}
}

public class Test {
	public static void main(String[] args) throws Exception {
		Person[] personArray = { new Person("Z"), new Person("A"), new Person("D") };

		// Scenario 1 : Getting compiled successfully
		Arrays.sort(personArray, Person::personInstanceMethod1);
		Arrays.stream(personArray).forEach(num -> System.out.println(num));

		// Scenario 2 : Compile failure
		// Arrays.sort(personArray, Person::personInstanceMethod2);

		// Scenario 3 : Getting compiled successfully.
		personArray = new Person[] { new Person("Z"), new Person("A"), new Person("D") };
		Person personInstance = new Person("C");
		Arrays.sort(personArray, personInstance::personInstanceMethod2);
		Arrays.stream(personArray).forEach(num -> System.out.println(num));

		// Scenario 4 : Getting compiled successfully. As the same way as "Scenario 1"
		String[] stringArray = { "Barbara", "James", "Mary", "John", "Patricia", "Robert", "Michael", "Linda" };
		Arrays.sort(stringArray, String::compareToIgnoreCase);
	}

}