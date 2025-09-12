
// Circle.java
public class Circle {
    private double radius;

    // Default constructor
    public Circle() {
        this(1.0); // Constructor chaining
    }

    // Parameterized constructor
    public Circle(double radius) {
        this.radius = radius;
    }

    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    public double calculateCircumference() {
        return 2 * Math.PI * radius;
    }
}
