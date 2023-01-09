package innerclasses.Static.Nested.Class;

/**
 * 
 * Type 3: Static Nested Classes
 * 
 * Static nested classes are not technically inner classes. They are like a
 * static member of outer class.
 *
 *
 * A static class is a class that is created inside a class, is called a static
 * nested class in Java. It cannot access non-static data members and methods.
 * It can be accessed by outer class name.
 * 
 * It can access static data members of the outer class, including private. The
 * static nested class cannot access non-static (instance) data members or
 * 
 * 
 * Check the name of classes created post compilation by compiler in folder
 */
//Class 1
//Outer class
class Outer {

	// Method
	private static void outerMethod() {

		// Print statement
		System.out.println("inside outerMethod");
	}

	// Class 2
	// Static inner class
	static class Inner {

		public static void display() {

			// Print statement
			System.out.println("inside inner class Method");

			// Calling method inside main() method
			outerMethod();
		}
	}
}

//Class 3
//Main class
public class Main {

	// Main driver method
	public static void main(String args[]) {

		// Calling method static display method rather than an instance of that class.
		Outer.Inner.display();
	}
}
