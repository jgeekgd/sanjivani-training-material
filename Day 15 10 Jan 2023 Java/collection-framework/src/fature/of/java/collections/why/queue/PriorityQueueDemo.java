package fature.of.java.collections.why.queue;

import java.util.Iterator;
import java.util.PriorityQueue;

public class PriorityQueueDemo {

	public static void main(String args[]) {
		//PriorityQueue(): Creates a PriorityQueue with the default initial capacity (11) that orders its elements according to their natural ordering.
		PriorityQueue<String> queue = new PriorityQueue<String>();
		queue.add("Amit");
		queue.add("Vijay");
		queue.add("Bharat");
		queue.add("Martin");

		//public peek(): This method retrieves, but does not remove, the head of this queue, or returns null if this queue is empty.
		//public poll(): This method retrieves and removes the head of this queue, or returns null if this queue is empty.
		
		System.out.println("Head:" + queue.element());
		System.out.println("Head:" + queue.peek());
		
		/*
		 * Iterating the Queue: There are multiple ways to iterate through the Queue.
		 * The most famous way is converting the queue to the array and traversing using
		 * the for loop. However, the queue also has an inbuilt iterator which can be
		 * used to iterate through the queue.
		 */
		System.out.println("Iterating the queue elements:");
		Iterator itr = queue.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
		/*
		 * Removing Elements: In order to remove an element from a queue, we can use the remove() method. 
		 * If there are multiple such objects, then the first occurrence of the object is removed. 
		 * Apart from that, poll() method is also used to remove the head and return it.
		 */
		
		queue.remove();
		queue.poll();
		System.out.println("After removing two elements:");
		Iterator<String> itr2 = queue.iterator();
		while (itr2.hasNext()) {
			System.out.println(itr2.next());
		}
	}
}

/*
 * A PriorityQueue is used when the objects are supposed to be processed based
 * on the priority. It is known that a Queue follows the First-In-First-Out
 * algorithm, but sometimes the elements of the queue are needed to be processed
 * according to the priority, that’s when the PriorityQueue comes into play. The
 * PriorityQueue is based on the priority heap. The elements of the priority
 * queue are ordered according to the natural ordering, or by a Comparator
 * provided at queue construction time, depending on which constructor is used.
 *
 * Few important points on Priority Queue are as follows: 
   1. PriorityQueue doesn’t permit null.
   2. We can’t create PriorityQueue of Objects that are non-comparable
   3. The queue retrieval operations poll,  remove,  peek, and element access the element at the head of the queue.
   4. PriorityQueue is not thread-safe
 */