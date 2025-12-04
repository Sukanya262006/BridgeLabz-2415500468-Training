import java.util.*;

public class RotateList {

    // Rotate left by k positions (without using Collections.rotate)
    public static <T> void rotateLeft(List<T> list, int k) {
        int n = list.size();
        if (n == 0) return;
        k = ((k % n) + n) % n; // handle negative / large k
        if (k == 0) return;

        List<T> temp = new ArrayList<>(list);
        for (int i = 0; i < n; i++) {
            list.set(i, temp.get((i + k) % n));
        }
    }

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(10, 20, 30, 40, 50));
        System.out.println("Original: " + list);
        rotateLeft(list, 2);
        System.out.println("Rotated by 2: " + list);
    }
}
