import java.util.Scanner;

public class ConsoleExercises {
    public static void main(String[] args) {
        double pi = 3.14159;
        System.out.printf("\n The value of pi is approximately %.2f. \n", pi); //or System.out.format


        //======user input prompt======
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.println("Enter something: ");
//        String userInput = scanner.next();
//
//        System.out.println("You entered: --> \"" + userInput + "\" <--");


        //=======int user input prompt======
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("\nEnter a number: ");
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
//        scanner.nextLine();

        //=====user sentence string =====
//        ===without next line ====
//        Scanner scanner = new Scanner(System.in);
////
//        scanner.useDelimiter("\n");
//        System.out.println("Enter a sentence: ");
//        String userInput = scanner.next();
//
//        System.out.println("You entered: --> \"" + userInput + "\" <--");
//        ====with next line===

//        Scanner scanner = new Scanner(System.in);
////
//        System.out.println("Enter a sentence: ");
//        String userInput = scanner.nextLine();
//
//        System.out.println("You entered: --> \"" + userInput + "\" <--");
//======= classroom size ======

//        Scanner scanner = new Scanner(System.in);
//
//        System.out.println("Enter the width and height: ");
//        Integer width = scanner.nextInt();
//        Integer height = scanner.nextInt();
//
//        System.out.println("Area is: --> \"" + width * height + "\" <--");
//
//
//        System.out.println("Enter the width and height: ");
//        String input = scanner.nextLine(); //Example input: 2.5 10.0
//
//        //Get location of space in order to separate values.  This only works if the user enters 2 values separated by a space.
//        int space = input.indexOf(' ');
//
//        //Parse the values, using the index of the space
//        float w = Float.parseFloat(input.substring(0, space));
//        float l = Float.parseFloat(input.substring(space, input.length()));
//
//        //Calculate area/circumference
//        float area = w*l;
//        float perimeter = 2*w + 2*l;
//        float volume = l * w * w;
//
////        System.out.println("Area is: --> \"" + area + "\" <-- and Perimeter is: --> \"" + perimeter + "\"");
//        System.out.printf("Area is: --> %.2f and Perimeter is: --> %.2f",area, perimeter); //or System.out.format

////=====volume bonus=======
////
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.println("Enter the width and length and height: ");
//        String input = scanner.nextLine(); //Example input: 2.5 10.0
//
//        //Get location of space in order to separate values.  This only works if the user enters 2 values separated by a space.
//        int space = input.indexOf(' ');
//        int lastSpace = input.lastIndexOf(' ');
//
//        //Parse the values, using the index of the space
//        float w = Float.parseFloat(input.substring(0, space));
//        float l = Float.parseFloat(input.substring(space, lastSpace));
//        float h = Float.parseFloat(input.substring(lastSpace, input.length()));
//
//        float volume = w*l*h;
//
//        System.out.println("Volume = " + volume);



////        Calculate area/circumference
//        float area = w*l;
//        float perimeter = 2*w + 2*l;
//        float volume = l * w * h;
//
////        System.out.println("Area is: --> \"" + area + "\" <-- and Perimeter is: --> \"" + perimeter + "\"");
//        System.out.printf("Area is: --> %.2f and Perimeter is: --> %.2f and Volume is: --> %.2f",area, perimeter, volume); //or System.out.format


//=== noland example=====
//        System.out.print("Enter the values of the length, width, and height of your classroom at Codeup: ");
//        String inputStrLengthAndWidth = aScanner.nextLine();
//        String[] strArr = inputStrLengthAndWidth.split(" ");
//        double length = Double.parseDouble(strArr[0]);
//        double width = Double.parseDouble(strArr[1]);
//        double height = Double.parseDouble(strArr[2]);
//        double area = length * width;
//        double perimeter = (length * 2) + (width * 2);
//        double volume = length * width * height;
//        System.out.printf("%s\n", inputStrLengthAndWidth);
//        System.out.printf("The area of the classroom is: %.2f.\n", area);
//        System.out.printf("The perimeter of the classroom is: %.2f.\n", perimeter);
//        System.out.printf("The volume of the classroom is: %.2f.\n", volume);
    }

    }
