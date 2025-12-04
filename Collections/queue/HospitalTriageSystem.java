import java.util.*;

class PatientSeverity implements Comparable<PatientSeverity> {
    String name;
    int severity; // higher = more severe

    PatientSeverity(String name, int severity) {
        this.name = name;
        this.severity = severity;
    }

    @Override
    public int compareTo(PatientSeverity o) {
        // Descending by severity
        return Integer.compare(o.severity, this.severity);
    }

    @Override
    public String toString() {
        return name + "(severity=" + severity + ")";
    }
}

public class HospitalTriageSystem {

    public static void main(String[] args) {
        PriorityQueue<PatientSeverity> pq = new PriorityQueue<>();

        pq.add(new PatientSeverity("John", 3));
        pq.add(new PatientSeverity("Alice", 5));
        pq.add(new PatientSeverity("Bob", 2));

        System.out.println("Treatment order:");
        while (!pq.isEmpty()) {
            System.out.println(pq.remove());
        }
    }
}
