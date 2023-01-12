package multithreaded.using.runnable;

public class MyThread1 implements Runnable {

	@Override
	public void run() {
		for (int i = 1; i < 123; i++) {
			System.out.println("t1():--->" + (char) i);
		}
	}

}
