package org.example;

public class Calculator {
    public double calculateSumAndProductRatio(double firstOperand, double secondOperand) {
        double sum = firstOperand + secondOperand;
        double product = firstOperand * secondOperand;
        return sum / product;
    }

    public void printResult(double result) {
        System.out.println("Result: " + result);
    }

    public double calculateAverage(double firstOperand, double secondOperand) {
        return (firstOperand + secondOperand) / 2.0;
    }

    public static void main(String[] args) {
        Calculator c = new Calculator();
        double result = c.calculateSumAndProductRatio(2, 3);
        c.printResult(result);
    }
}
