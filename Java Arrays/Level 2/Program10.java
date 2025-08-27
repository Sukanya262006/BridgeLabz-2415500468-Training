import java.util.Scanner;
class Program10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int count = 0, temp = num;
        while (temp > 0) { count++; temp /= 10; }
        int[] digits = new int[count];
        for (int i = 0; i < count; i++) { digits[i] = num % 10; num /= 10; }
        int[] freq = new int[10];
        for (int i = 0; i < count; i++) freq[digits[i]]++;
        for (int i = 0; i < 10; i++) if (freq[i] > 0) System.out.println(i + " occurs " + freq[i] + " times");
    }
}