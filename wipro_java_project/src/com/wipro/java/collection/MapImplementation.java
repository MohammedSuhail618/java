package com.wipro.java.collection;
import java.util.HashMap;
import java.util.Map;



public class MapImplementation {

	public static void main(String[] args) {
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
