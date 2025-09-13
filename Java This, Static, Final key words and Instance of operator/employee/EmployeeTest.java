public class EmployeeTest {
    public static void main(String[] args) {
        Employee e1 = new Employee("Alice", 1, "Manager");
        Employee e2 = new Employee("Bob", 2, "Developer");
        e1.displayDetails();
        e2.displayDetails();
        Employee.displayTotalEmployees();
    }
}