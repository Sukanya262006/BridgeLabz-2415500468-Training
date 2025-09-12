import java.util.Scanner;
import java.util.Arrays;
class Program8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int maxFactor = 10;
        int[] factors = new int[maxFactor];
        int idx = 0;
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                if (idx == maxFactor) {
                    maxFactor *= 2;
                    factors = Arrays.copyOf(factors, maxFactor);
                }
                factors[idx++] = i;
            }
        }
        for (int i = 0; i < idx; i++) System.out.print(factors[i] + " ");
    }
}