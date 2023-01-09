package objects.equals.demo;

import java.util.UUID;

/**
 * 
 * Since Object.hashCode() and System.identityHashCode() do not provide IDs that
 * are guaranteed to be unique, I think the correct answer is to generate a UUID
 * or GUID: java.util.UUID.randomUUID() This answer is thread-safe and will work
 * across different virtual machines.
 * 
 * For example, the Identifiable class could be extended as follows to provide
 * any class with a unique ID:
 *
 */

abstract class Identifiable {
	public final UUID id = UUID.randomUUID();
}

class Example extends Identifiable {
}

public class Main {
	public static void main(String[] args) {

		Example example1 = new Example();
		Example example2 = new Example();
		Example example3 = example1;
		System.out.println(example1.id.toString()); // e.g. 8308798d-7cec-427d-b7f8-7be762f3b5c7
		System.out.println(example2.id.toString()); // e.g. 4408798d-7cec-427d-b7f8-7be762f3b5c7
		System.out.println(example3.id.toString()); // e.g. 8308798d-7cec-427d-b7f8-7be762f3b5c7
		System.out.println(example1.id.equals(example1.id)); // true
		System.out.println(example1.id.equals(example2.id)); // false
		System.out.println(example1.id.equals(example3.id)); // true
	}

}
