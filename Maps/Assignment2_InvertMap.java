
import java.util.*;

public class Assignment2_InvertMap {
    public static void main(String[] args) {
        Map<String, Integer> map = Map.of("A",1,"B",2,"C",1);
        Map<Integer, List<String>> inverted = new HashMap<>();

        for (var e : map.entrySet()) {
            inverted.computeIfAbsent(e.getValue(), k -> new ArrayList<>()).add(e.getKey());
        }

        System.out.println(inverted);
    }
}
