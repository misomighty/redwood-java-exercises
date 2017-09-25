package shapes;
import util.Input;

public class CircleApp {
    public static void main(String[] args) {
        Input input = new Input();
        // Prompt the user for an integer value
        double userRadius = input.getDouble(1, 50);
        // userRadius is passed as radius of Circle object
        Circle circle = new Circle(userRadius);
        // Print the area and circumference
        System.out.println(circle.getArea());
        System.out.println(circle.getCircumference());

        Boolean prompt = input.yesNo("Would you like to make another circle? y/n");
        if(prompt) {
           makeACircle(input);
        }
    }
public static void makeACircle(Input input){
    // Prompt the user for an integer value
    double userRadius = input.getDouble(1, 50);
    // userRadius is passed as radius of Circle object
    Circle circle = new Circle(userRadius);
    // Print the area and circumference
    System.out.println(circle.getArea());
    System.out.println(circle.getCircumference());
}

}
