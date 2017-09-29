package shapes;

public class ShapesTest {
    public static void main(String[] args) {
        // Cannot instantiate an interface (method)
        // What's the point of making an object with type Measurable?
        Measurable myShape;
        myShape = new Rectangle(5, 7);
        showRectangleInfo(myShape);
        myShape = new Square(5);
        showRectangleInfo(myShape);


    }


    public static void showRectangleInfo(Measurable shape) {
        // This method has access to rectangles Methods box1 and box 2 are objects with type 'Rectangle'
        System.out.println("The perimeter is " + shape.getPerimeter() + " and the area is " + shape.getArea());
    }
}
