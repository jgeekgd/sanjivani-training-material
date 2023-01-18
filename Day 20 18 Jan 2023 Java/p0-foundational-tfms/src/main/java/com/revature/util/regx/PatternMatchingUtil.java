package com.revature.util.regx;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatchingUtil {

	public static void main(String[] args) throws InterruptedException {

		//demo1();

		//demo2();

		demo3();

		// demo4Extras();
		// Extra example:
		// https://github.com/WebJournal/journaldev/tree/master/CoreJavaProjects/CoreJavaExamples/src/com/journaldev/regex
		// https://regex101.com/
	}

	private static void demo1() {
		Pattern pattern = Pattern.compile(".xx."); // single dot means matches any single character must be present
		Matcher matcher = pattern.matcher("MxxY");
		System.out.println("Input String 'MxxY' matches regex '.xx.' : " + matcher.matches());
		matcher = pattern.matcher("xxY");
		System.out.println("Input String 'xxY' matches regex '.xx.' : " + matcher.matches());

		/**
		 * Below bad regular expression
		 * 
		 * Exception in thread "main" java.util.regex.PatternSyntaxException: Dangling
		 * meta character '*' near index 0 *
		 * 
		 * pattern = Pattern.compile("*yy*");
		 * 
		 */
	}

	private static void demo2() {
		String str = "bbb"; //
		System.out.println("Using String matches method 'bbb' matches '.bb': " + str.matches(".bb")); //
		System.out.println("Using Pattern matches method 'bbb' matches '.bb': " + Pattern.matches(".bb", str));
	}

	private static void demo3() {

		/**
		 * 
		 * Some important methods of Pattern and Matcher classes.
		 * 
		 * 1. We can create a Pattern object with flags. For example
		 * Pattern.CASE_INSENSITIVE enables case insensitive matching.
		 * 
		 * 2. Pattern class also provides split(String) method that is similar to String
		 * class split() method.
		 * 
		 * 3. Pattern class toString() method returns the regular expression String from
		 * which this pattern was compiled.
		 * 
		 * 4. Matcher classes have start() and end() index methods that show precisely
		 * where the match was found in the input string.
		 * 
		 * 5. Matcher class also provides String manipulation methods replaceAll(String
		 * replacement) and replaceFirst(String replacement).
		 * 
		 */

		// using pattern with flags
		Pattern pattern = Pattern.compile("ab", Pattern.CASE_INSENSITIVE);
		Matcher matcher = pattern.matcher("ABcabdAb");
		// using Matcher find(), group(), start() and end() methods
		while (matcher.find()) {
			System.out.println("Found the text \"" + matcher.group() + "\" starting at " + matcher.start()
					+ " index and ending at index " + matcher.end());
		}

		// using Pattern split() method
		pattern = Pattern.compile("\\W");
		String[] words = pattern.split("one@two#three:four$five");
		for (String s : words) {
			System.out.println("Split using Pattern.split(): " + s);
		}

		// using Matcher.replaceFirst() and replaceAll() methods
		pattern = Pattern.compile("1*2");
		matcher = pattern.matcher("11234512678");
		System.out.println("Using replaceAll: " + matcher.replaceAll("_"));
		System.out.println("Using replaceFirst: " + matcher.replaceFirst("_"));
	}

	private static void demo4Extras() {
		System.out.println(Pattern.matches("..", ".a")); //
		System.out.println(Pattern.matches("ad.$", "ade")); //
		System.out.println(Pattern.matches("^d.", "ada")); //
		System.out.println(Pattern.matches("d.", "da")); //
		System.out.println(Pattern.matches("[ab]x", "cx")); //
		System.out.println(Pattern.matches("^[abc]d.", "ad9")); //
		System.out.println(Pattern.matches("[ab].d$", "bad")); //
		System.out.println(Pattern.matches("[ab]x", "cx")); //
		System.out.println(Pattern.matches("[ab][12].", "a2#")); //
		System.out.println(Pattern.matches("[ab]..[12]", "acd2")); //
		System.out.println(Pattern.matches("[ab][12]", "c2")); //
		System.out.println(Pattern.matches("[^ab][^12].", "c3#")); //
		System.out.println(Pattern.matches("[^ab]..[^12]", "xcd3")); //
		System.out.println(Pattern.matches("[^ab][^12]", "c2")); //
		System.out.println(Pattern.matches("[a-e1-3].", "d#")); //
		System.out.println(Pattern.matches("[a-e1-3]", "2")); //
		System.out.println(Pattern.matches("[a-e1-3]", "f2")); //
		System.out.println(Pattern.matches("x.|y", "xa")); //
		System.out.println(Pattern.matches("x.|y", "y")); //
		System.out.println(Pattern.matches("x.|y", "yz")); //
		System.out.println(Pattern.matches("[a-zA-Z_0-9]", "9"));
	}

}
