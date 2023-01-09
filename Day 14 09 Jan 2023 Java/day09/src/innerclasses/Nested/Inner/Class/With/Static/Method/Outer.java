package innerclasses.Nested.Inner.Class.With.Static.Method;

/*
 * Java Program to Demonstrate Nested class Where Error is thrown
 * 
 * Note:  We can not have a static method in a nested inner class because an inner class is
 * implicitly associated with an object of its outer class so it cannot define any static method for itself.
 * For example, the following program doesn’t compile. 
 * 
 * But Since JAVA Version 16 we can have static members in our inner class also.
 * 
 * 
 * Eclipse Right Click Run As- Java Application You See Two Options
 * 1. Outer$Inner.class -- main method
 * 2. Outer.class -- main method
 */

//Class 1
//Outer class
public class Outer {

	// Method defined inside outer class
	void outerMethod() {

		// Print statement
		System.out.println("inside outerMethod");
	}

	// Class 2
	// Inner class
	class Inner {

		// Main driver method you can run this as well
		public static void main(String[] args) {

			// Display message for better readability
			System.out.println("inside inner class Method");

			/*
			 * For java 8 below error works only for Jav 16+: Outer.java:21: error: Illegal
			 * static declaration in inner class Outer.Inner public static void
			 * main(String[] args) ^ modifier 'static' is only allowed in constant variable
			 * declarations 1 error
			 * 
			 */

		}
	}

	// Main driver method you can run this as well
	public static void main(String[] args) {
		// Both below works for Java 16+ version
		new Outer().new Inner().main(new String[] { "a" });
		Outer.Inner.main(new String[] { "a" });
	}
}
