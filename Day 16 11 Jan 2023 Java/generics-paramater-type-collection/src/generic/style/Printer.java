package generic.style;

/**
 * 
 * Generics means parameterized types.
 * 
 * A generic type is a generic class or interface that is parameterized over
 * types.
 * 
 * Generic Type can be used for
 * 
 * - class
 * 
 * - interface
 * 
 * - method arguments.
 * 
 * - in collections (with wild cards)
 * 
 * Read:https://stackoverflow.com/questions/4343202/difference-between-super-t-and-extends-t-in-java
 * 
 */

public class Printer<T> {
	T value;

	public Printer(T value) {
		super();
		this.value = value;
	}

	public void print() {
		System.out.println(value);
	}

}
