import java.util.*;

public class SubsetCheck {

    public static <T> boolean isSubset(Set<T> a, Set<T> b) {
        // is a subset of b?
        return b.containsAll(a);
    }

    public static void main(String[] args) {
        Set<Integer> s1 = new HashSet<>(Arrays.asList(2, 3));
        Set<Integer> s2 = new HashSet<>(Arrays.asList(1, 2, 3, 4));
        System.out.println("Is {2,3} subset of {1,2,3,4}? " + isSubset(s1, s2));
    }
}
