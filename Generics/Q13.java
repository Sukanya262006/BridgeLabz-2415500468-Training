package generics;
class Product<T> {
    String name;
    double price;
    T category;

    Product(String name, double price, T category) {
        this.name = name; this.price = price; this.category = category;
    }

    double getPrice(){ return price; }
}

class BookCategory {}
class ClothingCategory {}

class DiscountUtil {
    public static <T extends Product<?>> void applyDiscount(T product, double percent) {
        double discounted = product.getPrice() - (product.getPrice() * percent / 100);
        System.out.println(product.name + " discounted price: " + discounted);
    }
}

public class Q13 {
    public static void main(String[] args) {
        Product<BookCategory> book = new Product<>("Java Book", 500, new BookCategory());
        DiscountUtil.applyDiscount(book, 10);
    }
}
