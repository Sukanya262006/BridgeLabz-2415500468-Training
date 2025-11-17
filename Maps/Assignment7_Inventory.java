
import java.util.*;

public class Assignment7_Inventory {
    public static void main(String[] args) {
        Map<String,Integer> store = new HashMap<>();

        store.put("Rice", 10);
        store.put("Sugar", 5);
        store.put("Oil", 0);

        // customer buys
        store.put("Rice", store.get("Rice") - 3);

        // shipment
        store.put("Sugar", store.get("Sugar") + 10);

        // out of stock list
        System.out.println("Out of stock:");
        for (var e : store.entrySet()) {
            if (e.getValue() <= 0)
                System.out.println(e.getKey());
        }
    }
}
