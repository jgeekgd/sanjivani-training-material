package fature.of.java.collections.why;

public class Main {

	// A collection represents a group of objects, 
	// known as its elements. 
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Car c1=new Car();
		Car c2=new Car();
		Car c3=new Car();
		
		Car [] cars=new Car[3];
		cars[0]=c1;
		cars[1]=c2;
		cars[2]=c3;
		
		
		Object [] anything=new Object[10];
		anything[0]=c1;
		anything[1]=new AirConditioner();
		
	}
	
}

class Car{
	
}

class AirConditioner{
	
}


/*
 * The important interfaces in the Collections API are:
 * 
 * Iterable - guarantees the collection can be iterated over 
 * List - an ordered collection Set - a collection does not contain duplicates 
 * Queue - a collection that operates on a first-in-first-out (FIFO) basis 
 * Map - contains key/value pairs. Does not extend Iterable. 
 * 
 * Collections Class The Collections class - not to be confused with the Collection interface.
 * Collections Class defines many static helper methods which operate on any given collection. 
 * Use this class for help with sorting, searching, reversing, or performing other operations on collections.
 *
 */