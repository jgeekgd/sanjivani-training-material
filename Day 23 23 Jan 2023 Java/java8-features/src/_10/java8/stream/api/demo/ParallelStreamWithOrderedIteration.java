package _10.java8.stream.api.demo;

import java.io.*;
import java.util.*;
import java.util.stream.*;

public class ParallelStreamWithOrderedIteration {
	public static void main(String[] args) {
		// create a list
		List<String> list = Arrays.asList("Hello ", "G", "E", "E", "K", "S!");
		// using parallelStream() method for parallel stream
		list.parallelStream().forEachOrdered(System.out::print);
	}
}
