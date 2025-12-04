import java.util.*;

public class FrequencyOfElements {

    public static Map<String, Integer> countFrequency(List<String> items) {
        Map<String, Integer> freq = new HashMap<>();
        for (String s : items) {
            freq.put(s, freq.getOrDefault(s, 0) + 1);
        }
        return freq;
    }

    public static void main(String[] args) {
        List<String> items = Arrays.asList("apple", "banana", "apple", "orange");
        Map<String, Integer> result = countFrequency(items);
        System.out.println(result);
    }
}
