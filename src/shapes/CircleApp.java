package shapes;
import util.Input;

public class CircleApp {
    public static void main(String[] args) {
        Input input = new Input();

        do {
            // Prompt the user for an integer value
            System.out.println("Enter a radius: ");
            double userRadius = input.getDouble();

            // userRadius is passed as radius of Circle object
            Circle circle = new Circle(userRadius);

            // Print results
            System.out.println("area: " + circle.getArea());
            System.out.println("circumference: " + circle.getCircumference());
            System.out.println("Total circles: " + circle.getNumberOfCircles());

        } while (input.yesNo("Would you like to make another circle?: "));

    }


}
