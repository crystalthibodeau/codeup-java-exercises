import java.util.Scanner;

public class catchMe {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        try {
            System.out.println("Your numbers combined are: " + add());
        } catch (Exception ex) {
            System.out.println("oops, something went wrong..");
        }
    }

    public static int add() {
        System.out.println("please enter a number");
        int numberOne =scanner.nextInt();
        System.out.println("please enter a second number to add to the first");
        int numberTwo =scanner.nextInt();
        return numberOne + numberTwo;
    }
}