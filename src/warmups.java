import org.w3c.dom.ls.LSOutput;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class warmups {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] nums = {1,2,3,4,5};
        System.out.println(Arrays.toString(products(nums)));
        System.out.println(compareNumbers(20.0,25.0));


        String input = "hello there how are you today";
        String[] output = input.split(" ");
        String result = "";
        for(int i = 0; i < input.split("\\s+").length; i++) {
            System.out.println(input.split("\\s+")[i]);
            for(int x = output[i].length()-1; x >= 0; x--){
                result = result + output[i].charAt(x);
            }
            result = result + " ";

        }
        System.out.println(result);


        System.out.println(divideByZero(4,2));
        System.out.println("enter a number");
        double inputNumber = scanner.nextInt();
        long sum = 0;
        for(int i=1;i<=inputNumber;i++) {
            sum += i;
        }
        System.out.print(addBinary("10","11"));
        binary(10,11);
        System.out.print(sum);

        System.out.print(multiply(10, 10));


        System.out.print(toThePower(2, 16));
        factorial();

        String[] fruits = new String[]{"banana", "kiwi", "apple", "grapefruit", "pear", "jackfruit"};
        int length = fruits.length;
        ArrayList<String> newFruits = new ArrayList<>();

        for (int i = 0; i < length ; i++) {
            newFruits.add(fruits[i]);
        }
        System.out.println(newFruits);

//            Warmup: write a java program that reads in a series of 3-5 lines and then writes them out to the console

        System.out.println("enter something");
        String input1 = scanner.next();
        System.out.println("enter something else");
        String input2 = scanner.next();
        System.out.println("enter something else again");
        String input3 = scanner.next();
        StringReturn(input1, input2, input3);

    }


    public static void StringReturn(String input1, String input2, String input3) {
        System.out.println(input1);
        System.out.println(input2);
        System.out.println(input3);
    }


    public static int multiply(int a, int b) {
        int sum = 0;
        for (int i = 0; i < b; i++) {
            sum += a;
        }
        return sum;
    }

    public static int toThePower(int a, int b) {
        int product = 1;
        for (int i = 0; i < b; i++) {
//            product *=a;
            product = multiply(product, a);
        }
        return product;
    }
//    17.
//    Write a
//    Java program
//    to add
//    two binary
//    numbers.Go to
//    the editor
//    Input Data:
//    Input first
//    binary number:10
//    Input second
//    binary number:11
//    Expected Output
//    Sum of
//    two binary
//    numbers:101

    public static void binary(int a, int b) {
        System.out.println(Integer.toBinaryString(a));
        System.out.println(Integer.toBinaryString(b));
    }

    public static String addBinary(String first, String second) {
        int b1 = Integer.parseInt(first, 2);
        int b2 = Integer.parseInt(second, 2);
        int sum = b1 + b2;
        return Integer.toBinaryString(sum);
    }

    public static void factorial() {

        Scanner scanner = new Scanner(System.in);
        System.out.print("enter a number");
        long userNum = scanner.nextLong();
        for (int i = 1; i <= userNum; i++) {
            if (userNum % i == 0) {
                System.out.print(i);

            }
        }
    }

    public static double divideByZero(int n, int n2) {
        int return1 = 0;
        try {
            return1 = n / n2;
        } catch (ArithmeticException ae) {
            if (n == 0 || n2 == 0) {
                throw new ArithmeticException("tried to devide by zero...");
            }
        }
        return (double) return1;
    }

    public static String compareNumbers(double n1, double n2) {
        if (n1 < n2) {
            return n1 + " < " + n2;
        } else if (n1 > n2) {
            return n1 + " > " + n2;
        } else {
            return n1 + " == " + n2;
        }
    }

//    @test
//    public void testCompareNumbers(){
//       assertEqual(compareNumbers.compareNumbers(50.0, 37.625), "50.0 > 37.625");
//        assertEqual(compareNumbers.compareNumbers(30.0, 37.625), "50.0 < 37.625");
//        assertEqual(compareNumbers.compareNumbers(30.0, 30), "30.0 == 30.0");
//
//    }

    public static ArrayList<ArrayList<Integer>> findMe(ArrayList<Integer> listToTry, int target) {
        ArrayList<ArrayList<Integer>> sums = new ArrayList<>();

        return sums;
    }

    public static int[] products(int[] nums) {
        int[] result = new int[nums.length];
        result[nums.length - 1] = 1;
        for (int i = nums.length - 2; i >= 0; i--) {
            result[i] = result[i + 1] * nums[i + 1];
        }
        int left = 1;
        for (int i = 0; i < nums.length; i++) {
            result[i] = result[i] * left;
            left = left * nums[i];
        }
        return result;
    }

}
