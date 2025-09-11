public class NumberChecker5 {
    // sum of proper divisors
    public static int sumProperDivisors(int n) {
        if (n <= 1) return 0;
        int sum = 1;
        for (int i = 2; i*i <= n; i++) {
            if (n % i == 0) {
                sum += i;
                int j = n / i;
                if (j != i) sum += j;
            }
        }
        return sum;
    }

    public static boolean isPerfect(int n) {
        return n > 0 && sumProperDivisors(n) == n;
    }

    public static boolean isAbundant(int n) {
        return n > 0 && sumProperDivisors(n) > n;
    }

    public static boolean isDeficient(int n) {
        return n > 0 && sumProperDivisors(n) < n;
    }

    // strong number: sum of factorials of digits equals number
    public static int factorial(int n) {
        int f = 1; for (int i=2;i<=n;i++) f*=i; return f;
    }

    public static boolean isStrong(int n) {
        int m = Math.abs(n);
        int sum = 0;
        while (m > 0) { int d = m%10; sum += factorial(d); m/=10; }
        return sum == Math.abs(n);
    }

    public static void main(String[] args) {
        int n = 145; // 145 is a strong number
        System.out.println("n=" + n);
        System.out.println("Perfect: " + isPerfect(n));
        System.out.println("Abundant: " + isAbundant(n));
        System.out.println("Deficient: " + isDeficient(n));
        System.out.println("Strong: " + isStrong(n));
    }
}
