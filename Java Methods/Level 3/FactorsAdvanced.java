import java.util.ArrayList;
import java.util.List;

public class FactorsAdvanced {
    public static int[] findFactors(int n) {
        n = Math.abs(n);
        List<Integer> list = new ArrayList<>();
        for (int i = 1; i <= n; i++) if (n % i == 0) list.add(i);
        int[] out = new int[list.size()];
        for (int i = 0; i < out.length; i++) out[i] = list.get(i);
        return out;
    }

    public static int greatestFactor(int[] factors) {
        int g = factors[0];
        for (int v : factors) if (v > g) g = v;
        return g;
    }

    public static int sumFactors(int[] factors) {
        int s = 0; for (int v : factors) s += v; return s;
    }

    public static long productFactors(int[] factors) {
        long p = 1; for (int v : factors) p *= v; return p;
    }

    public static long productCubes(int[] factors) {
        long p = 1; for (int v : factors) p *= (long) Math.pow(v, 3); return p;
    }

    public static void main(String[] args) {
        int n = 28;
        int[] f = findFactors(n);
        System.out.println("Factors of " + n + ": " + java.util.Arrays.toString(f));
        System.out.println("Greatest factor: " + greatestFactor(f));
        System.out.println("Sum: " + sumFactors(f));
        System.out.println("Product: " + productFactors(f));
        System.out.println("Product of cubes: " + productCubes(f));
    }
}
