import java.util.Scanner;
public class TriangularRun {
    public static int calculateRounds(double a, double b, double c) {
        double perimeter = a + b + c;
        double distance = 5000; // 5 km in meters
        return (int) Math.ceil(distance / perimeter);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter side 1: ");
        double a = sc.nextDouble();
        System.out.print("Enter side 2: ");
        double b = sc.nextDouble();
        System.out.print("Enter side 3: ");
        double c = sc.nextDouble();
        System.out.println("Rounds needed to complete 5 km: " + calculateRounds(a, b, c));
    }
}