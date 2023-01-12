package multithreaded.using.runnable;

public class MyThread2 implements Runnable {

	@Override
	public void run() {
		for (int i = 1; i < 123; i++) {
			System.out.println("t2():--->" + (char) i);
		}
	}

}
