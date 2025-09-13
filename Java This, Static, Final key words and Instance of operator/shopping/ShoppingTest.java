public class ShoppingTest {
    public static void main(String[] args) {
        Product p1 = new Product(1, "Laptop", 50000, 2);
        Product p2 = new Product(2, "Phone", 20000, 5);
        p1.displayDetails();
        p2.displayDetails();
        Product.updateDiscount(10.0);
        p1.displayDetails();
    }
}