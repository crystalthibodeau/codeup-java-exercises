import java.util.Scanner;

public class warmups {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("enter a number");
        double inputNumber = scanner.nextInt();
        long sum = 0;
        for(int i=1;i<=inputNumber;i++) {
            sum += i;
        }
//        System.out.print(sum);

//        System.out.print(multiply(10, 10));



//        System.out.print(toThePower(2, 16));

    }


    public static int multiply(int a, int b){
        int sum =0;
        for(int i =0; i <b; i++){
            sum +=a;
        }
        return sum;
    }
    public static int toThePower(int a, int b){
        int product =1;
        for(int i =0; i <b; i++){
//            product *=a;
            product = multiply(product, a);
        }
        return product;
    }
}
