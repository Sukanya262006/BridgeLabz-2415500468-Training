import java.util.Scanner;
class HarshadNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        int sum = 0, temp = number;
        while (temp != 0) {
            sum += temp % 10;
            temp /= 10;
        }
        if (number % sum == 0) {
            System.out.println("Harshad Number");
        } else {
            System.out.println("Not a Harshad Number");
        }
        input.close();
    }
}