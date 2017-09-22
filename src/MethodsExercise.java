import java.util.Scanner;
import java.lang.Math;
public class MethodsExercise {

    public static void main(String[] args) {
        // CALL DICE
        diceRoll();
        // CALL FAC
        System.out.println(factorial());
        // CALL GET INT
        System.out.println(getInteger(1, 10));
        // CALL MOD
        System.out.println(modulus(10, 5));
        // CALL MUL
        System.out.println(multiply(2, 5));
        // CAL MUL BONUS
        System.out.println(multiplyBonus(6, 2));
        // CALL DIV
        System.out.println(divide(10, 5));
        // CAll SUB
        System.out.println(subtract(2, 1));
        // CALL ADD
        System.out.println(add(1, 2));
        // CALL HELLO
        sayHello("Jordan", 18);
        // RECURSION
        for(int i = 0; i <= 10; i++) {
            System.out.println("i = " +i);
        }

        System.out.println(counter(0));
    }
    //You can have two different versions of methods with the same name as long as the parameters are different
    //The program will determine if parameters are the same by 1) # of parameters and 2) data types
    public static void sayHello(String name, int age) {
        System.out.println("hello " + name + " age " + age);
    }

    public static int add(int a, int b) {
        return a + b;
    }

    public static int subtract(int a, int b) {
        return a - b;
    }
    public static int divide(int a, int b) {
        return a / b;
    }
    public static int multiply(int a, int b) {
        return a * b;
    }
    public static int multiplyBonus(int a, int b) {
        for (int i = 0; i < b; i++) {
            a += a;
            i++;

        }
        return a;
    }
    public static int modulus(int a, int b) {
        return a % b;
    }

    public static int counter(int i) {
        i++;
        if(i == 9) {
            return i;
        }
        return counter(i);
    }

    public static long getInteger(int min, int max) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Let's get the integer of a number between 1 and 10: ");
        int userInput = scan.nextInt();

        if(userInput >= min && userInput <= max) {
            return userInput;
        } else {
            return getInteger(min, max);
        }
    }

    public static long factorial() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Want to know the factorial of a number? (1-10): ");

        long userInput = scan.nextInt();

        if(userInput >= 1 && userInput <= 10) {
            long answer = 1;

            for(int i = 1; i <= userInput; i++) {
                answer *= i;
            }
            System.out.println(answer);
        }
            System.out.println("Would you like to do another: y/n ?");
            String userChoice = scan.next();
            if(userChoice.equals("y") || userChoice.equals("y".toUpperCase())){
                return userInput = factorial();
            } else {
                return 0;
            }
    }

    public static void diceRoll() {

        // Ask the user if they would like to roll
        while(true) {
            if(rollOrQuit().equalsIgnoreCase("roll")) {
                System.out.println(rollResult());
            } else {
                break;
            }
        }



    }
    public static int getDieSides() {
        Scanner scan = new Scanner(System.in);
        System.out.println("How many sides do your dice have? ");
        int userInput = scan.nextInt();
        scan.nextLine();
        return userInput;
    }

    public static String rollOrQuit() {
        // Returns user input: roll or quit
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter: Roll or Quit: [roll]/[quit]");
        String userChoice = scan.nextLine();
        return userChoice;
    }

    public static String rollResult() {
        int sides = getDieSides();
        int die1 = (int) Math.floor(Math.random() * sides + 1);
        int die2 = (int) Math.floor(Math.random() * sides + 1);
        return "You rolled " +die1+ " and " +die2+ ".";
    }

}
