package nestedinterface.Class.Inside.Interface;

/**
 * 
 * if we define a class inside the interface, the Java compiler creates a static
 * nested class. Let's see how can we define a class within the interface:
 *
 */

interface Yes {
	class Test {
		public void print() {
			System.out.println("Inside interface class");
		}
	}
}

public class Main {
	public static void main(String[] args) {
		new Yes.Test().print();  //static nested class default
	}
}
