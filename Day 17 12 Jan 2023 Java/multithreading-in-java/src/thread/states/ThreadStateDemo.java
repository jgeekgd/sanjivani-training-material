package thread.states;

//Java program to demonstrate thread states
class MyThread implements Runnable {
	public void run() {
		// moving thread2 to timed waiting state
		try {
			Thread.sleep(1500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		System.out.println(
				"State of thread1 while it called join() method on thread2 -" + ThreadStateDemo.thread1.getState());
		try {
			Thread.sleep(200);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}

public class ThreadStateDemo implements Runnable {
	public static Thread thread1;
	public static ThreadStateDemo obj;

	public static void main(String[] args) {
		obj = new ThreadStateDemo();
		thread1 = new Thread(obj);

		// thread1 created and is currently in the NEW
		// state.
		System.out.println("State of thread1 after creating it - " + thread1.getState());
		thread1.start();

		// thread1 moved to Runnable state
		System.out.println("State of thread1 after calling .start() method on it - " + thread1.getState());
	}

	public void run() {
		MyThread myThread = new MyThread();
		Thread thread2 = new Thread(myThread);

		// thread1 created and is currently in the NEW
		// state.
		System.out.println("State of thread2 after creating it - " + thread2.getState());
		thread2.start();

		// thread2 moved to Runnable state
		System.out.println("State of thread2 after calling .start() method on it - " + thread2.getState());

		// moving thread1 to timed waiting state
		try {
			// moving thread1 to timed waiting state
			Thread.sleep(200);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("State of thread2 after calling .sleep() method on it - " + thread2.getState());

		try {
			// thread1 waiting for thread2 to die
			thread2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("State of thread2 when it has finished it's execution - " + thread2.getState());
	}
}

/**
 * A thread state. A thread can be in one of the following states:
 * 
 * NEW
 * 
 * A thread that has not yet started is in this state.
 * 
 * RUNNABLE:=>
 * 
 * A thread executing in the Java virtual machine is in this state.
 * 
 * BLOCKED:=>
 * 
 * A thread that is blocked waiting for a monitor lock is in this state.
 * 
 * WAITING:=>
 * 
 * A thread that is waiting indefinitely for another thread to perform a
 * particular action is in this state.
 * 
 * TIMED_WAITING:=>
 * 
 * A thread that is waiting for another thread to perform an action for up to a
 * specified waiting time is in this state.
 * 
 * TERMINATED:=>
 * 
 * A thread that has exited is in this state. A thread can be in only one state
 * at a given point in time. These states are virtual machine states which do
 * not reflect any operating system thread states.
 * 
 * https://www.baeldung.com/java-thread-lifecycle
 * 
 */
