package com.wipro.java.collection;

import java.util.*;

public class Collections{

    public static void main(String[] args) {

        // 1. ArrayList Operations
        List<String> arrayList1 = new ArrayList<>();
       
        arrayList1.add("Apple");
        arrayList1.add("Banana");
        arrayList1.add("Orange");
        
        System.out.println("ArrayList1: " + arrayList1); 
        System.out.println("ArrayList1 get(1): " + arrayList1.get(1)); 
        arrayList1.remove(0);
        System.out.println("ArrayList1 after remove(0): " + arrayList1);
        
        List<String> arrayList2 = new ArrayList<>();
        arrayList2.add("PineApple");
        arrayList2.add("Papaya");
        
        System.out.println("ArrayList2: " + arrayList2); 
        System.out.println("ArrayList2 get(1): " + arrayList2.get(1)); 
        arrayList2.remove(0);
        System.out.println("ArrayList2 after remove(0): " + arrayList2);
        System.out.println("\n");
        
     // 2. LinkedList Operations
        List<String> linkedList = new LinkedList<>();
        linkedList.add("Mango");
        linkedList.add("Grapes");
        linkedList.add("Pineapple");
        System.out.println("LinkedList: " + linkedList); 
        linkedList.add(1, "Kiwi"); 
        System.out.println("LinkedList after add(1, 'Kiwi'): " + linkedList);
        System.out.println("\n");
        
     // 3. Map    
        Map<Integer, String> map = new HashMap<>();
		map.put(1, "Corn");
		map.put(2, "Popcorn");
		map.put(3, "Caramel Popcorn");
		
		System.out.println("Key1:"+map.get(1));
		System.out.println("Key2:"+map.get(2));
		
		//check key is present in the map
		if (map.containsKey(3)) {
			System.out.println("Key3 exists:"+ map.get(3));
		}
		
		//Iterating over Map
		System.out.println("Iterating through the map:");
		for(Map.Entry<Integer, String> entry: map.entrySet()) {
			System.out.println(entry.getKey() + ": " + entry.getValue());
		}
		//Remove
		map.remove(2);
		System.out.println("Map after removing");
		for (Map.Entry<Integer, String> entry: map.entrySet()) {
			System.out.println(entry.getKey()+": " + entry.getValue());
				}
        
    }
}