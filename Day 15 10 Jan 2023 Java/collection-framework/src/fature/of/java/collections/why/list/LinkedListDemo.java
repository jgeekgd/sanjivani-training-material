package fature.of.java.collections.why.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class LinkedListDemo {
	public static void main(String args[]) {

		List l1 = new ArrayList(); // prefer for method arguments
		ArrayList l2 = new ArrayList(); // local variable inside method not arguments
		List<String> l3 = new ArrayList<String>(); // Best & prefer way, type safe collection - Generics

		LinkedList<String> al = new LinkedList<String>();
		al.add("Ravi");
		al.add("Vijay");
		al.add("Ravi");
		al.add("Ajay");

		Iterator<String> itr = al.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}

/*
 * LinkedList implements the Collection interface. It uses a doubly linked list
 * internally to store the elements. It can store the duplicate elements. It
 * maintains the insertion order and is not synchronized. In LinkedList, the
 * manipulation is fast because no shifting is required.
 */