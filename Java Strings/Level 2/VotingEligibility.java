import java.util.Scanner;
import java.util.Random;

public class VotingEligibility {
    // Generate random 2-digit ages for n students
    public static int[] generateAges(int n) {
        Random r = new Random();
        int[] ages = new int[n];
        for (int i = 0; i < n; i++) {
            ages[i] = 10 + r.nextInt(90 - 10); // 10..89
        }
        return ages;
    }

    public static String[][] eligibilityTable(int[] ages) {
        String[][] table = new String[ages.length][2];
        for (int i = 0; i < ages.length; i++) {
            int age = ages[i];
            boolean canVote;
            if (age < 0) canVote = false;
            else canVote = age >= 18;
            table[i][0] = String.valueOf(age);
            table[i][1] = String.valueOf(canVote);
        }
        return table;
    }

    public static void displayTable(String[][] table) {
        System.out.println("Age\tCanVote");
        for (String[] row : table) {
            System.out.println(row[0] + "\t" + row[1]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of students (e.g., 10): ");
        int n = sc.nextInt();
        int[] ages = generateAges(n);
        String[][] table = eligibilityTable(ages);
        displayTable(table);
        sc.close();
    }
}
