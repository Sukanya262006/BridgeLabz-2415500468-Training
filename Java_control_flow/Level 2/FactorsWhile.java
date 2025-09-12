import java.util.Scanner;
class FactorsWhile {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        if (n > 0) {
            int i = 1;
            while (i < n) {
                if (n % i == 0) {
                    System.out.println(i);
                }
                i++;
            }
        } else {
            System.out.println("Not a positive integer");
        }
        input.close();
    }
}