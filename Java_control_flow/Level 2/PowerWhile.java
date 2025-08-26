import java.util.Scanner;
class PowerWhile {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int base = input.nextInt();
        int exp = input.nextInt();
        if (base > 0 && exp >= 0) {
            int result = 1;
            int counter = 0;
            while (counter < exp) {
                result *= base;
                counter++;
            }
            System.out.println("Result: " + result);
        } else {
            System.out.println("Invalid input");
        }
        input.close();
    }
}