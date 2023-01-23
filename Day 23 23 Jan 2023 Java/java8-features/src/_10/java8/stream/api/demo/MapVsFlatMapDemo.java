package _10.java8.stream.api.demo;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MapVsFlatMapDemo {
	public static void main(String[] args) {
		String[] input = { "This", "is", "This", "not" };

		List<Stream<String>> steramsOfStream = Arrays.stream(input).map(word -> word.split("")).map(Arrays::stream)
				.distinct().collect(Collectors.toList());

		steramsOfStream.forEach(a -> {
			a.forEach(System.out::print);
			System.out.print("\n");
		});

		List<String> listOfStringss = Arrays.stream(input).map(word -> word.split("")).flatMap(Arrays::stream)
				.distinct().collect(Collectors.toList());

		System.out.println(listOfStringss);
	}
}
