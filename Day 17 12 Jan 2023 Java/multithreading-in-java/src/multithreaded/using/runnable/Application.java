package multithreaded.using.runnable;

public class Application {
	public static void main(String[] args) throws InterruptedException {
		MyThread1 myThread1 = new MyThread1();
		MyThread2 myThread2 = new MyThread2();
		Thread thread1 = new Thread(myThread1);
		Thread thread2 = new Thread(myThread2);
		
		thread1.start();
		thread2.start();
	}
}
