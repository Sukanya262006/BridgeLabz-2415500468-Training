public class StudentTest {
    public static void main(String[] args) {
        Student s1 = new Student("Alice", 101, "A");
        Student s2 = new Student("Bob", 102, "B");
        s1.displayDetails();
        s2.displayDetails();
        Student.displayTotalStudents();
    }
}