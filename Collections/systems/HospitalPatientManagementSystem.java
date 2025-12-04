import java.util.*;

class Patient {
    String name;

    Patient(String name) { this.name = name; }

    @Override
    public String toString() {
        return "Patient{" + name + "}";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Patient)) return false;
        Patient p = (Patient) o;
        return Objects.equals(name, p.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}

public class HospitalPatientManagementSystem {

    public static void main(String[] args) {
        Set<Patient> admitted = new HashSet<>();
        Queue<Patient> waiting = new LinkedList<>();
        Stack<Patient> discharged = new Stack<>();
        List<Patient> history = new ArrayList<>();

        admitPatient(new Patient("Alice"), admitted, waiting, history);
        admitPatient(new Patient("Bob"), admitted, waiting, history);
        admitPatient(new Patient("Alice"), admitted, waiting, history); // duplicate

        while (!waiting.isEmpty()) {
            Patient p = waiting.remove();
            System.out.println("Treating: " + p);
            // after treatment, discharge
            discharged.push(p);
            admitted.remove(p);
            System.out.println("Discharged: " + p);
        }

        System.out.println("\nRecently discharged (top of stack): " +
                (discharged.isEmpty() ? "none" : discharged.peek()));

        System.out.println("\nRe-admitting last discharged:");
        if (!discharged.isEmpty()) {
            Patient p = discharged.pop();
            admitPatient(p, admitted, waiting, history);
        }
    }

    private static void admitPatient(Patient p, Set<Patient> admitted,
                                     Queue<Patient> waiting, List<Patient> history) {
        if (admitted.add(p)) {
            waiting.add(p);
            history.add(p);
            System.out.println("Admitted: " + p);
        } else {
            System.out.println("Patient already admitted: " + p);
        }
    }
}
