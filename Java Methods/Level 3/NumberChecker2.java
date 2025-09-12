public class NumberChecker2 {
    public static int countDigits(int n) {
        n = Math.abs(n);
        if (n == 0) return 1;
        int c = 0; while (n > 0) { c++; n /= 10; } return c;
    }

    public static int[] digitsArray(int n) {
        n = Math.abs(n);
        int l = countDigits(n);
        int[] d = new int[l];
        for (int i = l-1; i >= 0; i--) { d[i] = n%10; n /= 10; }
        return d;
    }

    public static int sumDigits(int n) {
        int[] d = digitsArray(n); int s = 0; for (int x : d) s += x; return s;
    }

    public static int sumSquaresDigits(int n) {
        int[] d = digitsArray(n); int s = 0; for (int x : d) s += Math.pow(x,2); return s;
    }

    public static boolean isHarshad(int n) {
        int s = sumDigits(n); if (s==0) return false; return n % s == 0;
    }

    // frequency 2D array [[digit, freq], ...] for digits 0..9 present
    public static int[][] frequency(int n) {
        int[] freq = new int[10];
        int[] d = digitsArray(n);
        for (int x : d) freq[x]++;
        int[][] out = new int[10][2];
        for (int i = 0; i < 10; i++) { out[i][0] = i; out[i][1] = freq[i]; }
        return out;
    }

    public static void main(String[] args) {
        int n = 1223345;
        System.out.println("Number: " + n);
        System.out.println("Digits: " + java.util.Arrays.toString(digitsArray(n)));
        System.out.println("Sum digits: " + sumDigits(n));
        System.out.println("Sum squares: " + sumSquaresDigits(n));
        System.out.println("Is Harshad: " + isHarshad(n));
        System.out.println("Frequency table (digit, freq):");
        int[][] f = frequency(n);
        for (int i = 0; i < f.length; i++) {
            System.out.println(f[i][0] + " -> " + f[i][1]);
        }
    }
}
