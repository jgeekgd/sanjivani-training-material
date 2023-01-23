package _07.java8.java.util.function.demo;

import java.util.function.Predicate;

class CheckForValidAge implements Predicate<Integer> {
	@Override
	public boolean test(Integer val) {
		return val != null && val.intValue() > 0;
	}
}

public class PredicateDemo {
	public static void main(String[] args) {
		Integer age = -10;
		Predicate<Integer> chekAge = new CheckForValidAge();
		boolean result = chekAge.test(age);
		System.out.println("Age" + age + " is: " + (result ? "Valid" : "Invalid"));

		// Lambada Easy Way No Need to Write class and override method
		Predicate<Integer> chekAgSmart = (val) -> val != null && val.intValue() > 0;
		boolean resultLambda = chekAgSmart.test(age);
		System.out.println("Age" + age + " is: " + (resultLambda ? "Valid" : "Invalid"));

	}
}
