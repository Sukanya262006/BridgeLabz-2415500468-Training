import java.util.Scanner;
public class FeeDiscountInput {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double fee = input.nextDouble();
        double discountPercent = input.nextDouble();
        double discount = fee * discountPercent / 100.0;
        double discountedFee = fee - discount;
        System.out.println("The discount amount is INR " + discount + " and final discounted fee is INR " + discountedFee);
    }
}
