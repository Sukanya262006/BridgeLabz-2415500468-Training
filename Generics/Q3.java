package generics;
class Util {
    public static <T> boolean isEqual(T a, T b) {
        return a.equals(b);
    }
}

public class Q3 {
    public static void main(String[] args) {
        System.out.println(Util.isEqual(10, 10));       // true
        System.out.println(Util.isEqual("Hi", "Bye"));  // false
    }
}

