package grades;
import java.lang.reflect.Array;
import java.util.ArrayList;
public class Student {

//    public static void main(String[] args) {
//        ArrayList<Integer> grades = new ArrayList<>();
//        Student student = new Student("Jordan", grades);
//
//        student.addGrade(98);
//        student.addGrade(99);
//        student.addGrade(94);
//        System.out.println(student.getName());
//        System.out.println(student.grades);
//        System.out.println(student.getGradeAverage());
//    }
    private String name;
    private ArrayList<Integer> grades;

    public Student(String name){
        this.name = name;
        this.grades = new ArrayList<>();
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
}
