import java.util.Scanner;
class LeapYearIfElse {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int year = input.nextInt();
        if (year >= 1582) {
            if (year % 400 == 0) {
                System.out.println("Leap Year");
            } else if (year % 100 == 0) {
                System.out.println("Not a Leap Year");
            } else if (year % 4 == 0) {
                System.out.println("Leap Year");
            } else {
                System.out.println("Not a Leap Year");
            }
        } else {
            System.out.println("Year not in Gregorian calendar");
        }
        input.close();
    }
}