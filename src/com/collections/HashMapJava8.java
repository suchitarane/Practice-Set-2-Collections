package com.collections;

import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;
import java.util.stream.Collectors;

public class HashMapJava8 
{
	public static void main(String[] args) {

		Map<Integer, String> map = new HashMap();

		map.put(222, "pawan");
		map.put(222, "Suchita");
		map.put(111, "pawan");
		map.put(111, "rahul");
		map.put(222, "Suchita");
		
		System.out.println("Before Sorting: ");
        System.out.println(map);
        
        HashMap<Integer, String> sortedHashMap = map.entrySet().stream().sorted(Entry.comparingByKey()).collect(Collectors.toMap(Entry::getKey, Entry::getValue, (e1,  e2) -> e1, LinkedHashMap::new));
        		//entrySet() create a set out of the same elements contained in the hash map
        		//keyMapper: A mapping function to produce the map keys for each input stream element.
        		//valueMapper: A mapping function to produce the map values for each input stream element.
        		//mergeFunction:A binary operator which is to resolve collisions between values associated with the same key. The inputs to this function are the values which belong to the same key.
        		//mapSupplier:A function which provides a new instance of the desired implementation of the Map.
        		//Map.Entry interface in Java provides certain methods to access the entry in the Map.
        
        System.out.println("After Sorting: ");
        System.out.println(sortedHashMap);
	}


}
