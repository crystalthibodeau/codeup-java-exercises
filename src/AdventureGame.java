import java.util.Scanner;
import java.util.Random;

public class AdventureGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        letsPlay();
        System.out.print(multiply(10, 10));

      String mountain ="          /\\\n" +
              "         /  \\\n" +
              "        /    \\   /\\\n" +
              "       /      \\ /  \\\n" +
              "      /  /\\    /    \\        /\\    /\\  /\\      /\\            /\\/\\/\\  /\\\n" +
              "     /  /  \\  /      \\      /  \\/\\/  \\/  \\  /\\/  \\/\\  /\\  /\\/ / /  \\/  \\\n" +
              "    /  /    \\/ /\\     \\    /    \\ \\  /    \\/ /   /  \\/  \\/  \\  /    \\   \\\n" +
              "   /  /      \\/  \\/\\   \\  /      \\    /   /          \\        \\      \\   \\\n " +
              "__/__/_______/___/__\\___\\__________________________________________________";
//        System.out.println(mountain);

        String mountainRoad = "                                                \n" +
                "                 ___                         \n" +
                "               _/   \\\n" +
                "_             /      \\_                                    __\n" +
                " \\__    __   /         \\                          _       /  \\__      ___\n" +
                "    \\__/  \\_/__       \\ \\                       _/ \\__   /      \\____/   \\\n" +
                "  \\  ___   \\/  \\_      \\ \\               __   _/  .    \\_/  _/      __     \\__/\n" +
                " ___/   \\__/   \\ \\__     \\\\__           /  \\_/  /   \\  \\       __   /  \\____//\n" +
                "/  __    \\  /     \\ \\_   _//_\\___     _/    /  /     \\  \\___/  \\/     __/\n" +
                "__/_______\\________\\__\\_/________\\_ _/_____/__/________\\/_______\\____/_______\n" +
                "                                  /|\\\n" +
                "                                 / | \\\n" +
                "                                /  |  \\\n" +
                "                               /   |   \\\n" +
                "                              /    |    \\\n" +
                "                             /     |     \\\n" +
                "                            /      |      \\\n" +
                "                           /       |       \\\n";
//        System.out.println(mountainRoad);


    }

    public static void letsPlay() {
        do {
            String cityStart = "                                            ^ \n" +
                    "                              ________     ^^^\n" +
                    "                             |[] [] []|  .^^^^^.\n" +
                    "                             |[] [] []| | [] [] |\n" +
                    "                           __|[]_[] []| | [] [] |\n" +
                    "                          |++++++|] []| | [] [] |      Ready to Play? [y/n]\n" +
                    "                          |++++++|] []| | [] [] |\n" +
                    "                          |++++++|]_[]|_|_[] [] |\n" +
                    "                          |++++++|=|=|=|=|=| [] |\n" +
                    "                          |++++++|=|=|=|=|=| [] |\n" +
                    "__________     ___________|++II++|  __II___| II |_______   _________  _________\n" +
                    "    ______________      _______________   ______________      ______________\n" +
                    "______________ __________________  ___________    __________________    ____________";
            Scanner scanner = new Scanner(System.in);
            System.out.print(cityStart);
            System.out.print("\n\nEnter [y/n] to start\n");
            String option = scanner.next();
            int playerHealth = 12;
            int gameHealth = 12;


            if (option.equalsIgnoreCase("y")) {
                System.out.println("\nEnter your name..");
                String name = scanner.next();
                System.out.printf("\nGreetings %s, I hope you have prepared for the battle ahead... My name is Bob and I'll be with you during the adventure today!", name);
                System.out.println("\nLets get started! If... you still.. want too?.. [y/n]");
                String inputEnter = scanner.next();

                if (inputEnter.equals("y")) {
                    System.out.println("\nGreat! Take this bag, you'll need it later!");
                    System.out.println("The city is in great chaos! The monkeys have let some of the animals out of the Zoo!");
                    System.out.println("Darn primates, I always knew they were up to no good......");
                    System.out.println("So far we know a total of 3 monkeys, 1 lemur, a giraffe, and the star of our Zoo, Eddy the Elephant are running loose!");
                    System.out.printf("\n%s, here comes Eddy now!.. Continue?[y/n]\n", name);
                    String inputEnter2 = scanner.next();

                    if (inputEnter2.equals("y")) {
                        String elephant = "\n            .''~ ~ ~ _ _ _ - - - - ~~._\n" +
                                "           /` _      )  `\\              `\\\n" +
                                "          /`  a)    /     |               `\\\n" +
                                "         :`        /      |                 \\\n" +
                                "    <`-._|`  .-.  (      /   .            `;\\\\\n" +
                                "     `-. `--'_.'-.;\\___/'   .      .       | \\\\\n" +
                                "  _     /:--`     |        /     /        .'  \\\\\n" +
                                " (\"\\   /`/        |       '     '         /    :`;\n" +
                                " `\\'\\_/`/         .\\     /`~`=-.:        /     ``\n" +
                                "   `._.'          /`\\    |      `\\      /(\n" +
                                "                 /  /\\   |        `Y   /  \\\n" +
                                "                /  /  |  |         |  /`\\  \\\n" +
                                "               /  |   |  |         |  |  |  |\n" +
                                "              \"---\"  /___|        /___|  /__|\n" +
                                "                     '\"\"\"         '\"\"\"  '\"\"\"\n";
                        System.out.println(elephant);
                        System.out.println("In your bag you have 2 health potions, one rope, a medium sized net, and a red flag");
                        System.out.printf("[Your Health: %d] [Animals Combined Health: %d]",playerHealth, gameHealth);
                        System.out.printf("\n%s I sure hope you know what you're doing.. Eddy is starting to run right for you!..\n", name);
                        System.out.printf("\n%s, Hurry! What are you going to do?\n", name);
                        System.out.print("\na: Attempt to Lasso Eddy with the rope");
                        System.out.print("\nb: Wave your red flag as if Eddy were a bull");
                        System.out.print("\nc: Throw the net at Eddy");
                        System.out.print("\nd: RUN!\n");
                        String inputEnter3 = scanner.next();

                        if (inputEnter3.equals("a")) {
                            Random rand = new Random();
                            playerHealth -= rand.nextInt(4) + 1;
                            gameHealth -= 2;
                            System.out.println("Eddy swipes you with his husk!\n");
                            System.out.printf("[Your Health: %d] [Animals Combined Health: %d]",playerHealth, gameHealth);
                            System.out.println("\nNot a bad choice, but we need to keep going!\n");
                            System.out.printf("\n%s, we need to find the other animals!.. Continue?[y/n]\n", name);
                            String inputEnter4 = scanner.next();
                            if (inputEnter4.equals("y")) {
                                System.out.println("That was close!");
                                break;
                            }

                        }
                        if (inputEnter3.equals("b")) {
                            Random rand = new Random();
                            gameHealth -= 0;
                            playerHealth -= rand.nextInt(5) + 1;
                            System.out.println("Eddy is not a bull!!!\n");
                            System.out.printf("[Your Health: %d] [Animals Combined Health: %d]",playerHealth, gameHealth);
                            System.out.println("\nNot a great choice, Eddy tripped you as he ran by.. but we need to keep going!\n");
                            System.out.printf("\n%s, we need to find the other animals!.. Continue?[y/n]\n", name);
                            String inputEnter5 = scanner.next();
                            if (inputEnter5.equals("y")) {
                                System.out.println("That was close!");
                                break;
                            }
                        }
                        if (inputEnter3.equals("c")) {
                            Random rand = new Random();
                            gameHealth -= 0;
                            playerHealth -= rand.nextInt(11) + 1;
                            System.out.println("Oops.... Eddy is too big for that net...\n");
                            System.out.printf("[Your Health: %d] [Animals Combined Health: %d]",playerHealth, gameHealth);
                            System.out.println("Not a great choice, Eddy pretty much ran you over!!!\n");
                            System.out.printf("\n%s, we need to find the other animals!.. Continue?[y/n]\n", name);
                            String inputEnter6 = scanner.next();
                            if (inputEnter6.equals("y")) {
                                System.out.println("That was close!");
                                break;
                            }
                        }
                        if (inputEnter3.equals("d")) {
                            System.out.println("Well, some help you were...\n");
                            System.out.println("Game Over...\n");
                            break;
                        }
                    }
                }

            } else if (!option.equalsIgnoreCase("y")) {
                System.out.println("Goodbye...\n");
                break;
            }
        }while(true);

    }

    public static int multiply(int a, int b){
        int sum =0;
        for(int i =0; i <b; i++){
            sum +=a;
        }
        return sum;
    }


    }
