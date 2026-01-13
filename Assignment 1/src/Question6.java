import java.util.Scanner;

public class Question6 {
    // Write a class for a rectangle.
    // Create objects for this class and call the member functions to find the area and perimeter of the rectangle.

    static class Rectangle {
        double length;
        double width;

        // Constructor to initialize the object
        public Rectangle(double length, double width) {
            this.length = length;
            this.width = width;
        }

        // Member function: Area
        public double getArea() {
            return length * width;
        }

        // Member function: Perimeter
        public double getPerimeter() {
            return 2 * (length + width);
        }
    }

    void main() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter length: ");
        double l = scanner.nextDouble();

        System.out.print("Enter width: ");
        double w = scanner.nextDouble();

        Rectangle rectangle = new Rectangle(l, w);

        System.out.println("Area: " + rectangle.getArea());
        System.out.println("Perimeter: " + rectangle.getPerimeter());
    }
}