package without.synchronizedblock;

/**
 * 
 * Synchronized Block in Java Synchronized block can be used to perform
 * synchronization on any specific resource of the method.
 * 
 * Suppose we have 50 lines of code in our method, but we want to synchronize
 * only 5 lines, in such cases, we can use synchronized block.
 * 
 * If we put all the codes of the method in the synchronized block, it will work
 * same as the synchronized method.
 * 
 * Points to Remember
 * 
 * 1.Synchronized block is used to lock an object for any shared resource.
 * 
 * 2.Scope of synchronized block is smaller than the method.
 * 
 * 3.A Java synchronized block doesn't allow more than one JVM, to provide
 * access control to a shared resource.
 * 
 * 4.The system performance may degrade because of the slower working of
 * synchronized keyword.
 * 
 * 5.Java synchronized block is more efficient than Java synchronized method.
 *
 */

class Table {
	void printTable(int n) {
		for (int i = 1; i <= 5; i++) {
			System.out.println(n * i);
			try {
				Thread.sleep(400);
			} catch (Exception e) {
				System.out.println(e);
			}
		}
	}// end of the method
}

class MyThread1 extends Thread {
	Table t;

	MyThread1(Table t) {
		this.t = t;
	}

	public void run() {
		t.printTable(5);
	}

}

class MyThread2 extends Thread {
	Table t;

	MyThread2(Table t) {
		this.t = t;
	}

	public void run() {
		t.printTable(100);
	}
}

public class WithoutSynchronized {
	public static void main(String args[]) {
		Table obj = new Table();// only one object
		MyThread1 t1 = new MyThread1(obj);
		MyThread2 t2 = new MyThread2(obj);
		t1.start();
		t2.start();
	}
}
