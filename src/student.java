import java.util.Date;

public class student {
    static int numberOfStudents = 0;
   public String name;
    String cohort;
    Date startDate;
    String program;
    boolean drinksCoffee;
    String location;

    public static void main(String[] args) {
        student daniel = new student("Daniel");
//        daniel.name = "Daniel";
        daniel.drinksCoffee = true;
        daniel.cohort = "Europa";
        daniel.startDate = new Date("06/11/2018");
        daniel.program = "Web development";
        daniel.location = "San Antonio";

        student zach = new student("Zach");
//        zach.name = "Zach";
        zach.drinksCoffee = false;
        zach.cohort = "Bayes";
        zach.startDate = new Date("02/11/2019");
        zach.program = "Data Science";
        zach.location = "San Antonio";

//        System.out.println(zach.name);
//        System.out.println(daniel.name);

//        System.out.println(zach.report());
//        System.out.println(daniel.report());
//        System.out.printf("\nThere are now %d students!", numberOfStudents);

    }

    public student(String name){
        numberOfStudents++;
        this.name = name;
        this.startDate = new Date ();
        this.drinksCoffee = true;

    }

    public String report() {
        String output = "";
        output +=
                "\n" + "Name: " + this.name +
                "\n" + "Cohort: " + this.cohort +
                "\n" + "Start Date: " + this.startDate +
                "\n" + "Program: " + this.program +
                "\n" + "Drinks Coffee: " + this.drinksCoffee +
                "\n" + "Location: " + this.location;
        return output;
    }

}
