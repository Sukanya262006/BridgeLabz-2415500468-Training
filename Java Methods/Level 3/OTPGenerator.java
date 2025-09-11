import java.util.Random;
import java.util.HashSet;

public class OTPGenerator {
    public static int generateOTP() {
        Random r = new Random();
        return 100000 + r.nextInt(900000); // 6-digit
    }

    public static boolean uniqueOTPs(int[] otps) {
        java.util.Set<Integer> s = new HashSet<>();
        for (int o : otps) s.add(o);
        return s.size() == otps.length;
    }

    public static void main(String[] args) {
        int[] otps = new int[10];
        for (int i=0;i<10;i++) otps[i] = generateOTP();
        System.out.print("Generated OTPs: ");
        for (int o : otps) System.out.print(o + " ");
        System.out.println();
        System.out.println("All unique? " + uniqueOTPs(otps));
    }
}
