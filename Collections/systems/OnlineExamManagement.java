import java.util.*;

class Question {
    String text;

    Question(String text) {
        this.text = text;
    }

    @Override
    public String toString() {
        return text;
    }
}

class Student {
    String id;

    Student(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Student{" + id + "}";
    }
}

public class OnlineExamManagement {

    public static void main(String[] args) {
        List<Question> questions = new ArrayList<>();
        questions.add(new Question("Q1: 2+2?"));
        questions.add(new Question("Q2: Capital of India?"));
        Collections.shuffle(questions);

        Set<String> studentIds = new HashSet<>();
        Queue<Student> waitingQueue = new LinkedList<>();
        Stack<Question> navStack = new Stack<>();

        // enroll students
        String[] ids = {"S1", "S2", "S1"}; // S1 duplicate
        for (String id : ids) {
            if (studentIds.add(id)) {
                waitingQueue.add(new Student(id));
            } else {
                System.out.println("Duplicate ID ignored: " + id);
            }
        }

        System.out.println("Students in queue: " + waitingQueue);

        // simulate a single student navigating questions
        if (!waitingQueue.isEmpty()) {
            Student current = waitingQueue.remove();
            System.out.println("\nServing " + current);
            for (Question q : questions) {
                navStack.push(q);
                System.out.println("Showing: " + q);
            }

            System.out.println("\nStudent presses back:");
            while (!navStack.isEmpty()) {
                System.out.println("Back to: " + navStack.pop());
            }
        }
    }
}
