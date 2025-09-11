public class DistanceAndLine {
    public static double euclideanDistance(double x1,double y1,double x2,double y2) {
        return Math.sqrt(Math.pow(x2-x1,2) + Math.pow(y2-y1,2));
    }

    public static double[] lineEquation(double x1,double y1,double x2,double y2) {
        double m = (y2 - y1) / (x2 - x1);
        double b = y1 - m * x1;
        return new double[]{m,b};
    }

    public static void main(String[] args) {
        double x1=1,y1=2,x2=4,y2=6;
        System.out.println("Distance: " + euclideanDistance(x1,y1,x2,y2));
        double[] mb = lineEquation(x1,y1,x2,y2);
        System.out.println("Line: y = " + mb[0] + "x + " + mb[1]);
    }
}
