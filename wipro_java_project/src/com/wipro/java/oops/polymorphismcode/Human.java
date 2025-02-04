package com.wipro.java.oops.polymorphismcode;

public class Human {
	
	private String name;
	private String gender;
	private int age;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void humanDetails() {
		System.out.println("Name : "+ name);
		System.out.println("Gender : "+ gender);
		System.out.println("Age : "+ age);
	}
}
