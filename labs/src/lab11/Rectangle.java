package lab11;

import java.awt.Color;
import java.awt.Point;

public class Rectangle extends Shape {

    private double sideA;
    private double sideB;

    public Rectangle(Color colour, Point position, double sideA, double sideB) {
        super(colour, position);
        this.sideA = sideA;
        this.sideB = sideB;
    }

    public double getSideA() {
        return sideA;
    }

    public void setSideA(double sideA) {
        this.sideA = sideA;
    }

    public double getSideB() {
        return sideB;
    }

    public void setSideB(double sideB) {
        this.sideB = sideB;
    }

    public double getArea() {
        return sideA * sideB;
    }

    public double getCircumference() {
        return 2 * (sideA + sideB);
    }

    public String getCharacteristics() {
        return "Rectangle - Colour: " + getColour()
                + ", Position: (" + getPosition().x + ", " + getPosition().y + ")"
                + ", Side A: " + sideA
                + ", Side B: " + sideB
                + ", Area: " + getArea()
                + ", Circumference: " + getCircumference();
    }
}