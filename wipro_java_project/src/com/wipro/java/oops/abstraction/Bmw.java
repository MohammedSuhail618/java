package com.wipro.java.oops.abstraction;

// BMW class extending the abstract Car class
public class Bmw extends Car {
    @Override
    public void fuelType() {
        System.out.println("BMW runs on petrol.");
    }

    @Override
    public void carType() {
        System.out.println("BMW is a luxury sports car.");
    }

    public static void main(String[] args) {
        Car myCar = new Bmw();
        myCar.startEngine();
        myCar.carType();
        myCar.fuelType();
        myCar.stopEngine();
    }
}
