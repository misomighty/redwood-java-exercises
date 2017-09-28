package shapes;

public class Square extends Rectangle {
    public int side;
    public Square(int side) {

        // Calls the parent's constructor to set both the length and width to the value of side.
        // Super calls the parent class' constructor
        // In this way we are passing the values of side to both length and width
        // This allows us to use Rectangle's methods with the proper values for the Square object
        super(side, side);
        this.side = side;
    }

    public int getArea() {
        return this.side * this.side;
    }

    public int getPerimeter() {
        return this.side * 4;
    }




}
