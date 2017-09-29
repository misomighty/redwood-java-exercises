package shapes;

public class Rectangle extends Quadralateral implements Measurable {

    Rectangle(double length, double width) {
        super(length, width);
    }

    // Rectangle inherits an abs class (Quad) and must define all abs methods
    @Override
    void setLength(double length) {
        this.length = length;
    }

    @Override
    void setWidth(double width) {
        this.width = width;
    }

    @Override
    public double getArea() {
        return length * width;
    }

    @Override
    public double getPerimeter() {
        return 2 * length + 2 * width;
    }
}
