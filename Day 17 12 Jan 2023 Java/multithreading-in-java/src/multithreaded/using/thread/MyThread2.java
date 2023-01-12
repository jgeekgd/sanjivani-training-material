package multithreaded.using.thread;

public class MyThread2 extends Thread {

	@Override
	public void run() {
		for (int i = 33; i < 126; i++) {
			System.out.println("t2()---"+((char) i)+" --->" + String.format("\\u%04x", i));
		}
	}

}
