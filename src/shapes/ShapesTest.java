package shapes;

public class ShapesTest {
    public static void main(String[] args) {
        Rectangle box1 = new Rectangle(4, 5);

//        System.out.println(box1.getArea());
//        System.out.println(box1.getPerimeter());
//
        Rectangle box2 = new Square(6);
//        System.out.println(box2.getArea());
//        System.out.println(box2.getPerimeter());
        showRectangleInfo(box2);
    }

    public static void showRectangleInfo(Rectangle rectangle) {
        // This method has access to rectangles Methods box1 and box 2 are objects with type 'Rectangle'
        System.out.println("The rectangles perimeter is " + rectangle.getPerimeter() + " and the area is " + rectangle.getArea());
    }
}
