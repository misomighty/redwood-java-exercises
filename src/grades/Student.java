package grades;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;

public class Student {

    private String name;
    private ArrayList<Integer> grades;
    private HashMap<String, String> attendance;

    public Student(String name){
        this.name = name;
        this.grades = new ArrayList<>();
        this.attendance = new HashMap<>();
    }

    public String getName() {
        return name;
    }

    public void addGrade(int grade) {
        grades.add(grade);
    }

    public double getGradeAverage() {
        double total = 0;
        for (double grade : grades) {
            total += grade;
        }
        return total / grades.size();
    }

    public void recordAttendance(String date, String value) {
        attendance.put(date, value);
    }

    public HashMap<String, String> getAttendance() {
        return attendance;
    }



}
