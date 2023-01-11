package exception.handling.with.method.overriding;

import java.io.IOException;

/**
 * 
 * 
 * Exception Handling with Method Overriding in Java There are many rules if we
 * talk about method overriding with exception handling.
 * 
 * Some of the rules are listed below:
 * 
 * If the superclass method does not declare an exception:=
 * 
 * If the superclass method does not declare an exception, subclass overridden
 * method cannot declare the checked exception but it can declare unchecked
 * exception.
 * 
 * If the superclass method declares an exception:=
 * 
 * If the superclass method declares an exception, subclass overridden method
 * can declare same, subclass exception or no exception but cannot declare
 * parent exception.
 *
 */
class Parent {
	void m1() {
		System.out.println("parent m1 method");
	}

	void m2() {
		System.out.println("parent m2 method");
	}
}

public class SuperclassMethodNoException extends Parent {

	/**
	 * Overriding the method in child class gives compile time error:
	 * 
	 * Rule 1: If the superclass method does not declare an exception, subclass
	 * overridden method cannot declare the checked exception.
	 * 
	 */
	@Override
	void m1() throws IOException {  // Exception IOException is not compatible with throws clause in Parent.m1()
		System.out.println("child m1 method");
	}

	/**
	 * Rule 2: If the superclass method does not declare an exception, subclass
	 * overridden method cannot declare the checked exception but can declare
	 * unchecked exception.
	 */
	
	@Override
	void m2() throws NullPointerException {
		System.out.println("child m2 method");
	}

	public static void main(String args[]) {
		Parent p = new SuperclassMethodNoException();
		p.m1();
		p.m2();
	}
}
