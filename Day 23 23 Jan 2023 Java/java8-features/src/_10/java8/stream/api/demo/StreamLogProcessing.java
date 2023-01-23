package _10.java8.stream.api.demo;

import java.util.Optional;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class StreamLogProcessing {

	public static void main(String[] args) {
		String responseLogContent = "2017-03-23 18:15:18.941  INFO 43699 -- [           main] c.q.springboot.LogdemoApplication \n"
				+ "2017-03-23 18:15:18.954  INFO 43699 -- [           main] c.q.springboot.LogdemoApplication \n"
				+ "2017-03-23 18:15:31.177  WARN 43699 -- [nio-8080-exec-1] c.q.springboot.Service \n"
				+ "2017-03-23 18:15:33.372 ERROR 43699 -- [nio-8080-exec-2] c.q.springboot.Controller \n"
				+ "2017-03-23 18:15:33.372 ERROR 43699 -- [nio-8080-exec-2] c.q.springboot.MainController \n"
				+ "2017-03-23 18:15:33.642 ERROR 43699 -- [nio-8080-exec-3] c.q.springboot.Exception";
		
		String[] allLines = responseLogContent.split("\n");
		Stream<String> stream = Stream.of(allLines);
		/*
		 * The index of the first occurrence of the specified substring, or -1 if there
		 * is no such occurrence. public int indexOf(String str) Parameters: str - the
		 * substring to search for.
		 */
		Predicate<String> anyLineHavingErrorOrException = line -> line.indexOf("ERROR") > -1
				|| line.indexOf("Exception") > -1;

		Optional<String> firstException = stream.filter(anyLineHavingErrorOrException).findFirst();
		System.out.println(firstException.orElse(""));
	}

}
