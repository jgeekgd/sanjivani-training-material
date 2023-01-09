package innerclasses.Anonymous.Inner.Classes;

/**
 * 
 * Type 4: Anonymous Inner Classes
 * 
 * Anonymous inner classes are declared without any name at all. They are
 * created in two ways.
 * 
 * As a subclass of the specified type.
 * 
 * As an implementer of the specified interface.
 * 
 * Way 1: As a subclass of the specified type
 * 
 * 
 * Java anonymous inner class is an inner class without a name and for which
 * only a single object is created. An anonymous inner class can be useful when
 * making an instance of an object with certain "extras" such as overloading
 * methods of a class or interface, without having to actually subclass a class.
 * 
 * In simple words, a class that has no name is known as an anonymous inner
 * class in Java. It should be used if you have to override a method of class or
 * interface. Java Anonymous inner class can be created in two ways:
 * 
 * Class (may be abstract or concrete).
 * 
 * Interface
 *
 */
//Class 1
//Helper class
class Demo {

	// Method of helper class
	void show() {
		// Print statement
		System.out.println("i am in show method of super class");
	}
}

//Class 2
//Main class
public class Main {

	// An anonymous class with Demo as base class
	static Demo d = new Demo() {
		// Method 1
		// show() method
		@Override
		void show() {
			// Calling method show() via super keyword
			// which refers to parent class
			super.show();

			// Print statement
			System.out.println("i am in anonymous class of d object");
		}
	};
	
	static Demo d2 = new Demo() {
		// Method 1
		// show() method
		@Override  // its not mandatory to write @Override
		void show() {
			// Calling method show() via super keyword
			// which refers to parent class
			super.show();

			// Print statement
			System.out.println("i am in anonymous class of d2 object");
		}
	};

	// Method 2
	// Main driver method
	public static void main(String[] args) {
		// Calling show() method inside main() method
		//Remember- Actual class files are created with names as Main$1.class...Main$n.class 
		//class innerclasses.Anonymous.Inner.Classes.Main$1 extends innerclasses.Anonymous.Inner.Classes.Demo {
		d.show();
		//class innerclasses.Anonymous.Inner.Classes.Main$2 extends innerclasses.Anonymous.Inner.Classes.Demo {
		d2.show();
	}
}
