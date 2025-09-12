import java.util.Scanner;
class Program10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if (num <= 0) return;
        String[] res = new String[num + 1];
        for (int i = 0; i <= num; i++) {
            if (i % 3 == 0 && i % 5 == 0) res[i] = "FizzBuzz";
            else if (i % 3 == 0) res[i] = "Fizz";
            else if (i % 5 == 0) res[i] = "Buzz";
            else res[i] = String.valueOf(i);
        }
        for (int i = 0; i <= num; i++) System.out.println("Position " + i + " = " + res[i]);
    }
}