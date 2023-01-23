package _10.java8.stream.api.demo;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class StreamFilterEvenNumbers {

	public static void main(String[] args) {

		System.out.println("Java 8 Stream example to filter only even number : \n");

		// List of Integer - source
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
		Predicate<Integer> myCondition=i -> i % 2 == 0;
		// Stream filter to get only EVEN numbers
		List<Integer> filterEvenNumbers = numbers // original source
				.stream() // 1. get stream from source
				.filter(myCondition) // 2. intermediate operation to get even numbers
				.collect(Collectors.toList()); // 3. terminal operation to produce result

		// print to console using Java 8 forEach
		filterEvenNumbers.forEach(i -> System.out.println(i));
	}
}