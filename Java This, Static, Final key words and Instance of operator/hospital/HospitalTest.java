public class HospitalTest {
    public static void main(String[] args) {
        Patient p1 = new Patient(1, "Alice", 30, "Flu");
        Patient p2 = new Patient(2, "Bob", 45, "Fever");
        p1.displayDetails();
        p2.displayDetails();
        Patient.getTotalPatients();
    }
}