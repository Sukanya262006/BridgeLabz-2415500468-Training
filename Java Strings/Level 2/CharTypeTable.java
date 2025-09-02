import java.util.Scanner;

public class CharTypeTable {
    public static String charType(char ch) {
        if (ch >= 'A' && ch <= 'Z') ch = (char)(ch + ('a' - 'A'));
        if (ch >= 'a' && ch <= 'z') {
            if (ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') return "Vowel";
            return "Consonant";
        }
        return "Not a Letter";
    }

    public static String[][] classifyChars(String s) {
        // Return 2D array [char, type]
        // First compute length without length()
        int len = 0;
        try { while (true) { s.charAt(len); len++; } } catch (Exception e) { /* stop */ }
        String[][] table = new String[len][2];
        for (int i = 0; i < len; i++) {
            char c = s.charAt(i);
            table[i][0] = String.valueOf(c);
            table[i][1] = charType(c);
        }
        return table;
    }

    public static void displayTable(String[][] table) {
        System.out.println("Char\tType");
        for (String[] row : table) {
            System.out.println(row[0] + "\t" + row[1]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String text = sc.nextLine();
        String[][] table = classifyChars(text);
        displayTable(table);
        sc.close();
    }
}
