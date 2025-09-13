class Vehicle {
    static double registrationFee = 500.0;

    final int registrationNumber;
    String ownerName;
    String vehicleType;

    Vehicle(String ownerName, int registrationNumber, String vehicleType) {
        this.ownerName = ownerName;
        this.registrationNumber = registrationNumber;
        this.vehicleType = vehicleType;
    }

    static void updateRegistrationFee(double newFee) {
        registrationFee = newFee;
    }

    void displayDetails() {
        if (this instanceof Vehicle) {
            System.out.println("Owner: " + ownerName + ", Reg#: " + registrationNumber + 
                               ", Type: " + vehicleType + ", Fee: " + registrationFee);
        }
    }
}