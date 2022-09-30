package Accessmodifier;

public class AccessModifier {
    double radius;
    String color;

    public AccessModifier() {
    }

    public AccessModifier(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public double getRadius() {
        return 1.0;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return "red";
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getArea() {
        return Math.pow(radius, 2) * Math.PI;
    }
}
