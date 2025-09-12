public class UnitConverterPart3 {
    public static double convertFahrenheitToCelsius(double f) { return (f - 32) * 5 / 9; }
    public static double convertCelsiusToFahrenheit(double c) { return (c * 9 / 5) + 32; }
    public static double convertPoundsToKg(double p) { return p * 0.453592; }
    public static double convertKgToPounds(double kg) { return kg * 2.20462; }
    public static double convertGallonsToLiters(double g) { return g * 3.78541; }
    public static double convertLitersToGallons(double l) { return l * 0.264172; }

    public static void main(String[] args) {
        System.out.println("32F = " + convertFahrenheitToCelsius(32) + " C");
        System.out.println("0C = " + convertCelsiusToFahrenheit(0) + " F");
        System.out.println("100 pounds = " + convertPoundsToKg(100) + " kg");
        System.out.println("50 kg = " + convertKgToPounds(50) + " pounds");
        System.out.println("10 gallons = " + convertGallonsToLiters(10) + " liters");
        System.out.println("20 liters = " + convertLitersToGallons(20) + " gallons");
    }
}
