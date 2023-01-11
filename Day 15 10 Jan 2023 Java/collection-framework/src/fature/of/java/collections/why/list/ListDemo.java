package fature.of.java.collections.why.list;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListDemo {

	public static void main(String[] args) {
		// noTypeSafe();
		// typeSafeGenerics();
		typeSafeGenericsIterator();
	}

	public static void typeSafeGenericsIterator() {
		List<Integer> price = new ArrayList<>();
		price.add(100);
		price.add(200);
		price.add(300);
		price.add(400);
		price.add(100);

		// Getting ListIterator
		// An ListIteratorfor lists that allows the programmer to traverse the list in
		// either direction, modify the list during iteration.
		
		ListIterator<Integer> namesIterator = price.listIterator();

		// Traversing elements
		while (namesIterator.hasNext()) {

			// While using iterator dont call next two times unless needed...

			Integer value = namesIterator.next();
			System.out.println(value);
			if (value == 400)
				namesIterator.remove();
		}

		System.out.println(price);
	}

	public static void typeSafeGenerics() {
		List<Integer> price = new ArrayList<>();
		price.add(100);
		price.add(200);
		price.add(300);
		price.add(400);
		price.add(100);

		for (Integer value : price) {
			System.out.println(value);
		}
		System.out.println(price);
	}

	public static void noTypeSafe() {
		List price = new ArrayList(); // WARNING: ArrayList is a raw type. References to generic type ArrayList<E>
										// should be parameterized
		price.add(100);
		price.add("200");
		price.add(300.0f);
		price.add(400.0);
		price.add(100);

		for (int i = 0; i < price.size(); i++) {
			System.out.println(price.get(i));
		}
		System.out.println(price);
	}

}

/*
 * The ArrayList class implements the List interface. It uses a dynamic array to
 * store the duplicate element of different data types. The ArrayList class
 * maintains the insertion order and is non-synchronized. The elements stored in
 * the ArrayList class can be randomly accessed.
 */