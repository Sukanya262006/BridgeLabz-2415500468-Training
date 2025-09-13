class Product {
    static double discount = 5.0; // percent

    final int productID;
    String productName;
    double price;
    int quantity;

    Product(int productID, String productName, double price, int quantity) {
        this.productID = productID;
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
    }

    static void updateDiscount(double newDiscount) {
        discount = newDiscount;
    }

    void displayDetails() {
        if (this instanceof Product) {
            System.out.println("ProductID: " + productID + ", Name: " + productName + 
                               ", Price: " + price + ", Qty: " + quantity + 
                               ", Discount: " + discount + "%");
        }
    }
}