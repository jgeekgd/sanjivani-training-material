package _10.java8.stream.api.demo;

import java.util.ArrayList;
import java.util.List;

public class StreamFilterMapExample {

	public static void main(String[] args) {

		System.out.println("To Upper Case names having length more than 5 : \n");

		// List of String - source
		List<String> names = new ArrayList<>();

		// add few names to String list using add() method
		names.add("Sachin");
		names.add("Warne");
		names.add("Pietersen");
		names.add("McCullum");
		names.add("Jonty");
		names.add("Richards");
		names.add("Ranatunga");

		// Stream filter to get names whose length is greater than 5 and
		// and map to upper case for each of the filtered names and
		// also print to console

		names // original source
				.stream() // 1. get stream from source
				.filter(s -> s.length() > 5) // 2.1 intermediate operation to get names with length>5
				.map(s -> s.toUpperCase()) // 2.2 intermediate operation to convert to UpperCase
				.forEach(name -> System.out.println(name)); // 3. terminal operation to print
	}
}