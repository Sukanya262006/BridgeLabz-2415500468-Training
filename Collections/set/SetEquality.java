import java.util.*;

public class SetEquality {

    public static <T> boolean areEqual(Set<T> s1, Set<T> s2) {
        return s1.equals(s2);
    }

    public static void main(String[] args) {
        Set<Integer> s1 = new HashSet<>(Arrays.asList(1, 2, 3));
        Set<Integer> s2 = new HashSet<>(Arrays.asList(3, 2, 1));
        System.out.println("Equal? " + areEqual(s1, s2));
    }
}
