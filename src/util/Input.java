package util;
import java.util.Scanner;

public class Input {

    public static void main(String[] args) {
        Input input = new Input();
        
//        System.out.println(input.getInt(1, 10));
//        System.out.println(input.getString("How are you today"));
//        System.out.println(input.yesNo("Will there be world peace?"));
    }

    private Scanner scanner;

    public Input() {
        scanner = new Scanner(System.in);
    }

    public String getString(String prompt) {
        System.out.println(prompt);
        String userInput = scanner.nextLine();
        return userInput;
    }

    public Boolean yesNo(String prompt) {
        System.out.print(prompt);
        String userInput = scanner.nextLine();
        return (userInput.toLowerCase().startsWith("y"));
    }

    public int getInt() {
        if(scanner.hasNextInt()) {
            return scanner.nextInt();
        } else {
            System.out.println("Invalid input");
        }

        return getInt();
    }

    public int getInt(int min, int max) {
        System.out.println("Enter a number: ");
        int userInput = scanner.nextInt();

        if(userInput < min || userInput > max) {

            userInput = getInt(min, max);
        }
        return userInput;
    }
    public double getDouble() {
        if(scanner.hasNextDouble()) {
            double userDouble = scanner.nextDouble();
            scanner.nextLine();
            return userDouble;
        } else {
            System.out.println("Invalid input");
        }
        return getDouble();
    }
    public double getDouble(double min, double max) {
        System.out.println("Enter a number: ");
        double userInput = scanner.nextInt();

        if(userInput < min || userInput > max) {

            userInput = getDouble(min, max);
        }
        return userInput;
    }






}
