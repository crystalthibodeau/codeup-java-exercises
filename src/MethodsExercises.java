import java.util.Scanner;
import java.util.Random;


public class MethodsExercises {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


//===================================================FUNCTION CALLS=====================================================
//       System.out.println(Addition(2, 2)); //4
//       System.out.println(Subtraction(2, 2)); //0
//       System.out.println(multiplyMethods(2, 2)); //4
//       System.out.println(divisionMethod(4, 2)); //2
//       System.out.println(modulus(9, 2)); // 1 leftover
//
//        getInteger(1, 14); //min, max
//
//        factorial();

//        dice();

        highLow();

    }
//===================================================BONUS'S============================================================

//    1.Bonus
//    Create your multiplication method without the * operator (Hint: a loop might be helpful).
//    Do the above with recursion.
//
//    3.Bonus
//    Test the application and find the integer for the highest factorial that can be accurately calculated by this application, then modify the prompt so that it prompts the user for a number "from 1 to {the highest integer that returns accurate factorial calculation}". Don’t forget to change your verification too!
//    Use recursion to implement the factorial.
//
//    5.Bonus
//    Keep track of how many guesses a user makes.
//    Set an upper limit on the number of guesses.
//=========================================Question #1==================================================================

//     1.Create four separate methods. Each will perform an arithmetic operation:
//
//    Addition
//    Subtraction
//    Multiplication
//    Division

//    Each function needs to take two parameters/arguments so that the operation can be performed.
//    Test your methods and verify the output.
//    Add a modulus method that finds the modulus of two numbers.

    public static double Addition(double one, double two) {
        return one + two;
    }

    public static double Subtraction(double one, double two) {
        return one - two;
    }

    public static double multiplyMethods(double one, double two) { return one * two; }

    public static double divisionMethod(double one, double two) {
        return one / two;
    }

    public static double modulus(double one, double two) {
        return one % two;

    }

//==================================================Question #2=========================================================

//    2.Create a method that validates that user input is in a certain range

//    The method signature should look like this:
//    public static int getInteger(int min, int max);
//    and is used like this:

//    System.out.print("Enter a number between 1 and 10: ");
//    int userInput = getInteger(1, 10);
//    If the input is invalid, prompt the user again.
//    Hint: recursion might be helpful here!

    public static void getInteger(int min, int max) { //change void to int to utilize return
        do {
            Scanner scanner = new Scanner(System.in);
            System.out.printf("\nEnter a number between %d and %d: \n", min, max);
            int userNumb = scanner.nextInt();
            if (userNumb > min & userNumb < max) {
                System.out.printf("\nThank you for your input: %d!\n", userNumb);
                //return userNumb;
                break;
            }
        } while (true);
    }

//    public static int getInteger(int min, int max){
//        System.out.print("Enter a number between " + min + " and " + max + ": ");
//        int userInput = scanner.nextInt();
//        if( userInput < min || userInput > max){
//            return getInteger(min, max);
//        }else{
//            return userInput;
//        }
//    }
//==================================================Question #3=========================================================
//3.Calculate the factorial of a number.
//
//    Prompt the user to enter an integer from 1 to 10.
//    Display the factorial of the number entered by the user.
//    Ask if the user wants to continue.
//    Use a for loop to calculate the factorial.
//    Assume that the user will enter an integer, but verify it’s between 1 and 10.
//    Use the long type to store the factorial.
//    Continue only if the user agrees to.
//    A factorial is a number multiplied by each of the numbers before it.
//    Factorials are denoted by the exclamation point (n!). Ex:
//
//
//            1! = 1               = 1
//            2! = 1 x 2           = 2
//            3! = 1 x 2 x 3       = 6
//            4! = 1 x 2 x 3 x 4   = 24

//public static void factorial() {
//    do {
//
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("\nEnter a number between 1 and 10: \n");
//        int userNumb = scanner.nextInt();
//    int sum = 1;
//    for (int i =1; i <= userNumb; i++ ) {
//            sum *= i;
//    }
//        System.out.printf("The factorial of %d X %d is: %d\n",userNumb, userNumb, sum);
//        System.out.println("\nDo you want to continue? [y/n] ");
//        String option = scanner.next();
//        if (!option.equalsIgnoreCase("y")) {
//            System.out.println("Goodbye...\n");
//            break;
//        }
//    }while (true);
//
//}

    public static void factorial() {
                Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("\nEnter a number between 1 and 10: \n");
            int userNumb = scanner.nextInt();
            if(userNumb < 1 || userNumb > 10 ){
                System.out.print("\nNumber is not within range go again.\n");
                factorial();
            }else {
                String details = "";
                long factorial = 1;
                for (long i = 1; i <= userNumb; i++) {
                    details += ( i == 1 ) ? i : " x " + i;
                    factorial = factorial * i;
                    System.out.println(i +"! = " + details + " = " + (factorial));
                }
                System.out.println("\nDo you want to continue? [y/n] ");
            }
            String option = scanner.next();
            if (!option.equalsIgnoreCase("y")) {
                System.out.println("Goodbye...\n");
                break;
            }
        }while (true);
    }

//==================================================Question #4=========================================================
//    4.Create an application that simulates dice rolling.
//
//    Ask the user to enter the number of sides for a pair of dice.
//    Prompt the user to roll the dice.
//"Roll" two n-sided dice, display the results of each, and then ask the user if he/she wants to roll the dice again.
//            Use static methods to implement the method(s) that generate the random numbers.
//    Use the .random method of the java.lang.Math class to generate random numbers.
//    Game Development 101

        public static void dice() {
            System.out.println("Enter the number of sides for a pair of dice:");
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            Random rand = new Random();
            do {
                System.out.println("The values on dice are: ");
                for (int i = 0; i < 2; i++)
                    System.out.println(rand.nextInt(n/2) + 1);

                System.out.println("Roll again? [true/false]");
            } while (sc.nextBoolean());
        }
//
//==================================================Question #5=========================================================
//
//    5.Game Development 101

//    Welcome to the world of game development!
//
//    You are going to build a high-low guessing game. Create a class named HighLow inside of src.
//
//    The specs for the game are:
//
//    Game picks a random number between 1 and 100.
//    Prompts user to guess the number.
//    All user inputs are validated.
//    If user's guess is less than the number, it outputs "HIGHER".
//    If user's guess is more than the number, it outputs "LOWER".
//    If a user guesses the number, the game should declare "GOOD GUESS!"
//    Hints
//
//    Use the random method of the java.lang.Math class to generate a random number.

    public static void highLow() {
        System.out.println("Guess a number between 1 and 100");

        Random rand = new Random();
        int numberToGuess = rand.nextInt(100) + 1;
        double count = 0;


        do {
        Scanner scanner = new Scanner(System.in);
        int guessNum = scanner.nextInt();
       if(guessNum < numberToGuess){
           System.out.println("HIGHER");
           count++;
       }
       else if(guessNum > numberToGuess){
           System.out.println("LOWER");
           count++;
       }
        else if(guessNum == numberToGuess){
           System.out.printf("CORRECT! It took you %.0f guesses!", count);
           break;
       }
    }while(true);

    }


//==================================================End of Main=========================================================
}
