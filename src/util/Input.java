package util;
import java.util.Scanner;

public class Input {
    private Scanner scanner;

    public Input() {
        this.scanner = new Scanner(System.in);
    }

    public String getString(String prompt) {
        System.out.println(prompt);
        String userInput = this.scanner.nextLine();
        return userInput;
    }

    public Boolean yesNo(String prompt) {
        System.out.println(prompt);
        String userInput = this.scanner.nextLine();
        if(userInput.equalsIgnoreCase("y") || userInput.equalsIgnoreCase("yes")) {
            return true;
        } else {
            return false;
        }
    }

    public int getInt(int min, int max) {
        System.out.println("Enter a number: ");
        int userInput = this.scanner.nextInt();

        if(userInput < min || userInput > max) {

            userInput = getInt(min, max);
        }
        return userInput;
    }
    public double getDouble(double min, double max) {
        System.out.println("Enter a number: ");
        double userInput = this.scanner.nextInt();

        if(userInput < min || userInput > max) {

            userInput = getDouble(min, max);
        }
        return userInput;
    }

    public static void main(String[] args) {
        Input input = new Input();
//        System.out.println(input.getInt(1, 10));
//        System.out.println(input.getString("How are you today"));
//        System.out.println(input.yesNo("Will there be world peace?"));
    }




}
