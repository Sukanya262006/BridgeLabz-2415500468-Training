import java.util.*;

class StudentAdmission implements Comparable<StudentAdmission> {
    String name;
    double marks;

    StudentAdmission(String name, double marks) {
        this.name = name;
        this.marks = marks;
    }

    @Override
    public int compareTo(StudentAdmission o) {
        int cmp = Double.compare(o.marks, this.marks); // descending
        if (cmp != 0) return cmp;
        return this.name.compareTo(o.name);
    }

    @Override
    public String toString() {
        return "Student{" + name + ", marks=" + marks + "}";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof StudentAdmission)) return false;
        StudentAdmission s = (StudentAdmission) o;
        return Objects.equals(name, s.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}

public class CollegeAdmissionSystem {

    public static void main(String[] args) {
        List<StudentAdmission> applicants = new ArrayList<>();
        applicants.add(new StudentAdmission("Alice", 90));
        applicants.add(new StudentAdmission("Bob", 85));
        applicants.add(new StudentAdmission("Charlie", 92));

        Set<StudentAdmission> shortlisted = new HashSet<>();
        for (StudentAdmission s : applicants) {
            if (s.marks >= 85) shortlisted.add(s);
        }

        Queue<StudentAdmission> interviewQueue = new LinkedList<>(shortlisted);

        TreeSet<StudentAdmission> meritList = new TreeSet<>();
        while (!interviewQueue.isEmpty()) {
            StudentAdmission s = interviewQueue.remove();
            // assume all interviewed and selected
            meritList.add(s);
        }

        System.out.println("Final Merit List:");
        for (StudentAdmission s : meritList) System.out.println(s);
    }
}
