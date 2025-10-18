/**
 * InvoiceObjectCreation.java
 * Scenario: Generate invoice objects from transaction IDs.
 * Task: Use a constructor reference.
 *
 * Sample Output:
 * Invoice{id='TXN1001', amount=500.0}
 * Invoice{id='TXN1002', amount=750.0}
 * Invoice{id='TXN1003', amount=1200.0}
 */
import java.util.*;
import java.util.function.Function;

public class InvoiceObjectCreation {
    static class Invoice {
        String id;
        double amount;
        // Constructor for constructor reference
        Invoice(String id) { this.id = id; this.amount = 0.0; }
        @Override public String toString() {
            return String.format("Invoice{id='%s', amount=%.1f}", id, amount);
        }
    }

    public static void main(String[] args) {
        List<String> txnIds = List.of("TXN1001", "TXN1002", "TXN1003");

        // Constructor reference: Equivalent to (s) -> new Invoice(s)
        Function<String, Invoice> ctor = Invoice::new;

        // Map IDs to Invoices, then enrich amounts (e.g., fetched from elsewhere)
        List<Invoice> invoices = new ArrayList<>();
        for (String id : txnIds) {
            Invoice inv = ctor.apply(id);
            inv.amount = switch (id) {
                case "TXN1001" -> 500.0;
                case "TXN1002" -> 750.0;
                default -> 1200.0;
            };
            invoices.add(inv);
        }

        invoices.forEach(System.out::println);
    }
}
