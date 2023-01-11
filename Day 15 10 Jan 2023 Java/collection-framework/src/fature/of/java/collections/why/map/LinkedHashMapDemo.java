package fature.of.java.collections.why.map;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapDemo {

	public static void main(String[] args)
    {
 
        // Creating an empty LinkedHashMap
        Map<String, Integer> map = new LinkedHashMap<>();
 
        // Inserting pair entries in above Map
        // using put() method
        map.put("vishal", 10);
        map.put("sachin", 30);
        map.put("vaibhav", 20);
        map.put("vaibhav", 30);
 
        // Iterating over Map
        for (Map.Entry<String, Integer> e : map.entrySet())
 
            // Printing ket-value pairs
            System.out.println(e.getKey() + " "
                               + e.getValue());
    }
}

/*
 * LinkedHashMap is just like HashMap with an additional feature of maintaining
 * an order of elements inserted into it. HashMap provided the advantage of
 * quick insertion, search, and deletion but it never maintained the track and
 * order of insertion which the LinkedHashMap provides where the elements can be
 * accessed in their insertion order. Let’s see how to create a map object using
 * this class.
 */