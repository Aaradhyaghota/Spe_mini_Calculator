package com.aaradhya;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MainTest {

    @Test
    public void testSqrt() {
        // Test for square root function
        assertEquals(2.0, Main.sqrt(4.0), 0.001);
        assertEquals(3.0, Main.sqrt(9.0), 0.001);
        assertEquals(5.0, Main.sqrt(25.0), 0.001);
    }

    @Test
    public void testFactorial() {
        // Test for factorial function
        assertEquals(120, Main.factorial(5));
        assertEquals(6, Main.factorial(3));
        assertEquals(1, Main.factorial(0));  // Testing factorial of 0, which should return 1
    }

    @Test
    public void testNaturalLog() {
        // Test for natural logarithm function
        assertEquals(0.0, Main.naturalLog(1.0), 0.001);  // ln(1) is 0
        assertEquals(1.0, Main.naturalLog(Math.E), 0.001);  // ln(e) is 1
    }

    @Test
    public void testPower() {
        // Test for power function
        assertEquals(8.0, Main.power(2.0, 3.0), 0.001);
        assertEquals(16.0, Main.power(2.0, 4.0), 0.001);
        assertEquals(1.0, Main.power(5.0, 0.0), 0.001);  // Anything raised to power 0 should be 1
    }
}
