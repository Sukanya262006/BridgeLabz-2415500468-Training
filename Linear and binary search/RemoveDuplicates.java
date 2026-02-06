
import java.util.HashSet;

public class RemoveDuplicates {
    public static void main(String[] args) {
        String input = "programming";
        StringBuilder sb = new StringBuilder();
        HashSet<Character> set = new HashSet<>();

        for (char ch : input.toCharArray()) {
            if (!set.contains(ch)) {
                set.add(ch);
                sb.append(ch);
            }
        }
        System.out.println(sb.toString());
    }
}
