package _07.java8.java.util.function.demo;

import java.util.function.Function;

class SquareValue implements Function<Long, Long> {

	// Only one below abstract method inside @FunctionalInterface Function
	@Override
	public Long apply(Long val) {
		return val * val;
	}
}

public class FunctionDemo {

	public static void main(String[] args) {
		Long input = 256L;
		Function<Long, Long> square = new SquareValue();
		Long result = square.apply(input);
		System.out.println("Square of " + input + " is: " + result);

		// Lambada Easy Way No Need to Write class and override method

		Function<Long, Long> smartSuqare = (val) -> val * val;
		Long resultLambda = smartSuqare.apply(input);
		System.out.println("Square of " + input + " is: " + resultLambda);

	}
}
