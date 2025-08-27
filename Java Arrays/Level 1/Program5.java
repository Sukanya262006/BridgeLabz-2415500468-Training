import java.util.Scanner;
class Program5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[] res = new int[4];
        for (int i = 6; i <= 9; i++) res[i - 6] = num * i;
        for (int i = 6; i <= 9; i++) System.out.println(num + " * " + i + " = " + res[i - 6]);
    }
}