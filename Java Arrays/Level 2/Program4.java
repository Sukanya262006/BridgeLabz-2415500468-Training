import java.util.Scanner;
import java.util.Arrays;
class Program4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int maxDigit = 10, index = 0;
        int[] digits = new int[maxDigit];
        while (num != 0) {
            if (index == maxDigit) {
                maxDigit += 10;
                digits = Arrays.copyOf(digits, maxDigit);
            }
            digits[index++] = num % 10;
            num /= 10;
        }
        int largest = 0, second = 0;
        for (int i = 0; i < index; i++) {
            if (digits[i] > largest) { second = largest; largest = digits[i]; }
            else if (digits[i] > second && digits[i] != largest) second = digits[i];
        }
        System.out.println("Largest: " + largest + " Second Largest: " + second);
    }
}