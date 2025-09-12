import java.util.Scanner;
class YoungestTallest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int age1 = input.nextInt();
        int height1 = input.nextInt();
        int age2 = input.nextInt();
        int height2 = input.nextInt();
        int age3 = input.nextInt();
        int height3 = input.nextInt();
        if (age1 <= age2 && age1 <= age3) {
            System.out.println("Amar is youngest");
        } else if (age2 <= age1 && age2 <= age3) {
            System.out.println("Akbar is youngest");
        } else {
            System.out.println("Anthony is youngest");
        }
        if (height1 >= height2 && height1 >= height3) {
            System.out.println("Amar is tallest");
        } else if (height2 >= height1 && height2 >= height3) {
            System.out.println("Akbar is tallest");
        } else {
            System.out.println("Anthony is tallest");
        }
        input.close();
    }
}