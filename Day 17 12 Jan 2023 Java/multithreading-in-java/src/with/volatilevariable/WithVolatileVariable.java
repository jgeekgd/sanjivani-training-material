package with.volatilevariable;

/**
 * 
 * If two threads run on different processors each thread may have its own local
 * copy of shared variable.
 * 
 * If one thread modifies its value the change might not reflect in the original
 * one in the main memory instantly.
 * 
 * Now the other thread is not aware of the modified value which leads to data
 * inconsistency.
 * 
 * ------------------------------------------------------------------------------
 * Volatile keyword is used to modify the value of a variable by different
 * threads. It is also used to make classes thread safe. It means that multiple
 * threads can use a method and instance of the classes at the same time without
 * any problem. The volatile keyword can be used either with primitive type or
 * objects.
 * 
 * The volatile keyword does not cache the value of the variable and always read
 * the variable from the main memory. The volatile keyword cannot be used with
 * classes or methods. However, it is used with variables.
 *
 * ------------------------------------------------------------------------------
 * Important points
 * 
 * 1.You can use the volatile keyword with variables. Using volatile keyword
 * with classes and methods is illegal.
 * 
 * 2.It guarantees that value of the volatile variable will always be read from
 * the main memory, not from the local thread cache.
 * 
 * 3.If you declared variable as volatile, Read and Writes are atomic
 * 
 * 4.It reduces the risk of memory consistency error.
 * 
 * 5.The volatile variables are always visible to other threads.
 * 
 * 6.The volatile variable that is an object reference may be null.
 * 
 * 7.When a variable is not shared between multiple threads, you do not need to
 * use the volatile keyword with that variable.
 * 
 */

//Java Program to demonstrate the
//use of Volatile Keyword in Java
public class WithVolatileVariable {
	private static volatile int MY_INT = 0;

	public static void main(String[] args) {
		new ChangeListener().start();
		new ChangeMaker().start();
	}

	static class ChangeListener extends Thread {
		@Override
		public void run() {
			int local_value = MY_INT;
			while (local_value < 5) {
				if (local_value != MY_INT) {
					System.out.println("Got Change for MY_INT :" + MY_INT);
					local_value = MY_INT;
				}
			}
		}
	}

	static class ChangeMaker extends Thread {
		@Override
		public void run() {
			int local_value = MY_INT;
			while (MY_INT < 5) {
				System.out.println("Incrementing MY_INT to:" + (local_value + 1));
				MY_INT = ++local_value;
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	}
}
