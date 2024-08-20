package august_20.task_6;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Collection;

public class Main {
    public static void main(String[] args) {
        HashMap<String, Book> bookMap = new HashMap<>();

        bookMap.put("Harry Potter", new Book("Harry Potter", 39.99, "J.K. Rowling"));
        bookMap.put("Lord of the Rings", new Book("Lord of the Rings", 49.99, "J.R.R. Tolkien"));
        bookMap.put("The Hobbit", new Book("The Hobbit", 29.99, "J.R.R. Tolkien"));

        printEntrySet(bookMap);

        printKeySet(bookMap);

        printValues(bookMap);
    }

    public static void printEntrySet(HashMap<String, Book> bookMap) {
        Set<Map.Entry<String, Book>> entrySet = bookMap.entrySet();
        for (Map.Entry<String, Book> entry : entrySet) {
            System.out.println(entry.getKey() + "  " + entry.getValue());
        }
    }

    public static void printKeySet(HashMap<String, Book> bookMap) {
        Set<String> keySet = bookMap.keySet();
        for (String key : keySet) {
            System.out.println(key);
        }
    }

    public static void printValues(HashMap<String, Book> bookMap) {
        Collection<Book> values = bookMap.values();
        for (Book book : values) {
            System.out.println(book);
        }
    }
}
