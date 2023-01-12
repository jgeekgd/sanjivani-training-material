package generic.style.advanced.wildcards;

import java.util.ArrayList;
import java.util.List;

public class Possible {
	public static void main(String[] args) {
		List<Integer> intList = new ArrayList<Integer>();
		intList.add(10);
		intList.add(20);
		printList(intList); // possible due to wildcard

		List<String> stringList = new ArrayList<String>();
		stringList.add("Ten");
		stringList.add("Twenty");
		printList(stringList); // possible due to wildcard

	}

	private static void printList(List<?> anyList) {
		System.out.println(anyList);
	}

//	--- Bounded Generics With Wild Card ---
//	private static void printList(List<? extends Animal> anyList) {
//		System.out.println(anyList);
//	}

// VIMP: Note, we cannt have both above methods as first method will allow even parameters of second methods you will get compile error.
// Compile Error: Erasure of method printList(List<? extends Animal>) is the same as another method in type Possible
// Erasure- the removal of all traces of something or the removal of writing, recorded material, or data.
// https://stackoverflow.com/questions/22860582/java-generics-wildcard-vs-type-parametere
	
}
