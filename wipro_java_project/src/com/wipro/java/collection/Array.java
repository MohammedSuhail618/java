package com.wipro.java.collection;

public class Array {

	

	public static void main(String[] args) {
		
		int[] arr;
		arr= new int[5];
		arr[0]=2;
		arr[1]=4;
		arr[2]=6;
		arr[3]=8;
		arr[4]=10;
		
		System.out.println("Elements of the array are:");
		for(int i = 0; i < arr.length; i++)
		{
			System.out.println(arr[i]);
		}

	}

}
