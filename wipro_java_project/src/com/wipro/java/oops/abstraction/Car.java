package com.wipro.java.oops.abstraction;

// Abstract class Car
public abstract class Car {
    // Abstract methods (must be implemented by subclasses)
    public abstract void fuelType();
    public abstract void carType();

    // Concrete methods (common behavior)
    public void startEngine() {
        System.out.println("Engine is starting...");
    }

    public void stopEngine() {
        System.out.println("Engine is stopping...");
    }
}