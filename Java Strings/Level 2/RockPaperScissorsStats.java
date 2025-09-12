import java.util.Scanner;
import java.util.Random;

public class RockPaperScissorsStats {
    // 0: Rock, 1: Paper, 2: Scissors
    public static int computerChoice(Random r) {
        return r.nextInt(3);
    }

    public static int winner(int user, int comp) {
        // return 1 if user wins, -1 if comp wins, 0 if draw
        if (user == comp) return 0;
        if ((user == 0 && comp == 2) || (user == 1 && comp == 0) || (user == 2 && comp == 1)) return 1;
        return -1;
    }

    public static String choiceName(int c) {
        if (c == 0) return "Rock";
        if (c == 1) return "Paper";
        return "Scissors";
    }

    public static String[][] summary(int userWins, int compWins, int draws) {
        int total = userWins + compWins + draws;
        double userPct = total == 0 ? 0 : (userWins * 100.0) / total;
        double compPct = total == 0 ? 0 : (compWins * 100.0) / total;
        String[][] s = new String[2][3];
        s[0][0] = "User"; s[0][1] = String.valueOf(userWins); s[0][2] = String.valueOf(Math.round(userPct*100.0)/100.0);
        s[1][0] = "Computer"; s[1][1] = String.valueOf(compWins); s[1][2] = String.valueOf(Math.round(compPct*100.0)/100.0);
        return s;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random r = new Random();
        System.out.print("How many games? ");
        int games = sc.nextInt();
        int userWins = 0, compWins = 0, draws = 0;

        System.out.println("Enter your choices as 0=Rock, 1=Paper, 2=Scissors");
        System.out.println("Game\tUser\tComputer\tResult");
        for (int i = 1; i <= games; i++) {
            System.out.print("Your choice for game " + i + ": ");
            int user = sc.nextInt();
            while (user < 0 || user > 2) {
                System.out.print("Invalid. Enter 0,1,2: ");
                user = sc.nextInt();
            }
            int comp = computerChoice(r);
            int res = winner(user, comp);
            String result;
            if (res == 1) { userWins++; result = "User"; }
            else if (res == -1) { compWins++; result = "Computer"; }
            else { draws++; result = "Draw"; }
            System.out.println(i + "\t" + choiceName(user) + "\t" + choiceName(comp) + "\t" + result);
        }

        String[][] sum = summary(userWins, compWins, draws);
        System.out.println("\n--- Summary ---");
        System.out.println("Player\tWins\tWin%");
        for (String[] row : sum) {
            System.out.println(row[0] + "\t" + row[1] + "\t" + row[2]);
        }
        System.out.println("Draws: " + draws);
        sc.close();
    }
}
