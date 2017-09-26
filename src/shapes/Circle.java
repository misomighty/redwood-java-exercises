package shapes;
import util.Input;

public class Circle {

    public static void main(String[] args) {
        Input input = new Input();
        Circle circle = new Circle(17);
        System.out.println(circle.getArea());
        System.out.println(circle.getCircumference());

    }
    private double radius;
    public static int numberOfCircles;

    public Circle(double radius) {
        this.radius = radius;
        numberOfCircles++;
    }

    public double getArea() {
    // area = pi x (radius ^ 2)
        return (Math.PI * Math.pow(radius, 2));
    }

    public double getCircumference() {
    // cir = 2 * pi * radius
        return (2 * Math.PI * radius);
    }

    public int getNumberOfCircles() {
        return numberOfCircles;
    };
}

