package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {

    @Test
    void testCalculateAverage() {
        Calculator calculator = new Calculator();

        double result = calculator.calculateAverage(4, 6);

        assertEquals(5.0, result);
    }

    @Test
    void testCalculateAverageNegative() {
        Calculator calculator = new Calculator();

        double result = calculator.calculateAverage(-2, -4);

        assertEquals(-3.0, result);
    }

    @Test
    void testCalculateAverageZero() {
        Calculator calculator = new Calculator();

        double result = calculator.calculateAverage(0, 0);

        assertEquals(0.0, result);
    }
}