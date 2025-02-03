package com.wipro.java.oops.polymorphism;

// parent class 
// structure - getters and setter
public class Car {
	
	private String companyName;
	private String carType;

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getCarType() {
		return carType;
	}

	public void setCarType(String carType) {
		this.carType = carType;
	}

	public void carDetails() {
		System.out.println("Company : "+ companyName);
		System.out.println("Car Type : "+ carType);
	}


}