package multithreaded.using.runnable.compute.time;

public class MyThread2 implements Runnable {

	@Override
	public void run() {
		Application.t2BeginTime = System.currentTimeMillis();
		System.out.println("Thread2 Start: " + Application.t2BeginTime + " miliseconds");

		for (int i = 1; i < 123; i++) {
			System.out.println("t2():--->" + (char) i);
		}
		Application.t2EndTime = System.currentTimeMillis();
		System.out.println("Thread2 Stop: " + System.currentTimeMillis() + "miliseconds");
		System.out.println("Thread2 Total Time: " + (Application.t2EndTime - Application.t2BeginTime) + " miliseconds");

	}

}
