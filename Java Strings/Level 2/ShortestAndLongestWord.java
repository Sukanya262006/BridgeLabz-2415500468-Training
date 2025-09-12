import java.util.Scanner;

public class ShortestAndLongestWord {
    public static int getLength(String str) {
        int c = 0;
        try { while (true) { str.charAt(c); c++; } }
        catch (StringIndexOutOfBoundsException e) { return c; }
    }

    public static String[] customSplit(String str) {
        int len = getLength(str);
        if (len == 0) return new String[0];
        int spaces = 0;
        for (int i = 0; i < len; i++) if (str.charAt(i) == ' ') spaces++;
        String[] words = new String[spaces + 1];
        int start = 0, idx = 0;
        for (int i = 0; i < len; i++) {
            if (str.charAt(i) == ' ') {
                words[idx++] = str.substring(start, i);
                start = i + 1;
            }
        }
        words[idx] = str.substring(start, len);
        return words;
    }

    public static String[][] wordsWithLengths(String[] words) {
        String[][] table = new String[words.length][2];
        for (int i = 0; i < words.length; i++) {
            table[i][0] = words[i];
            table[i][1] = String.valueOf(getLength(words[i]));
        }
        return table;
    }

    public static int[] shortestAndLongest(String[][] table) {
        if (table.length == 0) return new int[]{-1, -1};
        int minIdx = 0, maxIdx = 0;
        int minLen = Integer.parseInt(table[0][1]);
        int maxLen = minLen;
        for (int i = 1; i < table.length; i++) {
            int l = Integer.parseInt(table[i][1]);
            if (l < minLen) { minLen = l; minIdx = i; }
            if (l > maxLen) { maxLen = l; maxIdx = i; }
        }
        return new int[]{minIdx, maxIdx};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String text = sc.nextLine();
        String[] words = customSplit(text);
        String[][] table = wordsWithLengths(words);
        int[] res = shortestAndLongest(table);
        if (res[0] == -1) {
            System.out.println("No words.");
        } else {
            System.out.println("Shortest: " + table[res[0]][0] + " (" + table[res[0]][1] + ")");
            System.out.println("Longest : " + table[res[1]][0] + " (" + table[res[1]][1] + ")");
        }
        sc.close();
    }
}
