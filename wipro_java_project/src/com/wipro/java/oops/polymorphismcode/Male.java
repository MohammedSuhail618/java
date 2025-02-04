package com.wipro.java.oops.polymorphismcode;


public class Male extends Human {
	
	public void humanDetails() {
		System.out.println("Name : "+ getName());
		System.out.println("Gender : "+ getGender());
		System.out.println("Age : "+ getAge());
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Human m = new Male();
		m.setName("Arjun");
		m.setGender("Male");
		m.setAge(28);
		m.humanDetails();

	}

}
