import java.util.Scanner;

public class CharArrayDemo {
    public static char[] toCharArrayManual(String str) {
        char[] arr = new char[str.length()];
        for (int i = 0; i < str.length(); i++) {
            arr[i] = str.charAt(i);
        }
        return arr;
    }

    public static boolean compareArrays(char[] a1, char[] a2) {
        if (a1.length != a2.length) return false;
        for (int i = 0; i < a1.length; i++) {
            if (a1[i] != a2[i]) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String text = sc.next();

        char[] manualArray = toCharArrayManual(text);
        char[] builtInArray = text.toCharArray();

        System.out.println("Are both arrays equal? " + compareArrays(manualArray, builtInArray));
    }
}