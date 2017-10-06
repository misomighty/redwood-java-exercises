package util;
import sun.tools.java.BinaryClass;

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
        System.out.print(prompt + " ");
        String userInput = scanner.nextLine();
        return (userInput.toLowerCase().startsWith("y"));
    }

    public int getInt() {
        System.out.println("Enter a number: ");
        String a = scanner.nextLine();
        try {
            return Integer.valueOf(a);
        } catch (NumberFormatException e) {
            System.out.println("invalid number");
        } catch (Exception e) {
            return getInt();
        }
        return getInt();
    }

    public int getInt(int min, int max) {
        System.out.println("Enter a number: ");
        int userInput = scanner.nextInt();
        scanner.nextLine();
        if(userInput < min || userInput > max) {
            System.out.println("Invalid input");
            userInput = getInt(min, max);
        }
        return userInput;
    }
    public double getDouble() {
        // grab user input as a string
        // parse the input as in Integer
        // return the integer object
        System.out.println("Enter a double: ");
        try {
            String userDouble = scanner.nextLine();
            return Double.valueOf(userDouble);
        } catch (Exception e) {
            System.out.println("Invalid input");
        }
        return getDouble();
    }
    public double getDouble(double min, double max) {
        System.out.println("Enter a number: ");
        double userInput = scanner.nextInt();

        if(userInput < min || userInput > max) {
            System.out.println("Invalid input");
            userInput = getDouble(min, max);
        }
        return userInput;
    }

    public int getBinary() {

        try {
            int input = Integer.valueOf(getString("Enter a binary number: "), 2);
            return input;
        } catch (Exception e) {
            System.out.println("Invalid input");
        }
        return getBinary();
    }

    public int getHex() {
        try {
            int input = Integer.valueOf(getString("Enter a hexidecimal number;"), 16);
            return input;
        } catch (Exception e) {
            System.out.println("Enter a hexidecimal number");
            return getHex();
        }

    }





}
