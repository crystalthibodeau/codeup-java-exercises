import java.util.Random;

public class ServerNameGenerator {

//    Create two arrays whose elements are strings: one with at least 10 adjectives, another with at least 10 nouns.
//    Create a method that will return a random element from an array of strings.
public static String randomNum(String[] array) {
    Random rand = new Random();
    int indexVal = rand.nextInt(array.length) ;
//    int indexVal = new Random().nextInt(array.length); //without initialization of new random
    return array[indexVal];
}
//    Add a main method, and inside of your main method select and random noun and adjective and hyphenate the combination and display the generated name to the user.
//            Example Output
//
//    Here is your server name:
//    dedicated-photon
//
public static void main(String[] args) {
    String[] adjectives = {"sticky", "new", "bland", "sour", "fast", "slow", "giant", "smartest", "dank", "old" };
    String[] arrayNoun = {"dog", "ocean", "panther", "book", "ukelele", "juice", "Susan", "regret", "power", "advice"};
//    System.out.print(randomNum(adjectives));
    System.out.printf("Your server name is: %S-%S",randomNum(adjectives), randomNum(arrayNoun) );


}
}

