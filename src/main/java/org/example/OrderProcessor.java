package org.example;

import java.util.List;

public class OrderProcessor {
    public void printOrderSummary(Order order) {
        double totalPrice = calculateTotalPrice(order.getItems());

        if (order.getCustomer().isMember()) {
            totalPrice *= 0.9;
        }

        System.out.println("Order Summary:");
        System.out.println("Customer: " + order.getCustomer().getName());
        System.out.println("Items:");
        for (Item item : order.getItems()) {
            double itemTotal = item.getQuantity() * item.getPrice();
            System.out.println("  - " + item.getName() + ": " + item.getQuantity() + " x $" + item.getPrice() + " = $" + itemTotal);
        }
        System.out.printf("Total Price: $%.2f%n", totalPrice);
    }

    private double calculateTotalPrice(List<Item> items) {
        double total = 0;
        for (Item item : items) {
            total += item.getPrice() * item.getQuantity();
        }
        return total;
    }
}
