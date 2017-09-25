package shapes;
import util.Input;

public class Circle {
    private double radius;
    public static int numberOfCircles;

    public Circle(double radius) {
        this.radius = radius;
        numberOfCircles++;

    }

    public double getArea() {
    // area = pi x (radius ^ 2)
        return (3.14 * Math.pow(radius, 2));
    }

    public double getCircumference() {
    // cir = 2piR
        return (2 * 3.14 * radius);
    }

    public void makeACircle() {}


    public static void main(String[] args) {
        Input input = new Input();
        Circle circle = new Circle(17);
        System.out.println(circle.getArea());
        System.out.println(circle.getCircumference());

    }
}

