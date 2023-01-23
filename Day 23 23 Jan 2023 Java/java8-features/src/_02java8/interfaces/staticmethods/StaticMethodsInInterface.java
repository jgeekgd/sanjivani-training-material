package _02java8.interfaces.staticmethods;

/**
 * Java program to demonstrate scope of static method in Interface.
 *
 */
interface PrintDemo {

	// Static Method
	public static void hello() {
		System.out.println("Called from Interface PrintDemo");
	}

	/**
	 * If you declare final method inside interface its not allowed.
	 * 
	 * You will get compiler error as below- Multiple markers at this line -
	 * Abstract methods do not specify a body - Illegal modifier for the interface
	 * method bye;
	 * 
	 * only public, private, abstract, default, static and strictfp are permitted
	 * public final void bye() {
	 * 
	 * }
	 * 
	 */
}

public class StaticMethodsInInterface implements PrintDemo {
	/**
	 * Class Static method is defined
	 */

	public static void hello() {
		System.out.println("Called from Class");
	}

	public static void main(String[] args) {

		StaticMethodsInInterface.hello();
		StaticMethodsInInterface objec1 = new StaticMethodsInInterface();
		objec1.hello();

		/**
		 * You will get below compile time error for this code:
		 * 
		 * PrintDemo objec2 = new StaticMethodsInInterface();
		 * 
		 * objec2.hello(); //Error:This static method of interface PrintDemo can only be
		 * accessed as PrintDemo.hello
		 * 
		 */

		PrintDemo.hello();

	}

}
