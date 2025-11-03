import java.util.*;
public class Q10_SquareValueFromString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a numeric string: ");
        String str = sc.nextLine();
        Integer num = Integer.valueOf(str);
        System.out.println("Square: " + (num * num));
    }
}
