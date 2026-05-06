package org.example;

public class Calculator {
    public double calculateSum(double firstOperand, double secondOperand) {
        return firstOperand + secondOperand;
    }

    public double calculateProduct(double firstOperand, double secondOperand) {
        return firstOperand * secondOperand;
    }

    public double calculateRatioOfSumToProduct(double firstOperand, double secondOperand) {
        double sum = calculateSum(firstOperand, secondOperand);
        double product = calculateProduct(firstOperand, secondOperand);
        return sum / product;
    }

    public double calculateAverage(double firstOperand, double secondOperand) {
        return calculateSum(firstOperand, secondOperand) / 2.0;
    }

    public void displayResult(double result) {
        System.out.println("Result: " + result);
    }

    public static void main(String[] args) {
        Calculator c = new Calculator();
        double result = c.calculateRatioOfSumToProduct(2, 3);
        c.displayResult(result);
    }
}
