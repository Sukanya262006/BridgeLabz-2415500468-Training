import java.util.Scanner;

public class FrequencyCharAt {
    public static String[][] frequency(String s) {
        int[] freq = new int[256];
        int n = s.length();
        for (int i = 0; i < n; i++) freq[(int)s.charAt(i)]++;
        // count distinct characters for sizing
        int distinct = 0;
        for (int i = 0; i < 256; i++) if (freq[i] > 0) distinct++;
        String[][] out = new String[distinct][2];
        int idx = 0;
        for (int i = 0; i < 256; i++) {
            if (freq[i] > 0) {
                out[idx][0] = String.valueOf((char)i);
                out[idx][1] = String.valueOf(freq[i]);
                idx++;
            }
        }
        return out;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String text = sc.nextLine();
        String[][] freq = frequency(text);
        System.out.println("Char\tFreq");
        for (String[] row : freq) {
            System.out.println(row[0] + "\t" + row[1]);
        }
        sc.close();
    }
}
