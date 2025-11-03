public class Q6_NumberFormatException {
    public static void main(String[] args) {
        try {
            int num = Integer.parseInt("12a");
            System.out.println(num);
        } catch (NumberFormatException e) {
            System.out.println("Invalid input: " + e.getMessage());
        }
    }
}
