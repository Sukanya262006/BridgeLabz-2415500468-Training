import java.util.*;
public class Q1_ArrayListExample {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        // list.add(10); // allowed (autoboxed to Integer)
        // list.add(int); // not allowed
        list.add(10);
        System.out.println(list);
    }
}
