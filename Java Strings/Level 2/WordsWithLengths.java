import java.util.Scanner;

public class WordsWithLengths {
    public static int getLength(String str) {
        int count = 0;
        try {
            while (true) { str.charAt(count); count++; }
        } catch (StringIndexOutOfBoundsException e) { return count; }
    }

    public static String[] customSplit(String str) {
        int len = getLength(str);
        if (len == 0) return new String[0];
        int spaces = 0;
        for (int i = 0; i < len; i++) if (str.charAt(i) == ' ') spaces++;
        String[] out = new String[spaces + 1];
        int start = 0, idx = 0;
        for (int i = 0; i < len; i++) {
            if (str.charAt(i) == ' ') {
                out[idx++] = str.substring(start, i);
                start = i + 1;
            }
        }
        out[idx] = str.substring(start, len);
        return out;
    }

    public static String[][] wordsWithLengths(String[] words) {
        String[][] table = new String[words.length][2];
        for (int i = 0; i < words.length; i++) {
            table[i][0] = words[i];
            table[i][1] = String.valueOf(getLength(words[i]));
        }
        return table;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String text = sc.nextLine();
        String[] words = customSplit(text);
        String[][] table = wordsWithLengths(words);
        System.out.println("Word\tLength");
        for (String[] row : table) {
            System.out.println(row[0] + "\t" + Integer.parseInt(row[1]));
        }
        sc.close();
    }
}
