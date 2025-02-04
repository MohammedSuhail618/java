package com.wipro.java.oops.polymorphismcode;


public class Female extends Human{

	public void humanDetails() {
		System.out.println("Name : "+ getName());
		System.out.println("Gender : "+ getGender());
		System.out.println("Age : "+ getAge());
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Human f = new Female();
		f.setName("Rithika");
		f.setGender("Female");
		f.setAge(47);
		f.humanDetails();
	}

}
