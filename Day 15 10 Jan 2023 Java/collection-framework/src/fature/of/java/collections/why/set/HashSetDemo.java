package fature.of.java.collections.why.set;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/*
 * HashSet class which is implemented in the collection framework is an inherent implementation of the hash table data structure. 
 * The objects that we insert into the HashSet do not guarantee to be inserted in the same order. 
 * The objects are inserted based on their hashcode. 
 * This class also allows the insertion of NULL elements.
*/
public class HashSetDemo {

	 public static void main(String args[])
	    {
	        // Creating an object of Set class
	        // Declaring object of Integer type
	        Set<Integer> a = new HashSet<Integer>();
	        
	        // Adding all elements to List
	        a.addAll(Arrays.asList(new Integer[] { 1, 3, 2, 4, 8, 9, 0 }));
	        System.out.println(a);
	       
	        // Again declaring object of Set class
	        // with reference to HashSet
	        Set<Integer> b = new HashSet<Integer>();
	        b.addAll(Arrays.asList(new Integer[] { 1, 3, 7, 5, 4, 0, 7, 5 }));
	        System.out.println(b);
	         
	        // To find union
	        Set<Integer> union = new HashSet<Integer>(a);
	        //Adds all of the elements in the specified collection to this set if they're not already present 
	        System.out.println(union.addAll(b));
	        System.out.print("Union of the two Set");
	        System.out.println(union);
	 
	        // To find intersection
	        Set<Integer> intersection = new HashSet<Integer>(a);
	        //retainAll(collection)	This method is used to retain all the elements from the set which are mentioned in the given collection. 
	        //This method returns true if this set changed as a result of the call.
	        //removes from this set all of its elements that are not contained in the specified collection. If the specified collection is also a set, this operation effectively modifies this set so that its value is the intersection of the two sets.

	        System.out.println(intersection.retainAll(b));
	        System.out.print("Intersection of the two Set");
	        System.out.println(intersection);
	 
	        // To find the symmetric difference
	        Set<Integer> difference = new HashSet<Integer>(a);

	        //Removes from this set all of its elements that are contained in the specified collection. 
	        //If the specified collection is also a set, this operation effectively modifies this set so that its value is the asymmetric set difference of the two sets.
	        System.out.println(difference.removeAll(b));
	        System.out.print("Difference of the two Set");
	        System.out.println(difference);
	    }
	}

/*
 * 
 * The set interface is present in java.util package and extends the Collection
 * interface is an unordered collection of objects in which duplicate values
 * cannot be stored. It is an interface that implements the mathematical set.
 * This interface contains the methods inherited from the Collection interface
 * and adds a feature that restricts the insertion of the duplicate elements.
 * There are two interfaces that extend the set implementation namely SortedSet
 * and NavigableSet.
 * 
 * Since a set doesn’t retain the insertion order, the navigable set interface provides the implementation to navigate through the Set. 
 * The class which implements the navigable set is a TreeSet which is an implementation of a self-balancing tree. 
 * Therefore, this interface provides us with a way to navigate through this tree.
 
 * Operations on the Set Interface
 * 
 * The set interface allows the users to perform the basic mathematical
 * operation on the set. Let’s take two arrays to understand these basic
 * operations. Let set1 = [1, 3, 2, 4, 8, 9, 0] and set2 = [1, 3, 7, 5, 4, 0, 7,
 * 5]. Then the possible operations on the sets are:
 * 
 * 1. Intersection: This operation returns all the common elements from the
 * given two sets. For the above two sets, the intersection would be:
 * Intersection = [0, 1, 3, 4] 
 * 
 * 2. Union: This operation adds all the elements in
 * one set with the other. For the above two sets, the union would be:
 * Union = [0, 1, 2, 3, 4, 5, 7, 8, 9] 
 * 
 * 3. Difference: This operation removes all
 * the values present in one set from the other set. For the above two sets, the
 * difference would be:
 * Difference = [2, 8, 9]
 */