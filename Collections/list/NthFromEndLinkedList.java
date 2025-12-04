import java.util.*;

public class NthFromEndLinkedList {

    public static <T> T nthFromEnd(LinkedList<T> list, int n) {
        if (n <= 0) throw new IllegalArgumentException("n must be positive");
        Iterator<T> fast = list.iterator();
        Iterator<T> slow = list.iterator();

        int steps = 0;
        while (steps < n && fast.hasNext()) {
            fast.next();
            steps++;
        }
        if (steps < n) {
            throw new IllegalArgumentException("List shorter than n");
        }

        while (fast.hasNext()) {
            fast.next();
            slow.next();
        }
        return slow.next();
    }

    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>(Arrays.asList("A", "B", "C", "D", "E"));
        int n = 2;
        System.out.println("List: " + list);
        System.out.println(n + "th element from end: " + nthFromEnd(list, n));
    }
}
