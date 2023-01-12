package multithreaded.using.thread;

public class Application {
	public static void main(String[] args) throws InterruptedException {
		MyThread1 myThread1 = new MyThread1();
		MyThread2 myThread2 = new MyThread2();
		myThread1.start();
		myThread2.start();
	}
}
