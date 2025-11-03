public class Q4_StringToDoubleIntValue {
    public static void main(String[] args) {
        String str = "45.67";
        Double d = Double.valueOf(str);
        System.out.println(d.intValue());
    }
}
