package com.wipro.java.collection;
import java.util.ArrayList;
import java.util.List;

public class ListOperations {

	public ListOperations() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		List<Integer> list1 =new ArrayList<>();
		List<Integer> list2 =new ArrayList<>();

		// Add  to list1
		list1.add(1);
		list1.add(2);
		list1.add(3);

		// Add to list2
		list2.add(4);
		list2.add(5);
		list2.add(6);
		
		System.out.println("List1:"+list1);
		System.out.println("List2:"+list2);
		
		//Add all
		
		list1.addAll(list2);
		System.out.println("List1 after addAll:"+list1);
		
		//Remove
		
		list1.remove(Integer.valueOf(5));
		System.out.println("List1 after remove operations:"+list1);
		
		//Set 
		list1.set(2, 9);
		System.out.println("List1 after set operations:"+list1);
		
		}

}
