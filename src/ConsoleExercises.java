import java.util.Scanner;

public class ConsoleExercises {
        public static void main(String[] args) {
            // Prompt the user for an integer
            Scanner scan = new Scanner(System.in);
            System.out.println("Give me an integer: ");
            int userInt = scan.nextInt();
            System.out.println(userInt);

            // Prompt the user for 3 words
            System.out.println("Give me 3 words: ");
            String userWord1 = scan.next();
            String userWord2 = scan.next();
            String userWord3 = scan.next();
            System.out.println(userWord1 + " " + userWord2 + " " + userWord3);

            // An empty nextLine will clear the scan log and grab new input
            scan.nextLine();

            //Prompt the user for a sentencet
            System.out.println("Give me a sentence: ");
            String userSentence = scan.nextLine();
            System.out.println(userSentence);

            // Prompt the user for a width and length value
            System.out.println("Width: ");
            double width = scan.nextInt();
            System.out.println("Length: ");
            double length = scan.nextInt();
            System.out.println("Height: ");
            double height = scan.nextInt();
            System.out.println("area = " + width + " x " + length);
            System.out.println("perimeter = (2 x " + width + ") + (" + " 2 x " + length + ")");
            System.out.println("volume = " + length + " x " + width + " x " + height);




    }
}
