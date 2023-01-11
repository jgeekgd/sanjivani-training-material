package fature.of.java.collections.why.hashtable;

import java.util.Hashtable;

/*
 * The Hashtable class implements a hash table, which maps keys to values. Any non-null object can be used as a key or as a value. 
 * To successfully store and retrieve objects from a hashtable, the objects used as keys must implement the hashCode method and the equals method. 
*/
public class HashTableDemo {
	public static void main(String args[]) {
		// No need to mention the Generic type twice
		Hashtable<Integer, String> ht1 = new Hashtable<>(4);

		// Initialization of a Hashtable using Generics
		Hashtable<Integer, String> ht2 = new Hashtable<Integer, String>(2);

		// Now Java allows this-
		// Hashtable<Integer, String> ht2 = new Hashtable(2);

		// Inserting the Elements
		// using put() method
		ht1.put(1, "one");
		ht1.put(2, "two");
		ht1.put(3, "three");

		ht2.put(4, "four");
		ht2.put(5, "five");
		ht2.put(6, "six");

		ht1.put(1, "1");
		// Print mappings to the console
		System.out.println("Mappings of ht1 : " + ht1);
		System.out.println("Mappings of ht2 : " + ht2);
	}
}

/*
 * Features of Hashtable
 * 
 * It is similar to HashMap, but is synchronized. Hashtable stores key/value
 * pair in hash table. In Hashtable we specify an object that is used as a key,
 * and the value we want to associate to that key. The key is then hashed, and
 * the resulting hash code is used as the index at which the value is stored
 * within the table. The initial default capacity of Hashtable class is 11.
 * 
 * Internal Working of Hashtable Hashtable datastructure is an array of buckets
 * which stores the key/value pairs in them. It makes use of hashCode() method
 * to determine which bucket the key/value pair should map. The hash function
 * helps to determine the location for a given key in the bucket list.
 * Generally, hashcode is a non-negative integer that is equal for equal Objects
 * and may or may not be equal for unequal Objects. To determine whether two
 * objects are equal or not, hashtable makes use of the equals() method. It is
 * possible that two unequal Objects have the same hashcode. This is called a
 * collision. To resolve collisions, hashtable uses an array of lists. The pairs
 * mapped to a single bucket (array index) are stored in a list and list
 * reference is stored in the array index.
 */
