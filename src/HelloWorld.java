//import java.util.Scanner;
public class HelloWorld {
    public static void main(String[] args) {
        System.out.print("Hello, World!");
        System.out.println("\n");

//        Scanner scanner = new Scanner(System.in);

//        {
//            System.out.println("Code inside of curly braces should be indented");
//            System.out.println("with four spaces");
//        }

        byte myNum3 = 122; //Very short integers from -128 to 127 //Bytes 1
        short myNum4 = 22; //Short integers from -32,768 to 32,767 //Bytes 2
        int myNum = 22;  //Integers from -2,147,483,648 to 2,147,483,647 //Bytes 4
        long myNum2 = 222222222; //Long integers from -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807 //Bytes 8
        float myNum5 = 199.33F; //Single-precision, floating-point numbers from -3.4E38 to 3.4E38 with up to 7 significant digits //Bytes 4
        double myNum6 = -1.7E308; //Double-precision, floating-point numbers from -1.7E308 to 1.7E308 with up to 16 significant digits //Bytes 8
        char myNum7 = 2; //A single Unicode character that’s stored in two bytes //Bytes 2
        boolean myTruth = true; //A true or false value //Bytes 1
        //keyword 'final' sets var to const and cannot be reassigned

//        System.out.println(myNum);
//        System.out.println(myNum2);
//        System.out.println(myNum3);
//        System.out.println(myNum4);
//        System.out.println(myNum5);
//        System.out.println(myNum6);
//        System.out.println(myNum7);
//        System.out.println(myTruth);


//        byte numb1 =127;
//        short numb2 = numb1;
//        int numb3 = numb2;
//        long numb4 = numb3;
//
//        float numb5 = 3.333f;
//        double numb6 = numb5;
//
//        boolean yesNo = true;
//        yesNo = false;
//
//        char initial = 'D';
//
//        System.out.println(numb4);
//        System.out.println(numb6);
//        System.out.println(yesNo);
//        System.out.println(initial);



//        int id;
//        boolean isLoggedIn;
//        float bankAccountBalance;
//        id = 123;
//        isLoggedIn = false;
//        bankAccountBalance = 1000.23F;
//
//        System.out.println(id);
//        System.out.println(isLoggedIn);
//        System.out.println(bankAccountBalance);


//        int theAnswer;
//        String question;
//        theAnswer = 42;
//        question = "What is your favorite color?";
//
//        System.out.println(theAnswer);
//        System.out.println(question);
//        =======OR=========
//        int theAnswer = 42;
//        String question = "What is your favorite color?";
//        System.out.println(theAnswer);
//        System.out.println(question);

//        int myNumber = 12 + 12 * 2;
//        System.out.println(myNumber);

//        myNumber += 9;
//         equivalent to
//        myNumber = myNumber + 9;
//        System.out.println(myNumber);


//        int myInteger = 900;
//        long morePrecise = myInteger;
//
//        double pi = 3.14159;
//        int almostPi = (int) pi;
//
//        System.out.println(myInteger);
//        System.out.println(morePrecise);
//        System.out.println(pi);
//        System.out.println(almostPi);


//        ==========START OF LESSON========

        //1.
//        int myFavoriteNumber = 22;
//        System.out.println(myFavoriteNumber);

        //2.
//        String myString = "Have a wonderful day!";
//        System.out.println(myString);

        //3.
//        String myString = 'A'; //incompatible types
//        System.out.println(myString);

        //4.
//        String myString = 3.14159; //incompatible types
//        System.out.println(myString);

        //5.
//        long myNumber;
//        System.out.println(myNumber); //not initialized

        //6.
//        myNumber = 3.14; //incompatible types

        //7.
//        myNumber = 123L;
//        System.out.println(myNumber);

        //8.
//        myNumber = 123;
//        System.out.println(myNumber);
//        long numm = 3.14; //ask Thomas about number 8....
//        int nummm = 3.14;

        //9.
//        float myNumber2 = (float) 3.14;
//        ====OR====
//        float myNumber2 = 3.14F;
//        System.out.println(myNumber2);


        //10.
//        int x = 5;
//        System.out.println(x++);
//        System.out.println(x);
//
//        int x = 5;
//        System.out.println(++x);
//        System.out.println(x);

        //11.
//        String class = "hello"; //does not work reserved word

        //12.
//        String theNumberThree = "three";
//        Object o = theNumberThree;
//        System.out.println(o);
//        int three = (int) o; //does not work inconvertible types
//
//        int three = (int) "three";  //does not work inconvertible types
//        System.out.println(three);

//        Integer theNumberThree = 3;
//        Object o = theNumberThree;
//        int three = (int) o;
//        System.out.println(three); //DOES work



//13.
//=======Rewrite the following expressions using the relevant shorthand assignment operators:

        //a.
//        int x = 4;
//        x = x + 5;

//        int x = 4;
//        x += 5;
//        System.out.println(x);


//        b.
//        int x = 3;
//        int y = 4;
//        y = y * x;
//
//        int x = 3;
//        int y = 4;
//        y *= x;
//        System.out.println(x);
//        System.out.println(y);


        //c.

//        int x = 10;
//        int y = 2;
//        x = x / y;
//        y = y - x;


//        int x = 10;
//        int y = 2;
//        x /= y;
//        y -= x;
//        System.out.println(x);
//        System.out.println(y);

//
//
//        What happens if you assign a value to a numerical variable that is larger (or smaller) than the type can hold? What happens if you increment a numeric variable past the type's capacity?
//it loops through to the negative scope side of the number values

//        Hint: Integer.MAX_VALUE is a class constant (we'll learn more about these later) that holds the maximum value for the int type.
    }
}
