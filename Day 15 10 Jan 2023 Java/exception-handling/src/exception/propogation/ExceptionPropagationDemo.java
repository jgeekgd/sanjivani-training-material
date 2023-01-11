package exception.propogation;

/**
 * Exception Propagation:
 * 
 * An exception is first thrown from the top of the stack and if it is not
 * caught, it drops down the call stack to the previous method. If not caught
 * there, the exception again drops down to the previous method, and so on until
 * they are caught or until they reach the very bottom of the call stack. This
 * is called exception propagation.
 *
 */
public class ExceptionPropagationDemo {
	void p() throws  Exception  {
		n();
	}

	void n() throws  Exception {
		m();
	}

	void m() throws  Exception {
		throw new Exception("My Exception Message");
	}

	public static void main(String args[]) throws  Exception {
		ExceptionPropagationDemo obj = new ExceptionPropagationDemo();
		obj.p();
		System.out.println("main ends...");
	}
}

/**
 Exception in thread "main" java.lang.Exception: My Exception Message
	at exception.propogation.ExceptionPropagationDemo.m(ExceptionPropagationDemo.java:23)
	at exception.propogation.ExceptionPropagationDemo.n(ExceptionPropagationDemo.java:19)
	at exception.propogation.ExceptionPropagationDemo.p(ExceptionPropagationDemo.java:15)
	at exception.propogation.ExceptionPropagationDemo.main(ExceptionPropagationDemo.java:28)

*/
