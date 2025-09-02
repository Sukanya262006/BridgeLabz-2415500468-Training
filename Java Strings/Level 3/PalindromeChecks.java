import java.util.Scanner;

public class PalindromeChecks {
    // Logic 1: iterative compare
    public static boolean isPalindromeIterative(String s) {
        int i = 0, j = s.length() - 1;
        while (i < j) {
            if (s.charAt(i) != s.charAt(j)) return false;
            i++; j--;
        }
        return true;
    }

    // Logic 2: recursive
    public static boolean isPalindromeRecursive(String s, int i, int j) {
        if (i >= j) return true;
        if (s.charAt(i) != s.charAt(j)) return false;
        return isPalindromeRecursive(s, i+1, j-1);
    }

    // Logic 3: using reverse array
    public static boolean isPalindromeReverse(String s) {
        char[] arr = s.toCharArray();
        int n = arr.length;
        char[] rev = new char[n];
        for (int i = 0; i < n; i++) rev[i] = arr[n-1-i];
        for (int i = 0; i < n; i++) if (arr[i] != rev[i]) return false;
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String t = sc.nextLine();
        System.out.println("Iterative: " + isPalindromeIterative(t));
        System.out.println("Recursive: " + isPalindromeRecursive(t, 0, t.length()-1));
        System.out.println("Reverse-array: " + isPalindromeReverse(t));
        sc.close();
    }
}
