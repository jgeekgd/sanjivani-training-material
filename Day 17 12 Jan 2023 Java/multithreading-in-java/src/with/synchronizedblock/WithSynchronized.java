package with.synchronizedblock;

/**
 * ---------------------------------------------------------------------------
 * Synchronization and Locks: How does synchronization work? With locks.
 * 
 * Every object in Java has a built-in lock that only comes into play when the
 * object has synchronized method code. Since there is only one lock per object,
 * if one thread has picked up the lock, no other thread can enter the
 * synchronized code (which means any synchronized method of that object) until
 * the lock has been released. Typically, releasing a lock means the thread
 * holding the lock (in other words, the thread currently in the synchronized
 * method) exits the synchronized method. At that point, the lock is free until
 * some other thread enters a synchronized method on that object.
 * 
 * 
 * You need to remember the following key points about locking and
 * synchronization:
 * 
 * ■ Only methods can be synchronized, not variables.
 * 
 * ■ Each object has just one lock.
 * 
 * ■ Not all methods in a class must be synchronized. A class can have both
 * synchronized and nonsynchronized methods.
 * 
 * ■ If two methods are synchronized in a class, only one thread can be
 * accessing one of the two methods. In other words, once a thread acquires the
 * lock on an object, no other thread can enter any of the synchronized methods
 * in that class (for that object).
 * 
 * ■ If a class has both synchronized and nonsynchronized methods, multiple
 * threads can still access the nonsynchronized methods of the class! If you
 * have methods that don’t access the data you’re trying to protect, then you
 * don’t need to mark them as synchronized. Synchronization is a performance
 * hit, so you don’t want to use it without a good reason.
 * 
 * ■ If a thread goes to sleep, it takes its locks with it.
 * 
 * ■ A thread can acquire more than one lock. For example, a thread can enter a
 * synchronized method, thus acquiring a lock, and then immediately invoke a
 * synchronized method on a different object, thus acquiring that lock as well.
 * As the stack unwinds, locks are released again. Also, if a thread acquires a
 * lock and then attempts to call a synchronized method on that same object, no
 * problem. The JVM knows that this thread already has the lock for this object,
 * so the thread is free to call other synchronized methods on the same object,
 * using the lock the thread already has.
 * 
 * ■ You can synchronize a block of code rather than a method. Because
 * synchronization does hurt concurrency, you don’t want to synchronize any more
 * code than is necessary to protect your data. So if the scope of a method is
 * more than needed, you can reduce the scope of the synchronized part to
 * something less than a full method—to just a block. We call this, strangely, a
 * “synchronized block,”
 * 
 * ---------------------------------------------------------------------------
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
		synchronized (this) {// synchronized block
			for (int i = 1; i <= 5; i++) {
				System.out.println(n * i);
				try {
					Thread.sleep(400);
				} catch (Exception e) {
					System.out.println(e);
				}
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

public class WithSynchronized {
	public static void main(String args[]) {
		Table obj = new Table();// only one object
		MyThread1 t1 = new MyThread1(obj);
		MyThread2 t2 = new MyThread2(obj);
		t1.start();
		t2.start();
	}
}
