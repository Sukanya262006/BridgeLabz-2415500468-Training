import java.util.*;
public class Q9_PrimitiveInGenerics {
    public static void main(String[] args) {
        // ArrayList<int> list = new ArrayList<int>(); // not allowed
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        System.out.println(list);
    }
}
