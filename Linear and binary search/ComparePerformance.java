
public class ComparePerformance {
    public static void main(String[] args) {
        int n = 1000000;

        StringBuilder sb1 = new StringBuilder();
        long start1 = System.nanoTime();
        for (int i = 0; i < n; i++) {
            sb1.append("hello");
        }
        long end1 = System.nanoTime();

        StringBuffer sb2 = new StringBuffer();
        long start2 = System.nanoTime();
        for (int i = 0; i < n; i++) {
            sb2.append("hello");
        }
        long end2 = System.nanoTime();

        System.out.println("StringBuilder Time: " + (end1 - start1));
        System.out.println("StringBuffer Time: " + (end2 - start2));
    }
}
