import java.util.Scanner;
import java.util.Random;


public class MethodsExercises {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//    Exercises
//    Create a class named MethodsExercises. Inside of your class, write code to create the specified methods. Test your code by creating a main method and calling each of the methods you've created.
//
//    1.Create four separate methods. Each will perform an arithmetic operation:
//
//    Addition
//    Subtraction
//    Multiplication
//    Division

//    Each function needs to take two parameters/arguments so that the operation can be performed.
//    Test your methods and verify the output.
//    Add a modulus method that finds the modulus of two numbers.

//        System.out.println(Addition(2, 2)); //4
//        System.out.println(Subtraction(2, 2)); //0
//        System.out.println(multiplyMethods(2, 2)); //4
//        System.out.println(divisionMethod(4, 2)); //2
//        System.out.println(modulus(9, 2)); // 1 leftover

//    Bonus
//    Create your multiplication method without the * operator (Hint: a loop might be helpful).
//    Do the above with recursion.
//
//    2.Create a method that validates that user input is in a certain range

//    The method signature should look like this:
//    public static int getInteger(int min, int max);
//    and is used like this:

//    System.out.print("Enter a number between 1 and 10: ");
//    int userInput = getInteger(1, 10);
//    If the input is invalid, prompt the user again.
//    Hint: recursion might be helpful here!
//
//        System.out.println(getInteger(2, 10)); //min, max

//    3.Calculate the factorial of a number.
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
//        System.out.println(factorial());
//    Bonus
//
//    Test the application and find the integer for the highest factorial that can be accurately calculated by this application, then modify the prompt so that it prompts the user for a number "from 1 to {the highest integer that returns accurate factorial calculation}". Don’t forget to change your verification too!
//    Use recursion to implement the factorial.
//    Create an application that simulates dice rolling.
//
//    Ask the user to enter the number of sides for a pair of dice.
//    Prompt the user to roll the dice.
//"Roll" two n-sided dice, display the results of each, and then ask the user if he/she wants to roll the dice again.
//            Use static methods to implement the method(s) that generate the random numbers.
//    Use the .random method of the java.lang.Math class to generate random numbers.
//    Game Development 101

        dice();
//
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
//    Bonus
//
//    Keep track of how many guesses a user makes.
//    Set an upper limit on the number of guesses.
//    Console Adventure Game!
//
//    This is a paired exercise, so find yourself a fellow adventurer before getting started!
//
//    Using what you've learned so far in the Java I module, we're going to create a classic text-based RPG game. These types of online role-playing games date back to the 70's and solely rely on a text-based interface. In this case, we'll be using Java to run this game in our console.
//
//    The idea is that your game will prompt the user, who will then input answers through the console (using the Scanner class). How the game changes depending on their answer is completely up to you! Below are a list of suggested features to get you started:
//
//    Ask if the user is ready to start. If they type in "yes", start the game.
//    Ask the user for their name. Store this as a variable to personalize the adventure.
//    A classic RPG will have the hero going through different scenarios and battling their enemies.
//    Display enemy stats and hero stats. Properties and values can be assigned by you.
//    For example: Health, Attack Points, etc.
//    Decide on what actions your hero can take.
//    Attack (decreases enemyHealth)
//    Drink potion (adds to heroHealth)
//    Run? (ends the game)
//    Keep asking for user input until the enemyHealth reaches 0, then end the game.
//    Bonuses
//
//    Allow the user to specify hero stats and enemy stats.
//    Automate an enemyAttack after each time the hero takes a turn.
//    End the game if either heroHealth or enemyHealth drops to 0.
//    Indicate how many potions your hero starts with. Decrement this number each time 'Use Potion' action is used.
//
//    Remember that these are only suggestions. Feel free to get creative and have fun!!


    }

//=========================================Question #1==================================================================

//    public static long Addition(int one, int two) {
//        return one + two;
//    }
//
//    public static long Subtraction(int one, int two) {
//        return one - two;
//    }
//
//    public static long multiplyMethods(int one, int two) {
//        return one * two;
//    }
//
//    public static long divisionMethod(int one, int two) {
//        return one / two;
//    }
//
//    public static long modulus(int one, int two) {
//        return one % two;
//    }
//==================================================Question #2=========================================================

//    public static int getInteger(int min, int max) {
//        do {
//            Scanner scanner = new Scanner(System.in);
//            System.out.printf("\nEnter a number between %d and %d: \n", min, max);
//            int userNumb = scanner.nextInt();
//            if (userNumb > min & userNumb < max) {
//                System.out.println("\nThank you for your input!\n");
//                return userNumb;
//            }
//        } while (true);
//    }

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
//public static int factorial() {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("\nEnter a number between 1 and 10: \n");
//        int userNumb = scanner.nextInt();
//    int sum = 1, i;
//    for (i =1; i <= userNumb; i++ ) {
//            sum *= i;
//        }
//    System.out.println("\nThank you for your input!");
//    return sum;
//}
//==================================================Question #4=========================================================
//    Create an application that simulates dice rolling.
//
//    Ask the user to enter the number of sides for a pair of dice.
//    Prompt the user to roll the dice.
//"Roll" two n-sided dice, display the results of each, and then ask the user if he/she wants to roll the dice again.
//            Use static methods to implement the method(s) that generate the random numbers.
//    Use the .random method of the java.lang.Math class to generate random numbers.




//        public static void dice() {
//            System.out.println("Enter the number of sides for a pair of dice:");
//            Scanner sc = new Scanner(System.in);
//            int n = sc.nextInt();
//            Random rand = new Random();
//            do {
//                System.out.println("The values on dice are: ");
//                for (int i = 0; i < 2; i++)
//                    System.out.println(rand.nextInt(n/2) + 1);
//
//                System.out.println("Roll again? [true/false]");
//            } while (sc.nextBoolean());
//        }
//

//==================================================End of Main=========================================================
}
