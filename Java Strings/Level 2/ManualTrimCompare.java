import java.util.Scanner;

public class ManualTrimCompare {
    public static int[] trimBounds(String s) {
        int start = 0, end;
        // find length without length()
        int len = 0; try { while (true) { s.charAt(len); len++; } } catch (Exception e) {}
        end = len - 1;
        while (start < len) {
            if (s.charAt(start) == ' ') start++;
            else break;
        }
        while (end >= 0) {
            if (s.charAt(end) == ' ') end--;
            else break;
        }
        // If all spaces, set start=0,end=-1 to represent empty
        if (start > end) return new int[]{0, -1};
        // Return inclusive start and end
        return new int[]{start, end};
    }

    public static String customSubstring(String s, int start, int endInclusive) {
        // Build using charAt()
        if (endInclusive < start) return "";
        StringBuilder sb = new StringBuilder();
        for (int i = start; i <= endInclusive; i++) {
            sb.append(s.charAt(i));
        }
        return sb.toString();
    }

    public static boolean compareStrings(String a, String b) {
        // Compare via charAt()
        int i = 0;
        while (true) {
            char ca, cb;
            try { ca = a.charAt(i); } catch (Exception e) { ca = 0; }
            try { cb = b.charAt(i); } catch (Exception e) { cb = 0; }
            if (ca == 0 && cb == 0) return true;
            if (ca == 0 || cb == 0) return false;
            if (ca != cb) return false;
            i++;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text with leading/trailing spaces: ");
        String text = sc.nextLine();
        int[] bounds = trimBounds(text);
        String trimmedByCustom = customSubstring(text, bounds[0], bounds[1]);
        String builtIn = text.trim();
        System.out.println("Custom Trim: '" + trimmedByCustom + "'");
        System.out.println("Built-in Trim: '" + builtIn + "'");
        System.out.println("Equal? " + compareStrings(trimmedByCustom, builtIn));
        sc.close();
    }
}
