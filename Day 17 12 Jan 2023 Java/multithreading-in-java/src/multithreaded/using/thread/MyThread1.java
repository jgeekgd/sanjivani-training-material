package multithreaded.using.thread;

public class MyThread1 extends Thread {
	@Override
	public void run() {
		for (int i = 33; i < 126; i++) {
			System.out.println("t1():---"+((char) i)+" --->" + String.format("\\u%04x", i));
		}
	}

}
