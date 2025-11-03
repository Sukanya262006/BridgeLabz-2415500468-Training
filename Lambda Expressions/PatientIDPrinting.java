/**
 * PatientIDPrinting.java
 * Scenario: Print all patient IDs for admin verification.
 * Task: Use method references instead of lambdas.
 *
 * Sample Output:
 * 2001
 * 2002
 * 2003
 * 2004
 */
import java.util.*;
public class PatientIDPrinting {
    public static void main(String[] args) {
        List<Integer> patientIds = Arrays.asList(2001, 2002, 2003, 2004);
        // Method reference to println instead of a lambda like (id) -> System.out.println(id)
        patientIds.forEach(System.out::println);
    }
}
