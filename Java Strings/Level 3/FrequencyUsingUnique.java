import java.util.Scanner;

public class FrequencyUsingUnique {
    public static char[] uniqueChars(String s) {
        int n = s.length();
        char[] temp = new char[n];
        int uniq = 0;
        for (int i = 0; i < n; i++) {
            char c = s.charAt(i);
            boolean found = false;
            for (int j = 0; j < uniq; j++) if (temp[j] == c) { found = true; break; }
            if (!found) temp[uniq++] = c;
        }
        char[] res = new char[uniq];
        for (int i = 0; i < uniq; i++) res[i] = temp[i];
        return res;
    }

    public static String[][] freqUsingUnique(String s) {
        char[] uniques = uniqueChars(s);
        String[][] out = new String[uniques.length][2];
        for (int i = 0; i < uniques.length; i++) {
            char c = uniques[i];
            int count = 0;
            for (int j = 0; j < s.length(); j++) if (s.charAt(j) == c) count++;
            out[i][0] = String.valueOf(c);
            out[i][1] = String.valueOf(count);
        }
        return out;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String t = sc.nextLine();
        String[][] res = freqUsingUnique(t);
        System.out.println("Char\tFreq");
        for (String[] r : res) System.out.println(r[0] + "\t" + r[1]);
        sc.close();
    }
}
