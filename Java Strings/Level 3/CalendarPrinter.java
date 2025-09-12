import java.util.Scanner;

public class CalendarPrinter {
    public static String monthName(int m) {
        String[] months = {"January","February","March","April","May","June","July","August","September","October","November","December"};
        return months[m-1];
    }

    public static boolean isLeap(int y) {
        if (y % 400 == 0) return true;
        if (y % 100 == 0) return false;
        return y % 4 == 0;
    }

    public static int daysInMonth(int m, int y) {
        int[] days = {31,28,31,30,31,30,31,31,30,31,30,31};
        if (m == 2 && isLeap(y)) return 29;
        return days[m-1];
    }

    // Gregorian algorithm to find day of week for 1st of given month/year
    // Return 0=Sunday ... 6=Saturday
    public static int firstDayOfMonth(int m, int y) {
        int d = 1;
        int y0 = y - (14 - m) / 12;
        int x = y0 + y0/4 - y0/100 + y0/400;
        int m0 = m + 12 * ((14 - m) / 12) - 2;
        int d0 = (d + x + (31 * m0) / 12) % 7;
        return d0;
    }

    public static void printCalendar(int m, int y) {
        System.out.println("    " + monthName(m) + " " + y);
        System.out.println("Su Mo Tu We Th Fr Sa");
        int first = firstDayOfMonth(m, y);
        int days = daysInMonth(m, y);
        // indent for first day
        for (int i = 0; i < first; i++) System.out.print("   ");
        for (int day = 1; day <= days; day++) {
            System.out.printf("%2d ", day);
            if ((first + day) % 7 == 0) System.out.println();
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter month (1-12): ");
        int m = sc.nextInt();
        System.out.print("Enter year: ");
        int y = sc.nextInt();
        printCalendar(m, y);
        sc.close();
    }
}
