
import java.util.*;

public class Assignment3_MaxKey {
    public static void main(String[] args) {
        Map<String,Integer> map = Map.of("A",10,"B",20,"C",15);
        String maxKey = null;
        int maxValue = Integer.MIN_VALUE;

        for (var e : map.entrySet()) {
            if (e.getValue() > maxValue) {
                maxValue = e.getValue();
                maxKey = e.getKey();
            }
        }

        System.out.println("Max: " + maxKey);
    }
}
