package fature.of.java.collections.why.queue;

import java.util.ArrayDeque;
import java.util.Deque;

//Deque stands for a double-ended queue which enables us to perform the operations at both the ends
public class ArrayDequeDemo {

	public static void main(String[] args) {
		//ArrayDeque(): This constructor is used to create an empty ArrayDeque and by default holds an initial capacity to hold 16 elements.
		//ArrayDeque<E> dq = new ArrayDeque<E>();
		//ArrayDeque(int numofElements): This constructor is used to create an empty ArrayDeque and holds the capacity to contain a specified number of elements.
		//ArrayDeque<E> dq = new ArrayDeque<E>(int numofElements);

		 Deque<Character> stack = new ArrayDeque<Character>();
	        stack.push('A');
	        stack.push('B');
	        stack.push('C');
	        stack.push('D');
	        stack.push('E');
	        stack.push('F');
		    
	        System.out.println(stack);
	        //peek() The method returns head element without removing it.
	        //pop()	The method pops out an element for stack represented by deque.
	        //push(Element e) The method pushes an element onto stack represented by deque.
	        //size()	Returns the number of elements in this deque.
	        //toArray()	Returns an array containing all of the elements in this deque in proper sequence (from first to the last element).
	        System.out.println(stack.peek());
	        System.out.println(stack);
	        System.out.println(stack.pop());
	        System.out.println(stack);
	}
    

}

/*
 * 
 * The ArrayDeque in Java provides a way to apply resizable-array in addition to
 * the implementation of the Deque interface. 
 * It is also known as Array Double Ended Queue or Array Deck. 
 * This is a special kind of array that grows and allows users to add or remove an element from both sides of the queue.
 * Few important features of ArrayDeque are as follows:  
	1. Array deques have no capacity restrictions and they grow as necessary to support usage.
	2. They are not thread-safe which means that in the absence of external synchronization, ArrayDeque does not support concurrent access by multiple threads.
	3. Null elements are prohibited in the ArrayDeque.
	4. ArrayDeque class is likely to be faster than Stack when used as a stack.
	5. ArrayDeque class is likely to be faster than LinkedList when used as a queue. 
 * ArrayDeque implements both Queue and Deque. It is dynamically resizable from both sides.
 */

