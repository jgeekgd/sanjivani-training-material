package _10.java8.stream.api.demo;

import java.util.Arrays;
import java.util.List;

public class SequentialStreamDemo {
	public static void main(String[] args) {
		// create a list
		List<String> list = Arrays.asList("Hello ", "G", "E", "E", "K", "S!");
		
		// we are using stream() method for sequential stream
		// Iterate and print each element of the stream
		
		list.stream().forEach(System.out::print);
	}
}