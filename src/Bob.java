import java.util.Scanner;
public class Bob {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//====================2.Create a class named Bob with a main method for the following exercise.=========================
//
//                Bob is a lackadaisical teenager. In conversation, his responses are very limited.
//
//        Bob answers 'Sure.' if you ask him a question. (the input ends with a question mark)
//        He answers 'Whoa, chill out!' if you yell at him. (the input ends with an exclamation mark)
//        He says 'Fine. Be that way!' if you address him without actually saying anything. (empty input)
//        He answers 'Whatever.' to anything else.
//        Write the Java code necessary so that a user of your command line application can have a conversation with Bob.



//        System.out.println("Ask Bob A question");
//        String input = scanner.nextLine();
//        if(input.endsWith("!")){
//            System.out.println("Whoa, chill out!");
//        }else if(input.endsWith("?")){
//            System.out.println("Sure.");
//        }else if(input.isEmpty()){
//            System.out.println("Fine. Be that way!");
//        }else{
//            System.out.println("Whatever");
//        }
        while (true) {
            System.out.print("\nAsk Bob A question:\n");
            String userInput = scanner.nextLine();
            if (userInput.endsWith("?")) {
                System.out.println("\nBob: \"Sure.\"");
            } else if (userInput.endsWith("!")) {
                System.out.println("\nBob: \"Whoa, chill out!\"");
            } else if (userInput.isEmpty()) {
                System.out.println("\nBob: \"Fine. Be that way!\"");
            } else {
                System.out.println("\nBob: \"Whatever.\"");
            }
            System.out.println("\nKeep talking to Bob? [y/n]\n");
            String option = scanner.nextLine();
            if (option.equals("n")) {
                System.out.println("\nBob: \"Fine. BYE!\"");
                break;
            }
        }
    }
}
