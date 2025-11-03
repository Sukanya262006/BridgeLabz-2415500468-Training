/**
 * NotificationFiltering.java
 * Scenario: Hospital app filters patient alerts based on user preference.
 * Task: Use lambdas with Predicate to filter alerts.
 *
 * Sample Output (example: want only CRITICAL lab or emergency alerts):
 * [ALERT] CRITICAL | EMERGENCY | "ER bed needed"
 * [ALERT] CRITICAL | LAB       | "High potassium"
 */
import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class NotificationFiltering {
    enum Severity { INFO, WARNING, CRITICAL }
    enum Type { LAB, MEDICATION, APPOINTMENT, EMERGENCY }

    static class Alert {
        Severity severity;
        Type type;
        String message;
        Alert(Severity severity, Type type, String message) {
            this.severity = severity; this.type = type; this.message = message;
        }
        @Override public String toString() {
            return String.format("[ALERT] %s | %s | \"%s\"", severity, type, message);
        }
    }

    public static void main(String[] args) {
        List<Alert> feed = List.of(
            new Alert(Severity.CRITICAL, Type.EMERGENCY,  "ER bed needed"),
            new Alert(Severity.INFO,     Type.APPOINTMENT, "Reminder: Dr. Rao at 4pm"),
            new Alert(Severity.CRITICAL, Type.LAB,        "High potassium"),
            new Alert(Severity.WARNING,  Type.MEDICATION, "Dose skipped"),
            new Alert(Severity.INFO,     Type.LAB,        "HbA1c updated")
        );

        // User preference: Only CRITICAL alerts, and among those only EMERGENCY or LAB.
        Predicate<Alert> isCritical = a -> a.severity == Severity.CRITICAL;
        Predicate<Alert> typeAllowed = a -> a.type == Type.EMERGENCY || a.type == Type.LAB;

        List<Alert> filtered = feed.stream()
                                   .filter(isCritical.and(typeAllowed))
                                   .collect(Collectors.toList());

        filtered.forEach(System.out::println);
    }
}
