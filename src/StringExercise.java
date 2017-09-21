import java.util.Scanner;
public class StringExercise {
    public static void main(String[] args) {
//        String message = "I can do backslashes \\, double backslashes \\\\,\n" +
//                "and the amazing triple backslash \\\\\\!";
//
//        System.out.println(message);
        Scanner scan = new Scanner(System.in);

        System.out.println("Talk to Bob: ");
        String command = scan.nextLine();


        if (command.endsWith("?")) {
            System.out.println("Sure.");
        } else if (command.isEmpty()) {
            System.out.println("Fine, be that way.");
        } else if (command.endsWith("!") || command.equals(command.toUpperCase()) && !command.isEmpty()){
            System.out.println("Whoa, chill out!");
        } else {
            System.out.println("Whatever");
        }

        System.out.println("Continue? y/n");
        String option = scan.nextLine();
        if(!option.equalsIgnoreCase("y")) {
            break;
        }

        //Get rid of the () and - from a phone number format, keep only a String with just he numbers, then grab only the area code (the first 3 digits).

        String phoneNum = "(210) 330 4028";

    }
}
