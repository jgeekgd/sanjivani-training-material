package _10.java8.stream.api.demo;

import java.util.Arrays;
import java.util.List;

public class ParallelStreamExample {
	public static void main(String[] args) {
		// create a list
		List<String> list = Arrays.asList("Hello ", "G", "E", "E", "K", "S!");
		// using parallelStream()
		// method for parallel stream
		list.parallelStream().forEach(System.out::print);
	}
}
