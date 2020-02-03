package util;

import java.util.Scanner;

public class Input {
//    3.Create a package inside of src named util. Inside of util, create a class named Input that has a private property named scanner. When an instance of this object is created, the scanner property should be set to a new instance of the Scanner class. The class should have the following methods, all of which return command line input from the user:
//
//    String getString()
//    boolean yesNo()
//    int getInt(int min, int max)
//    int getInt()
//    double getDouble(double min, double max)
//    double getDouble()
//    The yesNo method should return true if the user enters y, yes, or variants thereof, and false otherwise.
//
//            The getInt(int min, int max) method should keep prompting the user for input until they give an integer within the min and max. The getDouble method should do the same thing, but with decimal numbers.
//
//    Create another class named InputTest that has a static main method that uses all of the methods from the Input class.
private Scanner scanner;

   public Input(){
       this.scanner = new Scanner(System.in);
   }

   public String getString(){
//       System.out.print("Enter something!");
       return scanner.nextLine();
   }

   public boolean yesNo(){
       System.out.print("Enter [y/n]..");
       String next = scanner.next();
       return next.toLowerCase().equals("y") || next.equals("yes");
   }

   public int getInt(int min, int max){
        int answer;
        do{
//            System.out.print("Enter a number between " + min + " and " + max + ": ");
            System.out.print("\nEnter choice..\n");
            answer = this.scanner.nextInt();
            if(answer<min || answer>max){
                System.out.print("\nInvalid choice, please try again..");
            }
        }while(answer < min || answer > max);
        return answer;
   }

   public int getInt(){
       System.out.print("Enter a number");
       return scanner.nextInt();
   }

   public double getDouble(double min, double max){
       double answer;
       do{
           System.out.print("Enter a number between " + min + " and " + max + ": ");
           answer = this.scanner.nextDouble();
       }while(answer < min || answer > max);

       return answer;
   }

    public double getDouble(){
        System.out.print("Enter a number");
        return scanner.nextDouble();
   }

}
