import java.util.Scanner;
import java.util.Random;

public class StudentScorecards {
    public static int[][] generatePCM(int students) {
        Random r = new Random();
        int[][] pcm = new int[students][3];
        for (int i = 0; i < students; i++) {
            for (int j = 0; j < 3; j++) {
                pcm[i][j] = 10 + r.nextInt(90); // 10..99 two-digit
            }
        }
        return pcm;
    }

    public static double round2(double v) {
        return Math.round(v * 100.0) / 100.0;
    }

    public static double[][] totalsAveragesPercent(int[][] pcm) {
        int n = pcm.length;
        double[][] out = new double[n][3]; // total, avg, percent
        for (int i = 0; i < n; i++) {
            int total = pcm[i][0] + pcm[i][1] + pcm[i][2];
            double avg = total / 3.0;
            double percent = (total / 300.0) * 100.0;
            out[i][0] = round2(total);
            out[i][1] = round2(avg);
            out[i][2] = round2(percent);
        }
        return out;
    }

    public static String gradeFromPercent(double p) {
        // Assumed scheme
        if (p >= 90) return "A+";
        if (p >= 80) return "A";
        if (p >= 70) return "B";
        if (p >= 60) return "C";
        if (p >= 50) return "D";
        return "F";
    }

    public static String[] grades(double[][] tap) {
        String[] g = new String[tap.length];
        for (int i = 0; i < tap.length; i++) g[i] = gradeFromPercent(tap[i][2]);
        return g;
    }

    public static void display(int[][] pcm, double[][] tap, String[] grades) {
        System.out.println("ID\tPhy\tChem\tMath\tTotal\tAvg\t%\tGrade");
        for (int i = 0; i < pcm.length; i++) {
            System.out.println((i+1) + "\t" + pcm[i][0] + "\t" + pcm[i][1] + "\t" + pcm[i][2] +
                "\t" + (int)tap[i][0] + "\t" + tap[i][1] + "\t" + tap[i][2] + "\t" + grades[i]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int n = sc.nextInt();
        int[][] pcm = generatePCM(n);
        double[][] tap = totalsAveragesPercent(pcm);
        String[] g = grades(tap);
        display(pcm, tap, g);
        sc.close();
    }
}
