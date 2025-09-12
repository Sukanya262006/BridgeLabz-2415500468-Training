
// CarRental.java
public class CarRental {
    private String customerName;
    private String carModel;
    private int rentalDays;
    private double dailyRate = 50.0;

    public CarRental(String customerName, String carModel, int rentalDays) {
        this.customerName = customerName;
        this.carModel = carModel;
        this.rentalDays = rentalDays;
    }

    private double calculateCost() {
        return rentalDays * dailyRate;
    }

    public void displayDetails() {
        System.out.println("Customer: " + customerName + ", Car: " + carModel +
                ", Days: " + rentalDays + ", Total Cost: " + calculateCost());
    }
}
