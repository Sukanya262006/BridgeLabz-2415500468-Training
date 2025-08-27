import java.util.Scanner;
class Program5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int count = 0, temp = num;
        while (temp > 0) { count++; temp /= 10; }
        int[] digits = new int[count];
        for (int i = 0; i < count; i++) { digits[i] = num % 10; num /= 10; }
        for (int i = count-1; i >= 0; i--) System.out.print(digits[i]);
    }
}