package exceptionhandling;

/**
 * 
 * The hierchy is
 * 
 * ---java.lang.Object class
 * 
 * ------java.lang.Throwable class
 *  
 * ---------java.lang.Exception class
 * 
 * ------------java.lang.RuntimeException class
 * 
 * Open link:
 * https://docs.oracle.com/en/java/javase/19/docs/api/overview-tree.html
 * https://docs.oracle.com/en/java/javase/19/docs/api/index-files/index-20.html
 * Search for RuntimeException or Throwable or Exception class
 * 
 * 
 */
public class UnchekedExceptionDemo {
	class Car {

	}

	public static void main(String[] args) {
		// Understand Try, Catch, Nested Catch and Finally block
		try {
			Car bmw = null;
			System.out.println(bmw.toString());
			int[] marks = { 10, 20, 30, 40 };
			System.out.println(marks[10]);
			System.out.println("unlable to reach here");
		}
		//catch (Exception e) {
		// System.out.println(e.getMessage() + " Inside Exception Catch");
		// Unreachable catch block for NullPointerException. It is already handled by
		// the catch block for Exception
		//}
		catch (NullPointerException  | IllegalArgumentException e) {
			System.out.println(e.getMessage() + " Inside NullPointerException Catch");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e.getMessage() + " Inside ArrayIndexOutOfBoundsException Catch");
		} catch (Exception e) {
			System.out.println(e.getMessage() + " Inside Exception Catch");
		} finally {
			// finally block in Java can be used to put "cleanup" code such as closing a
			// file, closing connection, etc.
			System.out.println("finally invoked");
		}

		System.out.println("main method ended normally (unlike abnormal termination where no try catch block mentioned");
	}

}
