package exceptionhandling;

/**
 * 
 * The IllegalArgumentException is an unchecked exception in Java that is thrown
 * to indicate an illegal or unsuitable argument passed to a method. It is one
 * of the most common exceptions that occur in Java. Since
 * 
 * IllegalArgumentException is an unchecked exception, it does not need to be
 * declared in the throws clause of a method or constructor.
 *
 * What Causes IllegalArgumentException An IllegalArgumentExceptioncode> occurs
 * when an argument passed to a method doesn't fit within the logic of the usage
 * of the argument. Some of the most common scenarios for this are:
 * 
 * When the arguments passed to a method are out of range. For example, if a
 * method declares an integer age as a parameter, which is expected to be a
 * positive integer. If a negative integer value is passed, an
 * IllegalArgumentException will be thrown. When the format of an argument is
 * invalid. For example, if a method declares a string email as a parameter,
 * which is expected in an email address format. If a null object is passed to a
 * method when it expects a non-empty object as an argument.
 * 
 */
class Person {
	int age;
	public void setAge(int age) {// throws IllegalArgumentException{  ---> even throws not required since it unchecked exception
		if (age < 0) {
			throw new IllegalArgumentException("Age must be greater than zero");
		} else {
			this.age = age;
		}
	}
}

//Since no try and catch block the exception is sent back to system/jvm for handling it.

public class ThrowDemo {
	public static void main(String[] args) {
		Person person = new Person();
		person.setAge(-1);
	}

}
