
import java.util.*;

public class Assignment14_EmployeeSalary {
    public static void main(String[] args) {
        Map<String,Double> sal = new HashMap<>();

        sal.put("A",50000.0);
        sal.put("B",70000.0);
        sal.put("C",60000.0);

        sal.put("A", sal.get("A") * 1.10); // raise

        double avg = sal.values().stream().mapToDouble(i->i).average().orElse(0);
        System.out.println("Average: "+avg);
    }
}
