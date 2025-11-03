/**
 * NameUppercasing.java
 * Scenario: Convert all employee names to uppercase.
 * Task: Use String::toUpperCase in a stream.
 *
 * Sample Output:
 * RAVI
 * SUMA
 * AISHA
 * ARUN
 */
import java.util.*;
public class NameUppercasing {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Ravi", "Suma", "Aisha", "Arun");
        names.stream()
             .map(String::toUpperCase)  // method reference
             .forEach(System.out::println); // method reference
    }
}
