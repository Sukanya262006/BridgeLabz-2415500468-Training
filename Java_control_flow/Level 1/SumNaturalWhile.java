import java.util.Scanner;
public class SumNaturalWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        if(n >= 1) {
            int formulaSum = n * (n + 1) / 2;
            int loopSum = 0;
            int i = 1;
            while(i <= n) {
                loopSum += i;
                i++;
            }
            System.out.println("Formula sum = " + formulaSum + ", Loop sum = " + loopSum);
            if(formulaSum == loopSum) System.out.println("Both results are correct!");
            else System.out.println("Mismatch found!");
        } else {
            System.out.println("Not a natural number");
        }
    }
}