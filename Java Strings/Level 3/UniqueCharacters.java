import java.util.Scanner;

public class UniqueCharacters {
    public static int findLength(String s) {
        int count = 0;
        try {
            while (true) { s.charAt(count); count++; }
        } catch (Exception e) {}
        return count;
    }

    public static char[] uniqueChars(String s) {
        int n = findLength(s);
        char[] temp = new char[n]; // store unique candidates
        int uniqCount = 0;
        for (int i = 0; i < n; i++) {
            char c = s.charAt(i);
            boolean found = false;
            for (int j = 0; j < uniqCount; j++) {
                if (temp[j] == c) { found = true; break; }
            }
            if (!found) {
                temp[uniqCount++] = c;
            }
        }
        // copy to exact size array
        char[] res = new char[uniqCount];
        for (int i = 0; i < uniqCount; i++) res[i] = temp[i];
        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String text = sc.nextLine();
        char[] uniques = uniqueChars(text);
        System.out.println("Unique characters (in order encountered):");
        for (char c : uniques) System.out.print(c + " ");
        System.out.println();
        sc.close();
    }
}
