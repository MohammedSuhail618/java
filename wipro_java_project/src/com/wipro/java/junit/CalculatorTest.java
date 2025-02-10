package com.wipro.java.junit;

import org.junit.Test;
import static org.junit.Assert.assertEquals; // Correct import

public class CalculatorTest {

    private final Calculator calculator = new Calculator();

    @Test
    public void testAdd() {
        int result = calculator.add(3, 2);
        assertEquals(5, result); // Correct usage
    }

    @Test
    public void testSubtract() {
        int result = calculator.subtract(5, 3);
        assertEquals(2, result); // Correct usage
    }

    @Test
    public void testAddWithNegativeNumbers() {
        int result = calculator.add(-3, -2);
        assertEquals(-5, result); // Correct usage
    }

    @Test
    public void testSubtractWithNegativeNumbers() {
        int result = calculator.subtract(-3, -2);
        assertEquals(-1, result); // Correct usage
    }
}