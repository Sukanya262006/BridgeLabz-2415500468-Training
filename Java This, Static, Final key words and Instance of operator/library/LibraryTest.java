public class LibraryTest {
    public static void main(String[] args) {
        Book.displayLibraryName();
        Book b1 = new Book("Java Basics", "John Doe", "12345");
        Book b2 = new Book("OOP in Depth", "Jane Smith", "67890");
        b1.displayDetails();
        b2.displayDetails();
    }
}