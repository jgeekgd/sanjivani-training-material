package deadlock.starvation;

/**
 * 
 * Starvation:In Starvation, threads are also waiting for each other. But here
 * waiting time is not infinite after some interval of time, waiting thread
 * always gets the resources whatever is required to execute thread run()
 * method.
 * 
 * Due to high priorities threads low priority thread starve
 *
 * Thread Priority:
 * 
 * Each thread has a priority. Priorities are represented by a number between 1
 * and 10. In most cases, the thread scheduler schedules the threads according
 * to their priority (known as preemptive scheduling). But it is not guaranteed
 * because it depends on JVM specification that which scheduling it chooses.
 * Note that not only JVM a Java programmer can also assign the priorities of a
 * thread explicitly in a Java program.
 * 
 * 
 * Here 3 constants are defined in it namely as follows:
 * 
 * public static int NORM_PRIORITY :The default priority is set to 5 as
 * excepted.
 * 
 * public static int MIN_PRIORITY: Minimum priority is set to 1.
 * 
 * public static int MAX_PRIORITY: Maximum priority is set to 10.
 *
 * 
 */
//Java program to illustrate Starvation concept
public class StarvationDemo extends Thread {
	static int threadcount = 1;

	public void run() {
		System.out.println(threadcount + "st Child" + " Thread execution starts. " + Thread.currentThread().getName()
				+ "[" + Thread.currentThread().getPriority() + "]");
		System.out.println("Child thread execution completes");
		threadcount++;
	}

	public static void main(String[] args) throws InterruptedException {
		System.out.println("Main thread execution starts");

		// Thread priorities are set in a way that thread5
		// gets least priority.
		StarvationDemo thread1 = new StarvationDemo();
		thread1.setPriority(10);
		StarvationDemo thread2 = new StarvationDemo();
		thread2.setPriority(9);
		StarvationDemo thread3 = new StarvationDemo();
		thread3.setPriority(8);
		StarvationDemo thread4 = new StarvationDemo();
		thread4.setPriority(7);
		StarvationDemo thread5 = new StarvationDemo();
		thread5.setPriority(6);

		thread1.start();
		thread2.start();
		thread3.start();
		thread4.start();

		// Here thread5 have to wait because of the
		// other thread. But after waiting for some
		// interval, thread5 will get the chance of
		// execution. It is known as Starvation
		thread5.start();

		System.out.println("Main thread execution completes");
	}
}
