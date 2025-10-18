/**
 * CustomSortingECommerce.java
 * Scenario: Sort products differently based on campaigns (price, rating, discount).
 * Task: Use lambda with Comparator to sort products dynamically.
 *
 * Sample Output (example for campaign="DISCOUNT"):
 * Sorted by DISCOUNT (high -> low):
 * Product{id=103, price=999.0, rating=3.9, discount=40}
 * Product{id=101, price=1999.0, rating=4.3, discount=25}
 * Product{id=102, price=1499.0, rating=4.8, discount=10}
 */
import java.util.*;
public class CustomSortingECommerce {
    static class Product {
        int id;
        double price;
        double rating; // out of 5
        int discount;  // percent

        Product(int id, double price, double rating, int discount) {
            this.id = id; this.price = price; this.rating = rating; this.discount = discount;
        }
        @Override public String toString() {
            return String.format("Product{id=%d, price=%.1f, rating=%.1f, discount=%d}", id, price, rating, discount);
        }
    }

    public static void main(String[] args) {
        List<Product> items = new ArrayList<>(List.of(
            new Product(101, 1999, 4.3, 25),
            new Product(102, 1499, 4.8, 10),
            new Product(103,  999, 3.9, 40)
        ));

        String campaign = "DISCOUNT"; // Try PRICE_ASC, RATING_DESC, DISCOUNT

        Comparator<Product> sorter = switch (campaign) {
            case "PRICE_ASC"   -> (a, b) -> Double.compare(a.price, b.price);
            case "RATING_DESC" -> (a, b) -> Double.compare(b.rating, a.rating);
            case "DISCOUNT"    -> (a, b) -> Integer.compare(b.discount, a.discount);
            default -> (a, b) -> Integer.compare(a.id, b.id);
        };

        items.sort(sorter);

        System.out.println("Sorted by " + campaign + (campaign.equals("PRICE_ASC") ? " (low -> high)" :
                                                    campaign.equals("RATING_DESC") ? " (high -> low)" :
                                                    campaign.equals("DISCOUNT") ? " (high -> low)" : ""));
        items.forEach(System.out::println);
    }
}
