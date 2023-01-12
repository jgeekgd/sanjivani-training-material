package multithreaded.using.runnable.compute.time;

public class MyThread1 implements Runnable {

	@Override
	public void run() {
		Application.t1BeginTime = System.currentTimeMillis();
		System.out.println("Thread1 Start: " + Application.t1BeginTime + " miliseconds");

		for (int i = 1; i < 123; i++) {
			System.out.println("t1():--->" + (char) i);
		}
		Application.t1EndTime = System.currentTimeMillis();
		System.out.println("Thread1 Stop: " + System.currentTimeMillis() + "miliseconds");
		System.out.println("Thread1 Total Time: " + (Application.t1EndTime - Application.t1BeginTime) + " miliseconds");

	}

}
