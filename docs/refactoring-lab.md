# Refactoring Lab

## Rename Variables / Methods Refactoring Example in Java

### Before refactoring

```java
public class Calculator {
    public double calc(double a, double b) {
        double x = a + b;
        double y = a * b;
        return x / y;
    }

    public void prtRes(double res) {
        System.out.println("Result: " + res);
    }
}
```

### After refactoring

```java
public class Calculator {
    public double calculateSumAndProductRatio(double firstOperand, double secondOperand) {
        double sum = firstOperand + secondOperand;
        double product = firstOperand * secondOperand;
        return sum / product;
    }

    public void printResult(double result) {
        System.out.println("Result: " + result);
    }
}
```
