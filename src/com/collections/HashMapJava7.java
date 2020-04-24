package com.collections;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class HashMapJava7 {
	public static void main(String[] args) {

		Map<Integer, String> hashMap = new HashMap();
		Map<Integer, String> treeMap = new TreeMap<>(hashMap);

		hashMap.put(222, "Suchita");
		hashMap.put(111, "pawan");
		hashMap.put(111, "rahul");
		hashMap.put(222, "Suchita");
		
		System.out.println("Before Sorting: ");
        System.out.println(hashMap);
        
        treeMap.putAll(hashMap);
        
        System.out.println("After Sorting: ");
        System.out.println(treeMap);
	}

}
