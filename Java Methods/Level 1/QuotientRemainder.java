import java.util.Scanner;
public class QuotientRemainder {
    public static int[] findRemainderAndQuotient(int number, int divisor) {
        int quotient = number / divisor;
        int remainder = number % divisor;
        return new int[]{quotient, remainder};
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int number = sc.nextInt();
        System.out.print("Enter divisor: ");
        int divisor = sc.nextInt();
        int[] res = findRemainderAndQuotient(number, divisor);
        System.out.println("Quotient: " + res[0] + ", Remainder: " + res[1]);
    }
}