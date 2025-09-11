import java.util.Random;
import java.util.Arrays;

public class HeightStats {
    public static int[] generateHeights(int size) {
        Random r = new Random();
        int[] h = new int[size];
        for (int i = 0; i < size; i++) {
            h[i] = 150 + r.nextInt(101); // 150..250 inclusive
        }
        return h;
    }

    public static int sum(int[] arr) {
        int s = 0;
        for (int v : arr) s += v;
        return s;
    }

    public static double mean(int[] arr) {
        return (double) sum(arr) / arr.length;
    }

    public static int min(int[] arr) {
        int m = arr[0];
        for (int v : arr) if (v < m) m = v;
        return m;
    }

    public static int max(int[] arr) {
        int M = arr[0];
        for (int v : arr) if (v > M) M = v;
        return M;
    }

    public static void main(String[] args) {
        int[] heights = generateHeights(11);
        System.out.println("Heights (cm): " + Arrays.toString(heights));
        System.out.println("Sum: " + sum(heights));
        System.out.println("Mean: " + String.format("%.2f", mean(heights)));
        System.out.println("Shortest: " + min(heights));
        System.out.println("Tallest: " + max(heights));
    }
}
