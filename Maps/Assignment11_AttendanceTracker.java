
import java.util.*;

public class Assignment11_AttendanceTracker {
    public static void main(String[] args) {
        Map<String,Integer> att = new HashMap<>();
        String[] students={"A","B","C","D","E"};

        for (String s : students) att.put(s,0);

        List<String> day1=List.of("A","C","D");
        for (String s : day1) att.put(s, att.get(s)+1);

        System.out.println(att);
    }
}
