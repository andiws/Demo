import java.util.Scanner;

public class OddsAndEvens {
    public static void main(String[] args) {



            System.out.println("Let’s play a game called “Odds and Evens”");

            System.out.println("What is your name?");

            Scanner input = new Scanner(System.in);

            String answer = input.next();

            while (answer != "") {
                System.out.println("Hi " + answer + ", which do you choose? (O)dds or (E)vens?");

                Scanner answerChoiceInput = new Scanner(System.in);

                String answerChoice = answerChoiceInput.next();


                if (answerChoice.equalsIgnoreCase("e")) {
                    String xyz = "Odds";

                    System.out.println(answer + " has picked " + answerChoice +
                            "! The computer will be " + xyz + ".");
                    System.out.println("--------------------------------------------------");


                } else if (answerChoice.equalsIgnoreCase("o")) {
                    System.out.println(answer + " has picked " + answerChoice +
                            "! The computer will be evens.");
                    System.out.println("--------------------------------------------------");


                }
            }
    }
}

