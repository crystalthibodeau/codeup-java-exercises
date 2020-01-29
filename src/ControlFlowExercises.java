import java.util.Scanner;

public class ControlFlowExercises {
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);

        System.out.println("\n Hello!"); //or System.out.format

//        ===========1.Loop Basics==========
//
//        a.While
//
//        Create an integer variable i with a value of 5.
//        int i = 5;
//        Create a while loop that runs so long as i is less than or equal to 15
//        Each loop iteration, output the current value of i, then increment i by one.
//        Your output should look like this:
//
//        5 6 7 8 9 10 11 12 13 14 15

//        while (i < 15) {
//            System.out.println("i is " + i);
//            i++;
//        }

//        b.Do While
//
//        Create a do-while loop that will count by 2's starting with 0 and ending at 100. Follow each number with a new line.
//        int i = 0;
//        do {
//            System.out.println(i);
//            i +=2;
//        }while(i<100);

//        Alter your loop to count backwards by 5's from 100 to -10.
//        int i = 100;
//        do {
//            System.out.println(i);
//            i -=5;
//        }while(i>=-10);
//        Create a do-while loop that starts at 2, and displays the number squared on each line while the number is less than 1,000,000. Output should equal:
//
//        2
//        4
//        16
//        256
//        65536

//
//        double i = 2;
//        do{
//            System.out.printf("%.0f\n", i);
//            i = Math.pow(i, 2);
//        }while(i<1000000);

//
//        c.For
//
//        Refactor the previous two exercises to use a for loop instead.

//        for(int i = 100; i>=-10; i -=5){
//            System.out.println(i);
//        }
//        for(double i = 2; i<1000000; i = Math.pow(i, 2)) {
//            System.out.printf("%.0f\n", i);
//        }
//        ==========2.Fizzbuzz==========
//
//        One of the most common interview questions for entry-level programmers is the FizzBuzz test. Developed by Imran Ghory, the test is designed to assess basic looping and conditional logic skills.
//
//                Write a program that prints the numbers from 1 to 100.
//        For multiples of three: print “Fizz” instead of the number.
//        For the multiples of five: print “Buzz”.
//        For numbers which are multiples of both three and five: print “FizzBuzz”.
//        Display a table of powers.

//
//        for(int i = 1; i < 100; i++) {
//            System.out.println(i);
//            if (i == 5) {
//                break; // --------------+
//            } //                        |
//        }
//
//        for(double i = 1; i<100; i++) {
//            if(i % 3 == 0 && i % 5 == 0){
//                System.out.printf("FizzBuzz %.0f\n", i);
//            } else if(i % 5 == 0){
//                System.out.printf("Buzz %.0f\n", i);
//            } else if(i % 3 == 0) {
//                System.out.printf("Fizz %.0f\n", i);
//            }
//            else{
//                System.out.printf("%.0f\n", i);
//            }
//        }
//
//                Prompt the user to enter an integer.

//        System.out.println("Enter a number less than 100");
//        double input = scanner.nextDouble();
//
//        for(double i = input; i<100; i++) {
//            if(i % 3 == 0 && i % 5 == 0){
//                System.out.printf("FizzBuzz %.0f\n", i);
//            } else if(i % 5 == 0){
//                System.out.printf("Buzz %.0f\n", i);
//            } else if(i % 3 == 0) {
//                System.out.printf("Fizz %.0f\n", i);
//            }
//            else{
//                System.out.printf("%.0f\n", i);
//            }
//        }

//        =============3.Display a table of squares and cubes from 1 to the value entered.===========

//        Ask if the user wants to continue.
//        Assume that the user will enter valid data.
//        Only continue if the user agrees to.
//        Example Output
//
//        System.out.println("What number would you like to go up to?");
//        double input = scanner.nextDouble(); //Example input: 2.5 10.0
//
//        System.out.println("Here is your table!");
//        System.out.println(
//                "    number    | squared | cubed\n"
//        );
//        for(double i = 1; i < input; i++ ){
//            double squared = Math.pow(i, 2);
//            double cubed = Math.pow(i, 3);
//            System.out.printf(
////                    "------ | ------- | -----" +
////                    "1      | 1       | 1" +
//                    "       %.0f      | %.0f       | %.0f\n", i, squared, cubed);
//
//        }

//        What number would you like to go up to? 5
//
//        Here is your table!
//
//                number | squared | cubed
//                ------ | ------- | -----
//                1      | 1       | 1
//        2      | 4       | 8
//        3      | 9       | 27
//        4      | 16      | 64
//        5      | 25      | 125
//
//        ============4. Convert given number grades into letter grades.============
//
//                Prompt the user for a numerical grade from 0 to 100.
//        Display the corresponding letter grade.
//                Prompt the user to continue.
//        Assume that the user will enter valid integers for the grades.
//        The application should only continue if the user agrees to.
//        Grade Ranges:
//


//        System.out.println("What is your class grade?");
//        double grade = scanner.nextDouble();
//        System.out.println("Would you like to continue [y/n]");
//
//        String userInput = scanner.next();
//        boolean confirmation = userInput.equals("y");
//
//
//        if (confirmation) {
//            if(grade <= 100 & grade >= 88){
//                System.out.println("You received an A!");
//
//            }else if(grade <= 87 & grade >= 80){
//                System.out.println("You received a B!");
//            }else if(grade <= 79 & grade >= 67){
//                System.out.println("You received a C.");
//            }else if(grade <= 66 & grade >= 60){
//                System.out.println("You received a D..");
//            }else if(grade <= 59 & grade >= 1){
//                System.out.println("You received a F..........");
//            }else{
//                System.out.println("Try..again?...");
//            }
//        }else{
//            System.out.println("Fine go away....");
//
//        }


//        char A = 100 - 88;
//        char B = 87 - 80;
//        char C = 79 - 67;
//        char D = 66 - 60;
//        char F = 59 - 1;
//
//        Bonus
//
//        Edit your grade ranges to include pluses and minuses (ex: 99-100 = A+).

//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Want to continue Y/N");
//        String option = scanner.next();
//        while (option.equalsIgnoreCase("y")){
//            System.out.println("What number would you like to go up to?");
//            double number = scanner.nextDouble();
//            System.out.println("number|squared|cubed");
//            System.out.print("------|-------|-----");
//            for(double i = 1; i<=number; i++){
//                System.out.printf("%n%-5.0f |%-6.0f |%.0f", i, Math.pow(i,2), Math.pow(i,3));
//            }
//            System.out.println(" ");
//            System.out.println("Want to continue? Y/N");
//            option = scanner.next();
//        }

    }
}
