
import java.util.*;

public class Assignment9_LibraryCatalog {
    public static void main(String[] args) {
        TreeMap<String,String> books = new TreeMap<>();

        books.put("978-1","Java Book");
        books.put("978-2","Python Book");

        String isbn="978-1";
        System.out.println(books.getOrDefault(isbn,"Not found"));

        books.remove("978-2");

        for (var e : books.entrySet())
            System.out.println(e.getKey()+" -> "+e.getValue());
    }
}
