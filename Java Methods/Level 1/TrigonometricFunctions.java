import java.util.Scanner;
public class TrigonometricFunctions {
    public static double[] calculateTrigonometricFunctions(double angle) {
        double rad = Math.toRadians(angle);
        double sin = Math.sin(rad);
        double cos = Math.cos(rad);
        double tan = Math.tan(rad);
        return new double[]{sin, cos, tan};
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter angle in degrees: ");
        double angle = sc.nextDouble();
        double[] res = calculateTrigonometricFunctions(angle);
        System.out.println("sin: " + res[0] + ", cos: " + res[1] + ", tan: " + res[2]);
    }
}