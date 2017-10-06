package grades;
import java.util.ArrayList;
import java.util.HashMap;
import util.Input;


public class GradesApplication {
    public static void main(String[] args) {
// ---------------------------------- GLOBALS --------------------------------------//
        int numOfOptions = 3;
// ---------------------------------- HASH MAP --------------------------------------//
        Input input = new Input();
        Student ryan = new Student("Ryan");
        ryan.addGrade(98);
        ryan.addGrade(92);
        ryan.addGrade(90);
        ryan.recordAttendance("2017-10-02", "A");
        ryan.recordAttendance("2017-10-01", "A");
        ryan.recordAttendance("2017-09-30", "A");
        Student luis = new Student("Luis");
        luis.addGrade(89);
        luis.addGrade(85);
        luis.addGrade(82);
        luis.recordAttendance("2017-10-02", "P");
        luis.recordAttendance("2017-10-01", "A");
        luis.recordAttendance("2017-09-30", "P");
        Student zach = new Student("Zach");
        zach.addGrade(80);
        zach.addGrade(76);
        zach.addGrade(82);
        zach.recordAttendance("2017-10-02", "P");
        zach.recordAttendance("2017-10-01", "P");
        zach.recordAttendance("2017-09-30", "P");

        HashMap<String, Student> students = new HashMap<>();
        students.put("ryanorsinger", ryan);
        students.put("MontealegreLuis", luis);
        students.put("zgulde", zach);

        HashMap<String, String> attendance = new HashMap<>();



// ------------------------------- -------------- -----------------------------------//

// ------------------------------- USER INTERFACE -----------------------------------//
        // Greeting
        System.out.println("Hello, user: ");
        System.out.println(
                "[0] Search by github id \n" +
                "[1] View overall class average \n" +
                "[2] View full report \n" +
                "[3] View student's attendance by percent");
        System.out.println();
        System.out.println();


        do {
            // Get user option
            int option = input.getInt(0, numOfOptions);
            switch (option) {
                case 0:
                    reportStudent(students, input);
                    System.out.println();
                    System.out.println();
                    break;

                case 1:
                    // Overall AVG
                    System.out.println(getOverallAverage(students));
                    break;

                case 2:
                    // View full report
                    reportAllStudent(students);
                    break;

                case 3:
                    // View percent absent
//                    String choice = selectStudent(students, input);
//                    attendancePercent(students, choice);
//                    daysAbsent(students, choice);

                    String choice = "MontealegreLuis";
                    for (String item : students.get(choice).getAttendance().keySet()) {
                        if (students.get(choice).getAttendance().get(item).equals("A")) {
                            System.out.println(item);
                        } else {
                            System.out.println("NO");
                        }
                    }


            }
        } while (input.yesNo("Would you like to search again? y/n "));
    }

// ------------------------------- -------------- -----------------------------------//

// ------------------------------- METHODS LIST  ------------------------------------//

    public static String selectStudent(HashMap<String, Student> students, Input input) {

        System.out.println("Here are the github usernames of our students: ");
        // Print Usernames
        for (String username : students.keySet()) {
            System.out.print("|" + username + "| ");
        }
        String choice = input.getString("Enter the student's github id");
        System.out.println();
        return choice;
    }

    public static double getOverallAverage(HashMap<String, Student> students) {
        double total = 0;
        for (String user : students.keySet()) {
            double avg = students.get(user).getGradeAverage();
            total += avg;
        }
        return total / students.size();
    }

    public static void reportStudent(HashMap<String, Student> students, Input input) {

//        System.out.println("Here are the github usernames of our students: ");
//        // Print Usernames
//        for (String username : students.keySet()) {
//            System.out.print("|" + username + "| ");
//        }
        String choice = input.getString("Which user would you like to know more about? ");
        if (students.containsKey(choice)) {
            String name = students.get(choice).getName();
            double avg = students.get(choice).getGradeAverage();
            System.out.println("Name: " + name + " - Github: " + choice + " - Average: " + avg);
        }
    }
        public static void reportAllStudent(HashMap<String, Student> students) {
            for (String user : students.keySet()) {
                System.out.println("Name: " + students.get(user).getName() + " - Github: " + user + " - Average: " + students.get(user).getGradeAverage());

            }

    }
        public static void attendancePercent(HashMap<String, Student> students, String choice) {

            // (Total Days - Absences) / Total Days
                double total = 0;
                double numOfAbsences = 0;

                for (String item : students.get(choice).getAttendance().values()) {
                    total++;
                    if (item.equals("A")) {
                        numOfAbsences++;
                    }
                }
                double percentage = ((total - numOfAbsences) / total) * 100;
                if(percentage == 0) {
                    System.out.println(students.get(choice).getName() + ": Perfect Attendance");
                } else {
                    System.out.println(students.get(choice).getName() + ": " + percentage + "%");
                }



            }

        public static void daysAbsent(HashMap<String, Student> students, String choice) {
            for (String item : students.get(choice).getAttendance().keySet()) {
                if (item.equals("A"))
                System.out.println(item);
            }
        }

        }



