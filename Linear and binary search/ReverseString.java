
public class ReverseString {
    public static void main(String[] args) {
        String input = "hello";
        StringBuilder sb = new StringBuilder(input);
        sb.reverse();
        System.out.println(sb.toString());
    }
}
