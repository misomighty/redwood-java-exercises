package grades;
import java.util.HashMap;
import util.Input;


public class GradesApplication {
    public static void main(String[] args) {
        Input input = new Input();
        Student ryan = new Student("Ryan");
        ryan.addGrade(98);
        ryan.addGrade(92);
        ryan.addGrade(90);
        Student luis = new Student("Luis");
        luis.addGrade(89);
        luis.addGrade(85);
        luis.addGrade(82);
        Student zach = new Student("Zach");
        zach.addGrade(80);
        zach.addGrade(76);
        zach.addGrade(82);

        HashMap<String, Student> students = new HashMap<>();
        students.put("ryanorsinger", ryan);
        students.put("MontealegreLuis", luis);
        students.put("zgulde", zach);
//        students.put("fmendozaro", "fmendozaro");
//        students.put("jreich5", "jreich5");

        // User Interface
        System.out.println("Hello, user");
        System.out.println("Here are the github usernames of our students: ");
        // Print Usernames
        for (String username : students.keySet()) {
            System.out.print("|" + username + "| ");
        }
        System.out.println();
        System.out.println();
        do {
            // Prompt user selection
            String choice = input.getString("Which user would you like to know more about? ");

            if (students.containsKey(choice)) {
                String name = students.get(choice).getName();
                double avg = students.get(choice).getGradeAverage();
                System.out.println("Name: " + name + " - Github: " + choice + " - Average: " + avg);
            }
        } while (input.yesNo("Would you like to search again? y/n "));


    }
}

