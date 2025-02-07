package com.wipro.java.java8;

interface Shape {
    double area(double l, double w);

    default void display(String n) {
        System.out.println("Shape: " + n);
    }

    default int sides() {
        return 0;
    }

    static void formula() {
        System.out.println("Area varies.");
    }

    static Shape create(String t) {
        return switch (t.toLowerCase()) {
            case "rectangle" -> new Rectangle();
            case "triangle" -> new Triangle();
            default -> null;
        };
    }
}

class Rectangle implements Shape {
    public double area(double l, double w) {
        return l * w;
    }

    public int sides() {
        return 4;
    }
}

class Triangle implements Shape {
    public double area(double b, double h) {
        return 0.5 * b * h;
    }

    public int sides() {
        return 3;
    }
}

public class ShapeExample { // Class name changed
    public static void main(String[] args) {
        Shape r = Shape.create("rectangle");
        if (r != null) {
            r.display("Rectangle");
            System.out.println("Area: " + r.area(5, 10));
            System.out.println("Sides: " + r.sides());
            Shape.formula();
        }

        Shape t = Shape.create("triangle");
        if (t != null) {
            t.display("Triangle");
            System.out.println("Area: " + t.area(6, 8));
            System.out.println("Sides: " + t.sides());
            Shape.formula();
        }

        if (Shape.create("circle") == null) {
            System.out.println("Unknown shape.");
        }
    }
}