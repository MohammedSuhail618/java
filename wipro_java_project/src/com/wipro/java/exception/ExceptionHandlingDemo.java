package com.wipro.java.exception;

public class ExceptionHandlingDemo {

    public static void main(String[] args) {
        try {
            int result = divideNumbers(10, 2);
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage()); // Print the exception message
        } finally {
            System.out.println("Execution completed.");
        }
    }

    public static int divideNumbers(int numerator, int denominator) {
        if (denominator == 0) {
            throw new ArithmeticException("Cannot divide by zero");
        }
        return numerator/denominator;
    }
}