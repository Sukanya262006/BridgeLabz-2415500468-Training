import java.util.Scanner;

public class QuadraticRoots {
    public static double[] findRoots(double a, double b, double c) {
        double delta = (b*b) - (4*a*c);
        if (delta > 0) {
            double r1 = (-b + Math.sqrt(delta)) / (2*a);
            double r2 = (-b - Math.sqrt(delta)) / (2*a);
            return new double[]{r1, r2};
        } else if (delta == 0) {
            double r = -b / (2*a);
            return new double[]{r};
        } else {
            return new double[]{};
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a, b, c: ");
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();
        double[] roots = findRoots(a,b,c);
        if (roots.length == 0) System.out.println("No Real Roots");
        else {
            System.out.print("Roots: ");
            for (double r : roots) System.out.print(r + " ");
        }
    }
}
