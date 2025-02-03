package com.wipro.java.oops.polymorphism;


// Child class inheriting Car(Parent) class
public class Tata extends Car {

	public void carDetails() {
		System.out.println("Brand : "+ getCompanyName());
		System.out.println("Car Type : "+ getCarType());
	}
	
	public static void main(String args[]) {
	 
		Car car = new Tata();
		car.setCarType("XUV");
		car.setCompanyName("TATA");
		car.carDetails();
    }
}