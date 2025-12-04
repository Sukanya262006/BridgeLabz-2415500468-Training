import java.util.*;

class Order {
    String orderId;
    String item;
    double amount;
    boolean processed;
    boolean failed;

    Order(String orderId, String item, double amount) {
        this.orderId = orderId;
        this.item = item;
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "Order{" + orderId + ", item='" + item + "', amount=" + amount + "}";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Order)) return false;
        Order order = (Order) o;
        return Objects.equals(orderId, order.orderId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(orderId);
    }
}

public class EcommerceOrderProcessing {

    public static void main(String[] args) {
        List<Order> allOrders = new ArrayList<>();
        allOrders.add(new Order("O1", "Phone", 50000));
        allOrders.add(new Order("O2", "TV", 30000));
        allOrders.add(new Order("O1", "Phone-DUP", 50000)); // duplicate

        System.out.println("All orders:");
        for (Order o : allOrders) System.out.println(o);

        Set<Order> uniqueOrders = new HashSet<>(allOrders);
        System.out.println("\nUnique orders:");
        for (Order o : uniqueOrders) System.out.println(o);

        Queue<Order> processingQueue = new LinkedList<>(uniqueOrders);
        Stack<Order> failedStack = new Stack<>();

        System.out.println("\nProcessing orders:");
        while (!processingQueue.isEmpty()) {
            Order o = processingQueue.remove();
            // dummy rule: orders with amount > 40000 fail first time
            if (o.amount > 40000 && !o.failed) {
                System.out.println("Order failed, pushing to failed stack: " + o);
                o.failed = true;
                failedStack.push(o);
            } else {
                o.processed = true;
                System.out.println("Processed: " + o);
            }
        }

        System.out.println("\nRe-processing failed orders:");
        while (!failedStack.isEmpty()) {
            Order o = failedStack.pop();
            System.out.println("Re-processed successfully: " + o);
        }
    }
}
