
import java.util.*;

public class Assignment6_StudentGradeTracker {
    public static void main(String[] args) {
        TreeMap<String,Double> grades = new TreeMap<>();

        grades.put("Ravi", 85.0);
        grades.put("Sita", 92.0);
        grades.put("Karan", 78.0);

        grades.put("Ravi", 90.0); // update

        grades.remove("Karan"); // remove

        for (var e : grades.entrySet()) {
            System.out.println(e.getKey() + " -> " + e.getValue());
        }
    }
}
