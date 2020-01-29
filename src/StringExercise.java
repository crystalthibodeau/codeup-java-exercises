import java.util.Scanner;
public class StringExercise {
    public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);


//        ========================================1.String Basics========================================
//
//        For each of the following output examples: create a String variable that contains the desired output and print it out to the console, you can do this with only one String variable and one print statement for each output example.
//
//
//                We don't need no education
        String string1 = "We don't need no education";
        System.out.println(string1);

//        We don't need no thought control
        String string2 = string1.replace("education","thought control");
        System.out.println(string2);
//
//        Check "this" out!, "s inside of "s!
//        In windows, the main drive is usually C:
//        I can do backslashes \, double backslashes \\,
//        and the amazing triple backslash \\\!

        String message2 = "Check \"this\" out!, \"s inside of \"s!\n";
        System.out.println(message2);
        String message3 = "in windows, the main drive is usually C:\\\n";
        System.out.println(message3);
        String message4 = "I can do backslashes \\, double backslashes \\\\, \nand the amazing triple backslash \\\\\\!";
        System.out.println(message4);


        // ========================================2. on Bob.java!========================================
    }
    }
