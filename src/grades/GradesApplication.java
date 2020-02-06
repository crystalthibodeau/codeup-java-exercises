package grades;

import java.util.HashMap;
import java.util.Scanner;

public class GradesApplication {
    static HashMap<String, Student> Students = new HashMap<>();

    public static void main(String[] args) {
        Student Ryan = new Student("Ryan", 90);
        Ryan.addGrade(95);
        Ryan.addGrade(80);

        Student Alex = new Student("Alex", 77);
        Alex.addGrade((int) 78.5);
        Alex.addGrade(83);

        Student Thomas = new Student("Thomas", 95);
        Thomas.addGrade(98);
        Thomas.addGrade(100);

        Student Matt = new Student("Matt", 87);
        Thomas.addGrade(90);
        Thomas.addGrade(95);

        Students.put("RyanReed", Ryan);
        Students.put("aSmith", Alex);
        Students.put("TStoneking", Thomas);
        Students.put("MattH", Matt);


        System.out.println("Welcome!");
        System.out.println("Here are the GitHub usernames of our students:");
        prompts();

    }

    public static void prompts() {

        System.out.println(Students.keySet());
        System.out.println("What student would you like to see more information on?");
        Scanner scanner = new Scanner(System.in);
        String inputName = scanner.next();

        if (Students.containsKey(inputName)) {
            System.out.printf("Name: %s - GitHub Username: %s - Current Average: %.2f", Students.get(inputName).getName(), inputName, Students.get(inputName).getGradeAverage());
            System.out.println("\nWould you like to see another student?");
            String inputYOrNo = scanner.next();

                if (inputYOrNo.equalsIgnoreCase("n") || inputYOrNo.equalsIgnoreCase("no")) {
                    System.out.println("Goodbye, and have a wonderful day!");
                }
                else {
                prompts();
                }
            }
        else {
            System.out.printf("\nSorry, no student found with the GitHub username of \"%s\".", inputName);
            }
    }
}