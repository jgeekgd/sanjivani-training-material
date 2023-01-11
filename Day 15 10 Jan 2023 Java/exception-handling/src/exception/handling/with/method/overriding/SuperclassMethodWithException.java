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
class Super {
	void m1() throws RuntimeException {
		System.out.println("parent m1 method");
	}

	void m2() throws Exception {
		System.out.println("parent m2 method");
	}

	void m3() throws Exception {
		System.out.println("parent m2 method");
	}

}

public class SuperclassMethodWithException extends Super {

	/**
	 * Overriding the method in child class gives compile time error:
	 * 
	 * Rule 1: If SuperClass declares an exception and SubClass declares exceptions
	 * other than the child exception of the SuperClass declared Exception. Not
	 * allowed
	 * 
	 */
	@Override
	void m1() throws Exception { // Exception Exception is not compatible with throws clause in Super.m1()
		System.out.println("child m1 method");
	}

	/**
	 * Rule 2: If SuperClass declares an exception and SubClass declares a child
	 * exception of the SuperClass declared Exception. Allowed
	 */

	@Override
	void m2() throws IOException {
		System.out.println("child m2 method");
	}

	/**
	 * Rule 3: If SuperClass declares an exception and SubClass declares without
	 * exception. Allowed
	 */

	@Override
	void m3() {
		System.out.println("child m3 method");
	}

	public static void main(String args[]) throws Exception {
		Super s = new SuperclassMethodWithException();
		s.m1();
		s.m2();
		s.m3();
	}
}

/**
 * Conclusions:=>
 * 
 * As perceived from above 3 examples in order to handle such exceptions, the
 * following conclusions derived are as follows:
 * 
 * If SuperClass does not declare an exception, then the SubClass can only
 * declare unchecked exceptions, but not the checked exceptions.
 * 
 * If SuperClass declares an exception, then the SubClass can only declare the
 * same or child exceptions of the exception declared by the SuperClass and any
 * new Runtime Exceptions, just not any new checked exceptions at the same level
 * or higher.
 * 
 * If SuperClass declares an exception, then the SubClass can declare without
 * exception.
 * 
 * An overriding method can throw any unchecked exceptions, regardless of
 * whether the overridden method throws exceptions or not. However, the
 * overriding method should not throw checked exceptions that are new or broader
 * than the ones declared by the overridden method. The overriding method can
 * throw narrower or fewer exceptions than the overridden method.
 * 
 * 
 * 
 * Can we override a super class method that is throwing an unchecked exception
 * with a checked exception in the subclass?
 * 
 * No, you cannot.
 * 
 * The sub-class method cannot throw any checked exception not covered by the
 * throws clause of the base super class method.
 * 
 * In other words, the sub-class method can throw a checked exception only if it
 * appears in the throws clause of the super class method or if it is a
 * sub-class of an exception that appears in that throws clause.
 * 
 * This makes sense, since a user of the super class is only aware of the
 * contract of the super class method, so how would they know that they have to
 * catch some additional exception not mentioned in the throws clause of the
 * super class? They can't and shouldn't be aware of all the sub-classes that
 * override that method (some of which may not have been written yet).
 * 
 */
