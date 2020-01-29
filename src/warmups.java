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
        System.out.print(sum);

    }
}
