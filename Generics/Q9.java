package generics;
import java.util.*;

class Cart<T> {
    private List<T> items = new ArrayList<>();

    void addItem(T item) { items.add(item); }
    void removeItem(T item) { items.remove(item); }
    void displayItems() { items.forEach(System.out::println); }
}

public class Q9 {
    public static void main(String[] args) {
        Cart<String> electronicsCart = new Cart<>();
        electronicsCart.addItem("Laptop");
        electronicsCart.addItem("Phone");

        Cart<String> clothesCart = new Cart<>();
        clothesCart.addItem("Shirt");
        clothesCart.addItem("Jeans");

        System.out.println("Electronics:");
        electronicsCart.displayItems();

        System.out.println("Clothes:");
        clothesCart.displayItems();
    }
}

