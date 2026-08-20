package lab11;

import java.awt.Color;
import java.awt.Point;

public class Sphere extends Circle {

    public Sphere(Color colour, Point position, double radius) {
        super(colour, position, radius);
    }

    public double getVolume() {
        return (4.0 / 3.0) * Math.PI * Math.pow(getRadius(), 3);
    }

    @Override
    public String printCharacteristics() {
        return "Sphere - Colour: " + getColour()
                + ", Position: (" + getPosition().x + ", " + getPosition().y + ")"
                + ", Radius: " + getRadius()
                + ", Volume: " + getVolume();
    }
}