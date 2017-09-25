import java.lang.Math;
import java.util.Scanner;

public class HighLow {
    public static void main(String[] args){


        // Game picks a number between 1 - 100
        int gameMaster = (int) Math.floor(Math.random()*100+1);
        System.out.println(gameMaster);
        // Game prompts user to guess the number
        System.out.println("Game Master: I've chosen a number between 1 and 100. GUESS IT: ");

        // All user inputs are validated
        int userInput = chooseANumber();
        System.out.println(userInput);
        while(!( userInput > 0) || !(userInput <= 100)) {
            System.out.println("I don't think that counts. Enter another number!");
            userInput = chooseANumber();
        }

        int counter = 1;
        // I can also you while(true) here. The conditions becomes false once the loops hits the break statement.
        while (userInput != gameMaster){
            if(counter != 5) {
                // If user's guess is less than the number, it outputs "HIGHER"
                if(userInput < gameMaster) {
                    System.out.println("My NUMBER IS HIGHER");
                    counter++;
                    System.out.println("Chance: " + counter +  "\nGuess again: ");
                    userInput = chooseANumber();
                    // If user's guess is more than the number, it outputs "LOWER"
                } else if (userInput > gameMaster) {
                    System.out.println("MY NUMBER IS LOWER");
                    counter++;
                    System.out.println("Chance: " + counter +"\nGuess again: ");
                    userInput = chooseANumber();
                    // If a user guesses the number, the game should declare "GOOD GUESS!
                }
            } else {
                System.out.println("Game over..");
                return;
            }

            }


        System.out.println("GOOD GUESS!");

        }



    public static int chooseANumber() {
        Scanner scan = new Scanner(System.in);
        int userInput = scan.nextInt();
        return userInput;
    }
}
