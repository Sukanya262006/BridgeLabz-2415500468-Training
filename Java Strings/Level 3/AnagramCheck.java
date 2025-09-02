import java.util.Scanner;
import java.util.Arrays;

public class AnagramCheck {
    public static boolean areAnagrams(String a, String b) {
        // remove spaces and make simple (case-sensitive as per char frequencies)
        String s1 = a.replaceAll("\s+", "");
        String s2 = b.replaceAll("\s+", "");
        if (s1.length() != s2.length()) return false;
        int[] freq = new int[256];
        for (int i = 0; i < s1.length(); i++) freq[(int)s1.charAt(i)]++;
        for (int i = 0; i < s2.length(); i++) freq[(int)s2.charAt(i)]--;
        for (int i = 0; i < 256; i++) if (freq[i] != 0) return false;
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first text: ");
        String t1 = sc.nextLine();
        System.out.print("Enter second text: ");
        String t2 = sc.nextLine();
        System.out.println("Are anagrams? " + areAnagrams(t1, t2));
        sc.close();
    }
}
