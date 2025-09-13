public class BankTest {
    public static void main(String[] args) {
        BankAccount acc1 = new BankAccount("Alice", 101, 5000);
        BankAccount acc2 = new BankAccount("Bob", 102, 7000);
        acc1.displayDetails();
        acc2.displayDetails();
        BankAccount.getTotalAccounts();
    }
}