/**
 * 
 */
package com.wipro.java.oops;

/**
 * 
 */
public class Flower {
	String name;
	int height;

	/**
	 * 
	 */
	Flower(String name, int height) {
		this.name = name;
		this.height= height;
		// TODO Auto-generated constructor stub
	}
	void display() {
		System.out.println(name + ": " + height + " cm");
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		new Flower("Sunflower", 65).display();
		new Flower("Rose", 45).display();
		
		// TODO Auto-generated method stub

	}

}
