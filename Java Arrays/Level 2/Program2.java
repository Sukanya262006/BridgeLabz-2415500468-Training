import java.util.Scanner;
class Program2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] age = new int[3];
        int[] height = new int[3];
        for (int i = 0; i < 3; i++) age[i] = sc.nextInt();
        for (int i = 0; i < 3; i++) height[i] = sc.nextInt();
        int minAge = age[0], maxHeight = height[0], youngest = 0, tallest = 0;
        for (int i = 1; i < 3; i++) {
            if (age[i] < minAge) { minAge = age[i]; youngest = i; }
            if (height[i] > maxHeight) { maxHeight = height[i]; tallest = i; }
        }
        System.out.println("Youngest: Friend " + (youngest+1));
        System.out.println("Tallest: Friend " + (tallest+1));
    }
}