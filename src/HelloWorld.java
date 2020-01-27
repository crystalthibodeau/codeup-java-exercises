public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        {
            System.out.println("Code inside of curly braces should be indented");
            System.out.println("with four spaces");
        }
        byte myNum3 = 122; //Very short integers from -128 to 127
        short myNum4 = 22; //Short integers from -32,768 to 32,767
        int myNum = 22;  //Integers from -2,147,483,648 to 2,147,483,647
        long myNum2 = 222222222; //Long integers from -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807
        float myNum5 = 199.33F; //Single-precision, floating-point numbers from -3.4E38 to 3.4E38 with up to 7 significant digits
        double myNum6 = -1.7E308; //Double-precision, floating-point numbers from -1.7E308 to 1.7E308 with up to 16 significant digits
        char myNum7 = 2; //A single Unicode character that’s stored in two bytes
        boolean myTruth = true; //A true or false value

        System.out.println(myNum);
        System.out.println(myNum2);
        System.out.println(myNum3);
        System.out.println(myNum4);
        System.out.println(myNum5);
        System.out.println(myNum6);
        System.out.println(myNum7);
        System.out.println(myTruth);

        int id;
        boolean isLoggedIn;
        float bankAccountBalance;
        id = 123;
        isLoggedIn = false;
        bankAccountBalance = 1000.23F;

        System.out.println(id);
        System.out.println(isLoggedIn);
        System.out.println(bankAccountBalance);


        int theAnswer;
        String question;
        theAnswer = 42;
        question = "What is your favorite color?";

        System.out.println(theAnswer);
        System.out.println(question);
//        =======OR=========
//        int theAnswer = 42;
//        String question = "What is your favorite color?";
//        System.out.println(theAnswer);
//        System.out.println(question);
//        int myNumber = 12 + 12 * 2;
//        System.out.println(myNumber);
//
//        myNumber += 9;
////         equivalent to
//        myNumber = myNumber + 9;
//        System.out.println(myNumber);


        int myInteger = 900;
        long morePrecise = myInteger;

        double pi = 3.14159;
        int almostPi = (int) pi;

        System.out.println(myInteger);
        System.out.println(morePrecise);
        System.out.println(pi);
        System.out.println(almostPi);


//        ==========START OF LESSON========

        int myFavoriteNumber = 22;
        System.out.println(myFavoriteNumber);

        String myString = "Have a wonderful day!";
        System.out.println(myString);

        long myNumber = 123L;
        System.out.println(myNumber);

    }
}
