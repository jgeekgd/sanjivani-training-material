package multithreaded.using.runnable.compute.time;

public class Application {
	public static long mainBeginTime;
	public static long mainEndTime;
	public static long t1BeginTime;
	public static long t1EndTime;
	public static long t2BeginTime;
	public static long t2EndTime;

	public static void main(String[] args) throws InterruptedException {

		mainBeginTime = System.currentTimeMillis();
		System.out.println("Main Start: " + mainBeginTime + " miliseconds");

		MyThread1 myThread1 = new MyThread1();
		MyThread2 myThread2 = new MyThread2();

		Thread thread1 = new Thread(myThread1);
		thread1.start();
		Thread thread2 = new Thread(myThread2);
		thread2.start();

		// When we invoke the join() method on a thread, the calling thread goes into a
		// waiting state. It remains in a waiting state until the referenced thread
		// terminates.
		// thread1.join();
		// thread2.join();

		mainEndTime = System.currentTimeMillis();
		System.out.println("Main Stop: " + System.currentTimeMillis() + "miliseconds");
		System.out.println("Thread1 Total Time: " + (mainBeginTime - mainEndTime) + " miliseconds");

		Thread.sleep(3000);
		timeReport();
	}

	public static void timeReport() {
		long main = mainEndTime - mainBeginTime;
		long t1 = t1EndTime - t1BeginTime;
		long t2 = t2EndTime - t2BeginTime;
		System.out.println("Total Main:"+main);
		System.out.println("Total T1:"+t1);
		System.out.println("Total T2:"+t1);

		double average=(double)(main+t1+t2)/3L;
		System.out.println("Avergae Main, T1, T2 Time:"+average);

	}
}
