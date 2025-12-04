import java.util.*;

public class ReverseQueue {

    public static <T> void reverse(Queue<T> queue) {
        if (queue.isEmpty()) return;
        T front = queue.remove();
        reverse(queue);
        queue.add(front);
    }

    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.add(10);
        q.add(20);
        q.add(30);
        System.out.println("Original: " + q);
        reverse(q);
        System.out.println("Reversed: " + q);
    }
}
