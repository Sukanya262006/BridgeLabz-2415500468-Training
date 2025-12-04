import java.util.*;

class Book {
    String title;

    Book(String title) { this.title = title; }

    @Override
    public String toString() {
        return "Book{" + title + "}";
    }
}

public class LibraryManagementSystem {

    public static void main(String[] args) {
        List<Book> allBooks = new ArrayList<>();
        Set<String> memberIds = new HashSet<>();
        Queue<Book> issueQueue = new LinkedList<>();
        Stack<Book> returnedStack = new Stack<>();

        allBooks.add(new Book("Java Basics"));
        allBooks.add(new Book("Data Structures"));

        registerMember("M1", memberIds);
        registerMember("M2", memberIds);
        registerMember("M1", memberIds); // duplicate

        issueQueue.add(allBooks.get(0));
        issueQueue.add(allBooks.get(1));

        while (!issueQueue.isEmpty()) {
            Book b = issueQueue.remove();
            System.out.println("Issuing book: " + b);
        }

        // some returns
        returnedStack.push(allBooks.get(0));
        returnedStack.push(allBooks.get(1));
        System.out.println("\nRecently returned stack: " + returnedStack);

        if (!returnedStack.isEmpty()) {
            Book b = returnedStack.pop();
            System.out.println("Re-issuing most recently returned: " + b);
        }
    }

    private static void registerMember(String id, Set<String> memberIds) {
        if (memberIds.add(id)) {
            System.out.println("Member registered: " + id);
        } else {
            System.out.println("Duplicate member ignored: " + id);
        }
    }
}
