import java.util.Scanner;

public class StringSplitWithoutMethod {
    public static int getLength(String str) {
        int count = 0;
        try {
            while (true) {
                str.charAt(count);
                count++;
            }
        } catch (StringIndexOutOfBoundsException e) {
            return count;
        }
    }

    public static String[] customSplit(String str) {
        int len = getLength(str);
        if (len == 0) return new String[0];
        int spaceCount = 0;
        for (int i = 0; i < len; i++) if (str.charAt(i) == ' ') spaceCount++;
        String[] words = new String[spaceCount + 1];
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

    public static boolean compareArrays(String[] a, String[] b) {
        if (a.length != b.length) return false;
        for (int i = 0; i < a.length; i++) {
            if (!a[i].equals(b[i])) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a text line: ");
        String text = sc.nextLine();
        String[] custom = customSplit(text);
        String[] builtin = text.split(" ");
        System.out.println("-- Custom Split --");
        for (String w : custom) System.out.print("[" + w + "] ");
        System.out.println();
        System.out.println("-- Built-in Split --");
        for (String w : builtin) System.out.print("[" + w + "] ");
        System.out.println();
        System.out.println("Arrays equal? " + compareArrays(custom, builtin));
        sc.close();
    }
}
