import java.util.Scanner;
class GreatestFactorWhile {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int greatestFactor = 1;
        int i = n - 1;
        while (i >= 1) {
            if (n % i == 0) {
                greatestFactor = i;
                break;
            }
            i--;
        }
        System.out.println("Greatest factor: " + greatestFactor);
        input.close();
    }
}