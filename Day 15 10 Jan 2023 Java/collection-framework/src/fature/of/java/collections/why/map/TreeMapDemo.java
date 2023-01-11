package fature.of.java.collections.why.map;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapDemo {
	public static void main(String[] args)
    {
 
        // Creating an empty TreeMap
        Map<String, Integer> map = new TreeMap<>();
 
        // Inserting custom elements in the Map
        // using put() method
        map.put("vishal", 10);
        map.put("sachin", 30);
        map.put("vaibhav", 20);
        map.put("vaishnavi", 30);
 
        // Iterating over Map using for each loop
        for (Map.Entry<String, Integer> e : map.entrySet())
 
            // Printing key-value pairs
            System.out.println(e.getKey() + " "
                               + e.getValue());
    }
}

//In order to add an element to the map, we can use the put() method. However, the insertion order is not retained in the hashmap. Internally, for every element, a separate hash is generated and the elements are indexed based on this hash to make it more efficient.
//After adding the elements if we wish to change the element, it can be done by again adding the element with the put() method. Since the elements in the map are indexed using the keys, the value of the key can be changed by simply inserting the updated value for the key for which we wish to change. 
//In order to remove an element from the Map, we can use the remove() method. This method takes the key value and removes the mapping for a key from this map if it is present in the map.
//There are multiple ways to iterate through the Map. The most famous way is to use a for-each loop and get the keys. The value of the key is found by using the getValue() method.

/*
 * The TreeMap in Java is used to implement the Map interface and NavigableMap
 * along with the Abstract Class. The map is sorted according to the natural
 * ordering of its keys, or by a Comparator provided at map creation time,
 * depending on which constructor is used. This proves to be an efficient way of
 * sorting and storing the key-value pairs. The storing order maintained by the
 * treemap must be consistent with equals just like any other sorted map,
 * irrespective of the explicit comparators.
 */ 