
// LibraryBook.java
public class LibraryBook {
    private String title;
    private String author;
    private double price;
    private boolean available;

    public LibraryBook(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.available = true;
    }

    public boolean borrowBook() {
        if (available) {
            available = false;
            return true;
        }
        return false;
    }

    public void displayDetails() {
        System.out.println("Title: " + title + ", Author: " + author + ", Price: " + price + ", Available: " + available);
    }
}
