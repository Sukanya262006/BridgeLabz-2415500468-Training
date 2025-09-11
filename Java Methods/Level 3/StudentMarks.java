import java.util.Random;

public class StudentMarks {
    public static int[][] generateScores(int students) {
        Random r = new Random();
        int[][] scores = new int[students][3]; // physics, chem, math
        for (int i=0;i<students;i++) {
            scores[i][0] = 10 + r.nextInt(90); // 10..99
            scores[i][1] = 10 + r.nextInt(90);
            scores[i][2] = 10 + r.nextInt(90);
        }
        return scores;
    }

    public static double[][] computeTotals(int[][] scores) {
        int n = scores.length;
        double[][] out = new double[n][3]; // total, avg, percent
        for (int i=0;i<n;i++) {
            int total = scores[i][0] + scores[i][1] + scores[i][2];
            double avg = (double) total / 3.0;
            double percent = (double) total / 300.0 * 100.0;
            out[i][0] = total;
            out[i][1] = Math.round(avg * 100.0)/100.0;
            out[i][2] = Math.round(percent * 100.0)/100.0;
        }
        return out;
    }

    public static void main(String[] args) {
        int students = 5;
        int[][] scores = generateScores(students);
        double[][] res = computeTotals(scores);
        System.out.println("Stu\tP\tC\tM\tTotal\tAvg\t%");
        for (int i=0;i<students;i++) {
            System.out.printf("%d\t%d\t%d\t%d\t%.0f\t%.2f\t%.2f\n", i+1, scores[i][0], scores[i][1], scores[i][2], res[i][0], res[i][1], res[i][2]);
        }
    }
}
