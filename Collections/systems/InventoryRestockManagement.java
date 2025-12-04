import java.util.*;

class Product {
    String name;
    double price;
    int stock;

    Product(String name, double price, int stock) {
        this.name = name;
        this.price = price;
        this.stock = stock;
    }

    @Override
    public String toString() {
        return "Product{" + name + ", price=" + price + ", stock=" + stock + "}";
    }
}

public class InventoryRestockManagement {

    public static void main(String[] args) {
        Set<String> productNames = new HashSet<>();
        List<Product> products = new ArrayList<>();
        Queue<Product> restockQueue = new LinkedList<>();
        Stack<Product> restockedStack = new Stack<>();

        // add products
        addProduct("Milk", 50, 2, productNames, products);
        addProduct("Bread", 30, 10, productNames, products);
        addProduct("Milk", 55, 3, productNames, products); // duplicate name ignored

        int threshold = 5;
        for (Product p : products) {
            if (p.stock < threshold) {
                restockQueue.add(p);
            }
        }

        System.out.println("Restock queue:");
        for (Product p : restockQueue) System.out.println(p);

        while (!restockQueue.isEmpty()) {
            Product p = restockQueue.remove();
            p.stock += 10;
            restockedStack.push(p);
            System.out.println("Restocked: " + p);
        }

        System.out.println("\nUndo last restock if needed:");
        if (!restockedStack.isEmpty()) {
            Product p = restockedStack.pop();
            p.stock -= 10;
            System.out.println("Undo restock: " + p);
        }
    }

    private static void addProduct(String name, double price, int stock,
                                   Set<String> productNames, List<Product> products) {
        if (productNames.add(name)) {
            products.add(new Product(name, price, stock));
        } else {
            System.out.println("Duplicate product ignored: " + name);
        }
    }
}
