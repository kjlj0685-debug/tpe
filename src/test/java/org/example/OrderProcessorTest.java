package org.example;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class OrderProcessorTest {
    @Test
    public void testPrintOrderSummaryIncludesTotalPrice() {
        Customer customer = new Customer("Alice", true);
        Item item = new Item("Widget", 10.0, 2);
        Order order = new Order(customer, List.of(item));

        ByteArrayOutputStream output = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(output));
        try {
            new OrderProcessor().printOrderSummary(order);
        } finally {
            System.setOut(originalOut);
        }

        String printed = output.toString();
        assertTrue(printed.contains("Order Summary:"));
        assertTrue(printed.contains("Total Price: $18.00"));
    }
}
