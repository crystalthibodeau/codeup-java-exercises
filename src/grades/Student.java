package grades;
import java.util.ArrayList;

public class Student {
    private String name;
    private ArrayList<Integer> grades = new ArrayList<>();
    public Student(String name, int grades){
        this.name = name;
        this.grades = new ArrayList<>();
        this.grades.add(grades);
    }
    public void addGrade(int grade){
        this.grades.add(grade);
    }

    public String getName(){
        return this.name;
    }

    public double getGradeAverage(){
        double sum =0;
        for(int grade : grades){
            sum += grade;
        }
        return sum / grades.size();
    }
    public ArrayList<Integer> getGrades(){
        return this.grades;
    }

    public static void main(String[] args) {

        Student Student1 = new Student("Student1", 90);
        System.out.println(Student1.getGradeAverage());
        System.out.println(Student1.getName());
        Student1.addGrade(70);
        System.out.println(Student1.getGradeAverage());
        System.out.println(Student1.getGrades());



    }
}
