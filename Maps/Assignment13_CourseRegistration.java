
import java.util.*;

public class Assignment13_CourseRegistration {
    public static void main(String[] args) {
        Map<String,Integer> reg = new HashMap<>();

        reg.put("CS101", 45);
        reg.put("CS102", 10);
        reg.put("CS103", 3);
        reg.put("CS104", 52);

        for (var e : reg.entrySet())
            if (e.getValue() >= 50)
                System.out.println("Near full: "+e.getKey());
    }
}
