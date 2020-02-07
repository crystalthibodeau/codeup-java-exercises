import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class warmups {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//        System.out.println("enter a number");
//        double inputNumber = scanner.nextInt();
//        long sum = 0;
//        for(int i=1;i<=inputNumber;i++) {
//            sum += i;
//        }
//        System.out.print(addBinary("10","11"));
//        binary(10,11);
//        System.out.print(sum);

//        System.out.print(multiply(10, 10));


//        System.out.print(toThePower(2, 16));
//        factorial();

        String[] fruits = new String[]{"banana", "kiwi", "apple", "grapefruit", "pear", "jackfruit"};
        int length = fruits.length;
        ArrayList<String> newFruits = new ArrayList<>();

        for (int i = 0; i < length ; i++) {
            newFruits.add(fruits[i]);
        }
        System.out.println(newFruits);

    }


//    public static int multiply(int a, int b) {
//        int sum = 0;
//        for (int i = 0; i < b; i++) {
//            sum += a;
//        }
//        return sum;
//    }
//
//    public static int toThePower(int a, int b) {
//        int product = 1;
//        for (int i = 0; i < b; i++) {
////            product *=a;
//            product = multiply(product, a);
//        }
//        return product;
//    }
//    17. Write a Java program to add two binary numbers. Go to the editor
//    Input Data:
//    Input first binary number: 10
//    Input second binary number: 11
//    Expected Output
//    Sum of two binary numbers: 101
//public static void binary(int a, int b) {
//    System.out.println(Integer.toBinaryString(a));
//    System.out.println(Integer.toBinaryString(b));
//}

//    public static String addBinary(String first, String second) {
//        int b1 = Integer.parseInt(first, 2);
//        int b2 = Integer.parseInt(second, 2);
//        int sum = b1 + b2;
//        return Integer.toBinaryString(sum);
//    }

//    public static void factorial() {
//
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("enter a number");
//        long userNum = scanner.nextLong();
//        for (int i = 1; i <= userNum; i++) {
//            if (userNum % i == 0) {
//                System.out.print(i);
//
//            }
//        }
//    }

}
