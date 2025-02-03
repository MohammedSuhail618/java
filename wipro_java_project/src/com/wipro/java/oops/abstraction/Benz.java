package com.wipro.java.oops.abstraction;

public class Benz extends Car {
	public void fuelType() {
		System.out.println("Benz runs on Diesel.");
	}
	
	public void carType() {
		System.out.println("Benz is super luxury car.");
		// TODO Auto-generated constructor stub
	}
	public static void main(String[] args) {
		Car myCar = new Benz();
		myCar.carType();
		myCar.fuelType();
		myCar.startEngine();
		myCar.startEngine();
		
	}
}
