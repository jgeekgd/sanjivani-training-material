package innerclasses.Anonymous.Inner.Classes;

/**
 * Way 2: As an implementer of the specified interface
 * 
 */

//Java Program to Illustrate Anonymous Inner Classes
//Declaration Without Any Name
//As an implementer of Specified interface

//Interface
interface Hello {

	// Method defined inside interface
	void show();
}

//Main class
public class Main2 {

	// Class implementing interface
	static Hello h = new Hello() {

		// Method 1
		// show() method inside main class
		@Override
		public void show() {
			// Print statement
			System.out.println("i am in anonymous class");
		}
	};

	// Method 2
	// Main driver method
	public static void main(String[] args) {
		// Calling show() method inside main() method
		h.show();
	}
}
