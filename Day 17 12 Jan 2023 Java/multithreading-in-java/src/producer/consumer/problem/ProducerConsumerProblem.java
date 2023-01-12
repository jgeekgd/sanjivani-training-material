package producer.consumer.problem;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Simple Java program to demonstrate How to use wait, notify and notifyAll()
 * method in Java by solving producer consumer problem.
 */
public class ProducerConsumerProblem {
	public static void main(String args[]) {
		System.out.println("How to use wait and notify method in Java for Solving Producer Consumper Problem");
		Queue<String> buffer = new LinkedList<>();
		int maxSize = 2;
		Thread producer = new Producer(buffer, maxSize, "PRODUCER");
		Thread consumer = new Consumer(buffer, maxSize, "CONSUMER");
		producer.start();
		consumer.start();
	}
}

/**
 * Producer Thread will keep producing values for Consumer to consumer.
 * 
 * It will use wait() method when Queue is full and use notify() method to send
 * notification to Consumer Thread.
 */
class Producer extends Thread {
	private Queue<String> queue;
	private int maxSize;

	public Producer(Queue<String> queue, int maxSize, String name) {
		super(name);
		this.queue = queue;
		this.maxSize = maxSize;
	}

	@Override
	public void run() {
		while (true) {
			synchronized (queue) {
				while (queue.size() == maxSize) {
					try {
						System.out.println("Queue is full, " + "Producer thread "+Thread.currentThread().getName()+" waiting for "
								+ "consumer to take something from queue");
						queue.wait();
						//Thread.sleep(3000);
					} catch (Exception ex) {
						ex.printStackTrace();
					}
				}
				String i=PasswordUtil.randomPassword();
				System.out.println("Producing value : " + i);
				queue.add(i);
				queue.notifyAll();
			}
		}
	}
}

/**
 * Consumer Thread will consumer values form shared queue.
 * 
 * It will also use wait() method to wait if queue is empty. It will also use
 * notify method to send notification to producer thread after consuming values
 * from queue.
 */
class Consumer extends Thread {
	private Queue<String> queue;
	private int maxSize;

	public Consumer(Queue<String> queue, int maxSize, String name) {
		super(name);
		this.queue = queue;
		this.maxSize = maxSize;
	}

	@Override
	public void run() {
		while (true) {
			synchronized (queue) {
				while (queue.isEmpty()) {
					System.out.println("Queue is empty," + "Consumer thread "+Thread.currentThread().getName()+" is waiting"
							+ " for producer thread to put something in queue");
					try {
						queue.wait();
						//Thread.sleep(3000);
					} catch (Exception ex) {
						ex.printStackTrace();
					}
				}
				System.out.println("Consuming value : " + queue.remove());
				queue.notifyAll();
				
			}
		}
	}
}
