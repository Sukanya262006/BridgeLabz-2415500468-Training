public class NumberChecker3 {
    public static int countDigits(int n) {
        n = Math.abs(n); if (n==0) return 1;
        int c=0; while(n>0){c++; n/=10;} return c;
    }
    public static int[] digitsArray(int n) {
        n = Math.abs(n);
        int l = countDigits(n);
        int[] d = new int[l];
        for (int i = l-1; i>=0; i--) { d[i] = n%10; n/=10; }
        return d;
    }
    public static int[] reverseDigits(int n) {
        int[] d = digitsArray(n);
        int l = d.length;
        int[] r = new int[l];
        for (int i = 0; i < l; i++) r[i] = d[l-1-i];
        return r;
    }
    public static boolean arraysEqual(int[] a, int[] b) {
        if (a.length != b.length) return false;
        for (int i=0;i<a.length;i++) if (a[i]!=b[i]) return false;
        return true;
    }
    public static boolean isPalindrome(int n) {
        return arraysEqual(digitsArray(n), reverseDigits(n));
    }
    // duck: per hint (non-zero digit present)
    public static boolean isDuck(int n) {
        int[] d = digitsArray(n);
        for (int x : d) if (x != 0) return true;
        return false;
    }
    public static void main(String[] args) {
        int n = 1221;
        System.out.println("Number: " + n);
        System.out.println("Digits: " + java.util.Arrays.toString(digitsArray(n)));
        System.out.println("Reversed digits: " + java.util.Arrays.toString(reverseDigits(n)));
        System.out.println("Arrays equal? " + arraysEqual(digitsArray(n), reverseDigits(n)));
        System.out.println("Is Palindrome? " + isPalindrome(n));
        System.out.println("Is Duck? " + isDuck(n));
    }
}
