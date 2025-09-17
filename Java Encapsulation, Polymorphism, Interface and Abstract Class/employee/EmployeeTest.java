import java.util.*;

public class EmployeeTest {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        employees.add(new FullTimeEmployee(1, "Alice", 50000));
        employees.add(new PartTimeEmployee(2, "Bob", 0, 40, 200));

        for (Employee e : employees) {
            e.displayDetails();
        }
    }
}