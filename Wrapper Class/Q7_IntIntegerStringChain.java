public class Q7_IntIntegerStringChain {
    public static void main(String[] args) {
        int a = 50;
        Integer b = Integer.valueOf(a);
        String s = b.toString();
        Integer c = Integer.valueOf(s);
        System.out.println(a);
        System.out.println(b);
        System.out.println(s);
        System.out.println(c);
    }
}
