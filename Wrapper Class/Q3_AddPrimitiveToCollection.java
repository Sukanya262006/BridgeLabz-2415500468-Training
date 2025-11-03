import java.util.*;
public class Q3_AddPrimitiveToCollection {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        // list.add(10); // works with autoboxing
        // Without autoboxing, we must use:
        list.add(Integer.valueOf(10));
        System.out.println(list);
    }
}
