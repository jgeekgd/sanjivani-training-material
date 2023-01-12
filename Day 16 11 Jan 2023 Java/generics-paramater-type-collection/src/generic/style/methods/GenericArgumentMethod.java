package generic.style.methods;

public class GenericArgumentMethod {
	public static void main(String[] args) {
//		printAnything("Superman");
//		printAnything('A');
//		printAnything(1000.123456789);
//		printAnything(2300);

		printAnything("Hi", "Hi");
		printAnything("Hi", new String("Hi"));
		printAnything(100, (int) 100.923);
		printAnything(97, (int) 'a');

	}

	// private static <GD> void printAnything(GD anything) {
	// System.out.println(anything);
	// }

	private static <T> void printAnything(T anything) {
		System.out.println(anything);
	}

	private static <T, V> void printAnything(T anything, V anyOtherThing) {
		System.out
				.println(anything == anyOtherThing ? anything + "==" + anyOtherThing : anything + "!=" + anyOtherThing);
	}

	//With return type
	private static <T, V> T printAnything(T anything, V anyOtherThing, String action) {
		return anything;
	}

}

//In jdk Comparator uses Generics
//
//public interface Comparator<T> {
//	 int compare(T o1, T o2);
//}


