package fature.of.java.collections.why.vector;

import java.util.Vector;

public class VectorDemo {
    public static void main(String[] args)
    {
        // Size of the Vector
        int n = 5;
 
        // Declaring the Vector with initial size n
        // Vector(): Creates a default vector of the initial capacity is 10.
        // Vector<E> v = new Vector<E>();
        Vector<Integer> v = new Vector<Integer>(n);
 
        // Appending new elements at
        // the end of the vector
        for (int i = 1; i <= n; i++)
            v.add(i);
 
        // Printing elements
        System.out.println(v);
 
        // Remove element at index 3
        v.remove(3);
 
        // Displaying the vector
        // after deletion
        System.out.println(v);
 
        // iterating over vector elements
        // usign for loop
        for (int i = 0; i < v.size(); i++)
 
            // Printing elements one by one
            System.out.print(v.get(i) + " ");
    }
}

/*
 * Vector implements a dynamic array that means it can grow or shrink as
 * required. Like an array, it contains components that can be accessed using an
 * integer index. 
 * 
 * They are very similar to ArrayList, but Vector is synchronized
 * and has some legacy methods that the collection framework does not contain.
 * 
 * It also maintains an insertion order like an ArrayList. Still, it is rarely
 * used in a non-thread environment as it is synchronized, and due to this, it
 * gives a poor performance in adding, searching, deleting, and updating its
 * elements. 
 * 
 * 
 * If the vector increment is not specified then it’s capacity will be doubled in every increment cycle.
 * The capacity of a vector cannot be below the size, it may equal to it.
 * 
 * Important points regarding the Increment of vector capacity are as follows:
 * If the increment is specified, Vector will expand according to it in each allocation cycle. 
 * Still, if the increment is not specified, then the vector’s capacity gets doubled in each allocation cycle. 
 * Vector defines three protected data members:
	1. int capacityIncreament: Contains the increment value.
	2. int elementCount: Number of elements currently in vector stored in it.
	3. Object elementData[]: Array that holds the vector is stored in it.

 * Common Errors in the declaration of Vectors are as follows:
 	1. Vector throws an IllegalArgumentException if the InitialSize of the vector defined is negative.
	2. If the specified collection is null, It throws NullPointerException. 	
 */