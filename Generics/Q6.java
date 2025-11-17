package generics;
import java.util.*;

class Q6 {
    public static double sumNumbers(List<? extends Number> list) {
        double sum = 0;
        for (Number n : list) sum += n.doubleValue();
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(sumNumbers(List.of(1, 2, 3)));          // 6.0
        System.out.println(sumNumbers(List.of(1.5, 2.5, 3.0)));    // 7.0
    }
}
