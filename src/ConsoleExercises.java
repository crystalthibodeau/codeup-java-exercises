import java.util.Scanner;

public class ConsoleExercises {
    public static void main(String[] args) {
        double pi = 3.14159;
        System.out.printf("The value of pi is approximately %.2f. \n", pi); //or System.out.format


//        //======user input prompt======
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.println("Enter something: ");
//        String userInput = scanner.next();
//
//        System.out.println("You entered: --> \"" + userInput + "\" <--");


        //=======int user input prompt======
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Enter a number: ");
//        // nextInt() reads the next integer from the keyboard
//        int number = scanner.nextInt();
//        // println() prints the following line to the output screen
//        System.out.println("You entered: " + number);


        //        ======three strings user input prompt======
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.println("Enter three words: ");
//        String userInput1 = scanner.next();
//        String userInput2 = scanner.next();
//        String userInput3 = scanner.next();
//
//        System.out.printf("You entered: %s %s %s \n",userInput1, userInput2, userInput3); //or System.out.format


        //=====user sentence string =====

//        Scanner scanner = new Scanner(System.in);
////
//        System.out.println("Enter a sentence: ");
//        String userInput = scanner.nextLine();
//
//        System.out.println("You entered: --> \"" + userInput + "\" <--");
//======= classroom size ======

        Scanner scanner = new Scanner(System.in);

//        System.out.println("Enter the width and height: ");
//        Integer width = scanner.nextInt();
//        Integer height = scanner.nextInt();
//
//        System.out.println("Area is: --> \"" + width * height + "\" <--");


        System.out.println("Enter the width and height: ");
        String input = scanner.nextLine(); //Example input: 2.5 10.0

        //Get location of space in order to separate values.  This only works if the user enters 2 values separated by a space.
        int space = input.indexOf(' ');

        //Parse the values, using the index of the space
        float w = Float.parseFloat(input.substring(0, space));
        float l = Float.parseFloat(input.substring(space, input.length()));

        //Calculate area/circumference
        float area = w*l;
        float perimeter = 2*w + 2*l;

//        System.out.println("Area is: --> \"" + area + "\" <-- and Perimeter is: --> \"" + perimeter + "\"");
        System.out.printf("Area is: --> %f <-- and Perimeter is: --> %.2f",area, perimeter); //or System.out.format


    }

    }
