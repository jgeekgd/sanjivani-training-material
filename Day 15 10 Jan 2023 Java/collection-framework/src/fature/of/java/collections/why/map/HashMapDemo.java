package fature.of.java.collections.why.map;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {
	public static void main(String args[])
    {
        // Creating an empty HashMap
        Map<String, Integer> hm
            = new HashMap<String, Integer>();
 
        // Inserting pairs in above Map
        // using put() method
        hm.put("a", 100);
        hm.put("b", 200);
        hm.put("c", 300);
        hm.put("d", 400);
        hm.put("a", 500);
        hm.put("a",null);
 
        
        System.out.println(hm);
        
        // Traversing through Map using for-each loop
		
        /*
		 * Iterating over Map.entrySet() using For-Each loop : Map.entrySet() method
		 * returns a collection-view(Set<Map.Entry<K, V>>) of the mappings contained in
		 * this map. So we can iterate over key-value pair using getKey() and getValue()
		 * methods of Map.Entry<K, V>. This method is most common and should be used if
		 * you need both map keys and values in the loop. 
		 * 
		 */
        
        for (Map.Entry<String, Integer> me :
             hm.entrySet()) {
 
            // Printing keys
            System.out.print(me.getKey() + ":");
            System.out.println(me.getValue());
        }
        
		/*
		 * Iterating over keys or values using keySet() and values() methods
		 * Map.keySet() method returns a Set view of the keys contained in this map and
		 * Map.values() method returns a collection-view of the values contained in this
		 * map. So If you need only keys or values from the map, you can iterate over
		 * keySet or values using for-each loops.
		 */ 
        
     // using keySet() for iteration over keys
        for (String key : hm.keySet())
            System.out.println("key: " + key);
         
        // using values() for iteration over values
        for (Integer value : hm.values())
            System.out.println("value: " + value);
    }
}
/*
 * The map interface is present in java.util package represents a mapping
 * between a key and a value. The Map interface is not a subtype of the
 * Collection interface. Therefore it behaves a bit differently from the rest of
 * the collection types. A map contains unique keys. Maps are perfect to use for
 * key-value association mapping such as dictionaries. The maps are used to
 * perform lookups by keys or when someone wants to retrieve and update elements
 * by keys. Some common scenarios are as follows:
 * 
 * A map of error codes and their descriptions. A map of zip codes and cities. A
 * map of managers and employees. Each manager (key) is associated with a list
 * of employees (value) he manages. A map of classes and students. Each class
 * (key) is associated with a list of students (value).
 *
 *
 * Characteristics of a Map Interface
 * 
 * A Map cannot contain duplicate keys and each key can map to at most one
 * value. Some implementations allow null key and null values like the HashMap
 * and LinkedHashMap, but some do not like the TreeMap. The order of a map
 * depends on the specific implementations. For example, TreeMap and
 * LinkedHashMap have predictable orders, while HashMap does not. There are two
 * interfaces for implementing Map in java. They are Map and SortedMap, and
 * three classes: HashMap, TreeMap, and LinkedHashMap.
 * 
 * HashMap is a part of Java’s collection since Java 1.2. It provides the basic implementation of the Map interface of Java. It stores the data in (Key, Value) pairs. To access a value one must know its key. This class uses a technique called Hashing. Hashing is a technique of converting a large String to a small String that represents the same String. A shorter value helps in indexing and faster searches. Let’s see how to create a map object using this class.
 */