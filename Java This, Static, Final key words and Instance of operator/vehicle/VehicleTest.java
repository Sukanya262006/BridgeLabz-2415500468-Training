public class VehicleTest {
    public static void main(String[] args) {
        Vehicle v1 = new Vehicle("Alice", 1001, "Car");
        Vehicle v2 = new Vehicle("Bob", 1002, "Bike");
        v1.displayDetails();
        v2.displayDetails();
        Vehicle.updateRegistrationFee(750.0);
        v1.displayDetails();
    }
}