
import java.util.*;

public class Assignment12_CountryCapital {
    public static void main(String[] args) {
        TreeMap<String,String> cc = new TreeMap<>();

        cc.put("India","New Delhi");
        cc.put("USA","Washington");
        cc.put("Japan","Tokyo");
        cc.put("UK","London");

        for (var e : cc.entrySet())
            System.out.println(e.getKey()+" -> "+e.getValue());
    }
}
