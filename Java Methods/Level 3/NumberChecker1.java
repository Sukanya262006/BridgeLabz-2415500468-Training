import java.util.ArrayList;
import java.util.List;

public class NumberChecker1 {
    // count digits
    public static int countDigits(int n) {
        n = Math.abs(n);
        if (n == 0) return 1;
        int cnt = 0;
        while (n > 0) { cnt++; n /= 10; }
        return cnt;
    }

    // store digits in array (most-significant first)
    public static int[] digitsArray(int n) {
        n = Math.abs(n);
        int len = countDigits(n);
        int[] d = new int[len];
        for (int i = len - 1; i >= 0; i--) {
            d[i] = n % 10;
            n /= 10;
        }
        return d;
    }

    // duck number per hint: has a non-zero digit present in it
    public static boolean isDuck(int n) {
        int[] d = digitsArray(n);
        for (int x : d) if (x != 0) return true;
        return false;
    }

    // Armstrong check
    public static boolean isArmstrong(int n) {
        int[] d = digitsArray(n);
        int p = d.length;
        int sum = 0;
        for (int x : d) sum += Math.pow(x, p);
        return sum == Math.abs(n);
    }

    // largest and second largest in digits array
    public static int[] largestTwo(int[] d) {
        int largest = Integer.MIN_VALUE, second = Integer.MIN_VALUE;
        for (int x : d) {
            if (x > largest) { second = largest; largest = x; }
            else if (x > second && x != largest) second = x;
        }
        return new int[]{largest, second};
    }

    // smallest and second smallest
    public static int[] smallestTwo(int[] d) {
        int smallest = Integer.MAX_VALUE, second = Integer.MAX_VALUE;
        for (int x : d) {
            if (x < smallest) { second = smallest; smallest = x; }
            else if (x < second && x != smallest) second = x;
        }
        return new int[]{smallest, second};
    }

    public static void main(String[] args) {
        int n = 153; // sample
        System.out.println("Number: " + n);
        System.out.println("Digits: " + java.util.Arrays.toString(digitsArray(n)));
        System.out.println("Count: " + countDigits(n));
        System.out.println("Is Duck (hint def): " + isDuck(n));
        System.out.println("Is Armstrong: " + isArmstrong(n));
        int[] d = digitsArray(n);
        System.out.println("Largest two: " + java.util.Arrays.toString(largestTwo(d)));
        System.out.println("Smallest two: " + java.util.Arrays.toString(smallestTwo(d)));
    }
}
