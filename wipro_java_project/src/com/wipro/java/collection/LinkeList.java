package com.wipro.java.collection;
import java.util.LinkedList;
import java.util.List;

public class LinkeList {

	
	public static void main(String[] args) {
		int n=10;
		List<Integer>list1=new LinkedList<Integer>();
		
		for(int i =4;i<=n; i++)
			list1.add(i);
		System.out.println(list1);
		
		//remove
		list1.remove(4);
		System.out.println(list1);
		
		//onebyone
		for(int i =0; i<list1.size(); i++)
			System.out.println(list1.get(i) + " ");
		

	}

}
