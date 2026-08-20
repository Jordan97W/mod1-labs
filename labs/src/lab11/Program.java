package lab11;

import java.awt.Color;
import java.awt.Point;
import java.util.ArrayList;

public class Program {

    public static void main(String[] args) {

        // Create some shapes
        Rectangle rectangle = new Rectangle(Color.RED, new Point(0, 0), 5, 10);
        Circle circle = new Circle(Color.BLUE, new Point(2, 3), 4);
        Sphere sphere = new Sphere(Color.GREEN, new Point(1, 1), 6);

        // Print their characteristics
        System.out.println(rectangle.getCharacteristics());
        System.out.println(circle.printCharacteristics());
        System.out.println(sphere.printCharacteristics());

        // Store them all in a list of Shape,
        // since Rectangle, Circle and Sphere are all "a kind of" Shape
        ArrayList<Shape> shapes = new ArrayList<>();
        shapes.add(rectangle);
        shapes.add(circle);
        shapes.add(sphere);

        // Enhanced for loop - only Shape methods are accessible here,
        // since the loop variable is declared as type Shape
        System.out.println("\n--- Shape colours and positions ---");
        for (Shape shape : shapes) {
            System.out.println("Colour: " + shape.getColour()
                    + ", Position: (" + shape.getPosition().x + ", " + shape.getPosition().y + ")");
        }
    }
}