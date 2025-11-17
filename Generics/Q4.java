package generics;
class MaxUtil {
    public static <T extends Comparable<T>> T maximum(T x, T y, T z) {
        T max = x;
        if (y.compareTo(max) > 0) max = y;
        if (z.compareTo(max) > 0) max = z;
        return max;
    }
}

public class Q4 {
    public static void main(String[] args) {
        System.out.println(MaxUtil.maximum(3, 7, 5));          // 7
        System.out.println(MaxUtil.maximum("Apple", "Banana", "Peach")); // Peach
    }
}
