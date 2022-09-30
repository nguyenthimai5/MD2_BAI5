package Accessmodifier;

public class Circle {
    double radius;
    String color;

    public Circle() {
        this.radius=2;
        this.color="red";
    }

    public Circle(double radius) {
        this.radius = radius;
        this.color="red";
    }

    public double getRadius() {
        return radius;
    }
    public double getArea() {
        return Math.pow(radius, 2) * Math.PI;
    }
}
