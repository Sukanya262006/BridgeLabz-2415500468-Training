import java.util.Scanner;

public class StringLengthWithoutMethod {
    public static int getLength(String str) {
        int count = 0;
        try {
            while (true) {
                str.charAt(count);
                count++;
            }
        } catch (StringIndexOutOfBoundsException e) {
            return count;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string (no spaces): ");
        String text = sc.next(); // as per hint: next()
        int customLen = getLength(text);
        int builtInLen = text.length();
        System.out.println("Length (custom): " + customLen);
        System.out.println("Length (built-in): " + builtInLen);
        System.out.println("Match? " + (customLen == builtInLen));
        sc.close();
    }
}
