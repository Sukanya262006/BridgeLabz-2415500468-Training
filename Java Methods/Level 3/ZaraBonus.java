import java.util.Random;

public class ZaraBonus {
    public static double[][] generateEmployees(int n) {
        Random r = new Random();
        double[][] arr = new double[n][2]; // [salary, years]
        for (int i=0;i<n;i++) {
            arr[i][0] = 10000 + r.nextInt(90000); // 5-digit salary 10000..99999
            arr[i][1] = r.nextInt(11); // years 0..10
        }
        return arr;
    }

    public static double[][] computeNewSalaryAndBonus(double[][] arr) {
        double[][] out = new double[arr.length][3]; // old, bonusAmt, newSalary
        for (int i=0;i<arr.length;i++) {
            double old = arr[i][0];
            int years = (int)arr[i][1];
            double rate = years > 5 ? 0.05 : 0.02;
            double bonus = old * rate;
            double neu = old + bonus;
            out[i][0] = old; out[i][1] = bonus; out[i][2] = neu;
        }
        return out;
    }

    public static void main(String[] args) {
        int n = 10;
        double[][] emp = generateEmployees(n);
        double[][] res = computeNewSalaryAndBonus(emp);
        double sumOld=0, sumNew=0, totalBonus=0;
        System.out.println("Emp\tYears\tOld\tBonus\tNew");
        for (int i=0;i<n;i++) {
            System.out.printf("%d\t%d\t%.0f\t%.2f\t%.2f\n", i+1, (int)emp[i][1], res[i][0], res[i][1], res[i][2]);
            sumOld += res[i][0]; totalBonus += res[i][1]; sumNew += res[i][2];
        }
        System.out.println("--------------------------------------");
        System.out.printf("Total\t\t%.0f\t%.2f\t%.2f\n", sumOld, totalBonus, sumNew);
    }
}
