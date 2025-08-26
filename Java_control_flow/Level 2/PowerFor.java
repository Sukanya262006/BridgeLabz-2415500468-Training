import java.util.Scanner;
class PowerFor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int base = input.nextInt();
        int exp = input.nextInt();
        if (base > 0 && exp >= 0) {
            int result = 1;
            for (int i = 1; i <= exp; i++) {
                result *= base;
            }
            System.out.println("Result: " + result);
        } else {
            System.out.println("Invalid input");
        }
        input.close();
    }
}