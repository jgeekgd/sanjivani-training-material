package innerclasses.Nested.Inner.Class;

/**
 * Java Program to Demonstrate Nested class
 * 
 * Type 1: Nested Inner Class or Member Inner class
 * 
 * It can access any private instance variable of the outer class. Like any
 * other instance variable, we can have access modifier private, protected,
 * public, and default modifier. Like class, an interface can also be nested and
 * can have access specifiers.
 * 
 * 
 * An object or instance of a member's inner class always exists within an
 * object of its outer class. The new operator is used to create the object of
 * member inner class with slightly different syntax.
 * 
 * OuterClassObjectReference.new MemberInnerClassConstructor();
 * 
 * Example: obj.new Inner();
 * 
 * 
 * Internal working of Java member inner class The java compiler creates two
 * class files in the case of the inner class. The class file name of the inner
 * class is "Outer$Inner". If you want to instantiate the inner class, you must
 * have to create the instance of the outer class. In such a case, an instance
 * of inner class is created inside the instance of the outer class.
 * 
 * 
 * Check the generated class using- javap -v Outer$Inner.class etc. 
 */

//Class 1
//Helper classes
class Outer {

	// Class 2
	// Simple nested inner class
	class Inner {

		// show() method of inner class
		public void show() {

			// Print statement
			System.out.println("In a nested class method");
		}
	}
}

//Class 2
//Main class
public class Main {

	// Main driver method
	public static void main(String[] args) {

		// Note how inner class object is created inside
		// main()
		Outer.Inner in = new Outer().new Inner();

		// Calling show() method over above object created
		in.show();
	}
}
