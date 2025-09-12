import java.util.Scanner;
class Grades {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int physics = input.nextInt();
        int chemistry = input.nextInt();
        int maths = input.nextInt();
        double avg = (physics + chemistry + maths) / 3.0;
        if (avg >= 90) {
            System.out.println("Average: " + avg + " Grade: A Excellent");
        } else if (avg >= 80) {
            System.out.println("Average: " + avg + " Grade: B Very Good");
        } else if (avg >= 70) {
            System.out.println("Average: " + avg + " Grade: C Good");
        } else if (avg >= 60) {
            System.out.println("Average: " + avg + " Grade: D Fair");
        } else {
            System.out.println("Average: " + avg + " Grade: F Fail");
        }
        input.close();
    }
}