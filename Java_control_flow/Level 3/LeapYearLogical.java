import java.util.Scanner;
class LeapYearLogical {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int year = input.nextInt();
        if (year >= 1582 && (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0))) {
            System.out.println("Leap Year");
        } else {
            System.out.println("Not a Leap Year");
        }
        input.close();
    }
}