package com.wipro.java.oops.polymorphism;

//Child class inheriting Car(Parent) classx
public class Tesla extends Car {

	public void carDetails() {
		System.out.println("Brand : "+ getCompanyName());
		System.out.println("Car Type : "+ getCarType());
	}
	
	public static void main(String args[]) {
		 
		Car car = new Tesla();
		car.setCarType("EV");
		car.setCompanyName("Tesla");
		car.carDetails();
    }

}
