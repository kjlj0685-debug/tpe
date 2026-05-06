package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {

    @Test
    void testCalculateSum() {
        Calculator calculator = new Calculator();

        double result = calculator.calculateSum(4, 6);

        assertEquals(10.0, result);
    }

    @Test
    void testCalculateProduct() {
        Calculator calculator = new Calculator();

        double result = calculator.calculateProduct(4, 6);

        assertEquals(24.0, result);
    }

    @Test
    void testCalculateRatioOfSumToProduct() {
        Calculator calculator = new Calculator();

        double result = calculator.calculateRatioOfSumToProduct(2, 3);

        assertEquals((2 + 3) / (2.0 * 3.0), result, 1e-9);
    }

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