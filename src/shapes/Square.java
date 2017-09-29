package shapes;

public class Square extends Quadralateral {
    protected int side;

    public Square(int side) {

        super(side, side);
        this.side = side;
    }


    @Override
    protected void setLength(double length) {
        this.length = length;
        this.width = length;
    }

    @Override
    protected void setWidth(double width) {
        this.width = width;
        this.length = width;
    }

    @Override
    public double getArea() {
        return side * 2;
    }

    @Override
    public double getPerimeter() {
        return side * 4;
    }
}
