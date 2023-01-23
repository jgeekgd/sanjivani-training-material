package _09.java8.method.references;

import java.util.Arrays;

public class Test2 {
	public static void main(String[] args) {
		String[] stringArray = { "Barbara", "James", "Mary", "John", "Patricia", "Robert", "Michael", "Linda" };
		//Arrays.sort(stringArray, String::compareToIgnoreCase);
		//Arrays.stream(stringArray).forEach(num -> System.out.println(num));

		stringArray = new String[] { "Barbara", "James", "Mary", "John", "Patricia", "Robert", "Michael", "Linda" };
		// Arrays.sort(stringArray, String::concat);
		Arrays.sort(stringArray, Test2::comparisonGd);
		Arrays.stream(stringArray).forEach(num -> System.out.println(num));

		//
	}

	public static int comparisonGd(String s1, String s3) {
		if (s1.length() > s3.length())
			return 1;
		else if (s1.length() < s3.length())
			return -1;
		else if (s1.length() == s3.length())
			return 0;
		else
			return 0;
	}

}

/*
// 
Barbara		Mary
James		John
John		James
Linda		Linda
Mary		Robert
Michael		Barbara
Patricia	Michael
Robert		Patricia

//
*/
 