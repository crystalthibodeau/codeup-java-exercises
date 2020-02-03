import java.util.Date;
    public class game {
        static int numberOfLives = 0;
        public String opponentName;


        public static void main(String[] args) {
            game eddy = new game("Eddy");
            eddy.numberOfLives = 12;
        }

        public game(String name){
            this.opponentName = name;
            numberOfLives = 12;

        }

//        public String report() {
//            String output = "";
//            output +=
//                    "\n" + "Name: " + this.name +
//                            "\n" + "Cohort: " + this.cohort +
//                            "\n" + "Start Date: " + this.startDate +
//                            "\n" + "Program: " + this.program +
//                            "\n" + "Drinks Coffee: " + this.drinksCoffee +
//                            "\n" + "Location: " + this.location;
//            return output;
//        }

//    }
}
