package lab11;

import java.awt.Color;
import java.awt.Point;

public class Circle extends Shape {

    private double radius;

    public Circle(Color colour, Point position, double radius) {
        super(colour, position);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getDiameter() {
        return radius * 2;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }

    public double getCircumference() {
        return 2 * Math.PI * radius;
    }

    public String printCharacteristics() {
        return "Circle - Colour: " + getColour()
                + ", Position: (" + getPosition().x + ", " + getPosition().y + ")"
                + ", Radius: " + radius
                + ", Diameter: " + getDiameter()
                + ", Area: " + getArea()
                + ", Circumference: " + getCircumference();
    }
}