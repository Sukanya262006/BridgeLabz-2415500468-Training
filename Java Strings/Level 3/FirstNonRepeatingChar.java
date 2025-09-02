import java.util.Scanner;

public class FirstNonRepeatingChar {
    public static char firstNonRepeating(String s) {
        int[] freq = new int[256];
        int n = s.length();
        for (int i = 0; i < n; i++) {
            freq[(int)s.charAt(i)]++;
        }
        for (int i = 0; i < n; i++) {
            if (freq[(int)s.charAt(i)] == 1) return s.charAt(i);
        }
        return (char)0; // indicate none
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String t = sc.nextLine();
        char res = firstNonRepeating(t);
        if (res == 0) System.out.println("No non-repeating character found.");
        else System.out.println("First non-repeating character: " + res);
        sc.close();
    }
}
