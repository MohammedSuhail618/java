package com.wipro.java.oops.polymorphism.practice;

public class ShapePolymorphismDemo {
    public static void main(String[] args) {
        // Creating objects using parent class reference
        Shape shape1 = new Shape();
        Shape circle = new Circle();
        Shape rectangle = new Rectangle();

        // Demonstrating polymorphic method calls
        System.out.println("--- Shape Demonstrations ---");
        shape1.draw();    // Generic shape
        circle.draw();    // Circle
        rectangle.draw(); // Rectangle
    }
}