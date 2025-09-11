public class UnitConverterPart2 {
    public static double convertYardsToFeet(double yards) { return yards * 3; }
    public static double convertFeetToYards(double feet) { return feet * 0.333333; }
    public static double convertMetersToInches(double meters) { return meters * 39.3701; }
    public static double convertInchesToMeters(double inches) { return inches * 0.0254; }
    public static double convertInchesToCm(double inches) { return inches * 2.54; }

    public static void main(String[] args) {
        System.out.println("2 yards = " + convertYardsToFeet(2) + " feet");
        System.out.println("6 feet = " + convertFeetToYards(6) + " yards");
        System.out.println("1 meter = " + convertMetersToInches(1) + " inches");
        System.out.println("12 inches = " + convertInchesToMeters(12) + " meters");
        System.out.println("10 inches = " + convertInchesToCm(10) + " cm");
    }
}
