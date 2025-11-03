import java.util.*;
public class Q8_ArrayListCharacterCheck {
    public static void main(String[] args) {
        ArrayList<Character> chars = new ArrayList<>();
        chars.add('A');
        chars.add('5');
        chars.add('b');
        for (char c : chars) {
            if (Character.isDigit(c))
                System.out.println(c + " is a digit");
            else if (Character.isAlphabetic(c))
                System.out.println(c + " is an alphabet");
            else
                System.out.println(c + " is neither");
        }
    }
}
