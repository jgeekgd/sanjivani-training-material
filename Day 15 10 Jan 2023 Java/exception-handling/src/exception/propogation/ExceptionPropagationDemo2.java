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
public class ExceptionPropagationDemo2 {
	void p() {
		try {
			n();
		} catch (Exception e) {
			System.out.println("Exception caught");
		}
	}

	void n() {
		m();
	}

	void m() {
		int data = 50 / 0;
	}

	public static void main(String args[]) {
		ExceptionPropagationDemo2 obj = new ExceptionPropagationDemo2();
		obj.p();
		System.out.println("main ends...");
	}
}