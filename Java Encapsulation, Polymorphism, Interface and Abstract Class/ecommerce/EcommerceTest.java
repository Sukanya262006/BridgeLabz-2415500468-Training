public class EcommerceTest {
    public static void main(String[] args) {
        Product p1 = new Electronics(1, "Laptop", 50000);
        Product p2 = new Clothing(2, "Shirt", 2000);
        Product p3 = new Groceries(3, "Apple", 200);

        Product[] products = {p1, p2, p3};
        for (Product p : products) {
            double discount = p.calculateDiscount();
            double finalPrice = p.getPrice() - discount;
            System.out.println("Final Price: " + finalPrice);
        }
    }
}