package _08.java8.optional;

import java.util.Optional;

//https://www.baeldung.com/java-optional

public class OptionalDemo {
	public static void main(String[] args) {
		// To create an empty Optional object, we simply need to use its empty() static
		// method:

		Optional<String> empty = Optional.empty();
		System.out.println(empty.isPresent()); // This method returns true if the wrapped value is not null.

		// We can also create an Optional object with the static method of():
		Optional<String> opt1 = Optional.of("Gd"); // public static <T> Optional<T> of(T value) {
		System.out.println(opt1.isPresent());

		// However, the argument passed to the of() method can't be null. Otherwise,
		// we'll get a NullPointerException:
		String name = null;
		// Optional<String> opt2 = Optional.of(name); // public static <T> Optional<T>
		// of(T value) {

		// By doing this, if we pass in a null reference, it doesn't throw an exception
		// but rather returns an empty Optional object:
		Optional<String> opt3 = Optional.ofNullable(name);
		System.out.println(opt3.isPresent());

		name = "Java";
		Optional<String> opt4 = Optional.of(name);
		opt4.ifPresent(val -> System.out.println(val.length()));

		String username = null;
		String result = Optional.ofNullable(username).orElse("admin");
		System.out.println(result);

		// Throw exception
		// Optional.ofNullable(username).orElseThrow(IllegalArgumentException::new);

		//
		Optional<String> opt = Optional.of("Java");
		String technology = opt.get();
		System.out.println(technology);
	}
}
