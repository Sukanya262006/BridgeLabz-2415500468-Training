import java.util.Scanner;

public class PositiveNegativeCheck {
    public static boolean isPositive(int num) {
        return num >= 0;
    }
    public static boolean isEven(int num) {
        return num % 2 == 0;
    }
    public static int compare(int a, int b) {
        if (a > b) return 1;
        if (a == b) return 0;
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter number " + (i+1) + ": ");
            arr[i] = sc.nextInt();
        }
        for (int num : arr) {
            if (!isPositive(num)) {
                System.out.println(num + " is Negative");
            } else {
                System.out.println(num + " is Positive and " + (isEven(num) ? "Even" : "Odd"));
            }
        }
        int cmp = compare(arr[0], arr[arr.length - 1]);
        if (cmp == 0) System.out.println("First and last elements are Equal");
        else if (cmp > 0) System.out.println("First element is Greater than last");
        else System.out.println("First element is Less than last");
    }
}
