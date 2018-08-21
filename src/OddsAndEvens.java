import java.util.*;

public class OddsAndEvens {
    public static void main(String[] args) {


        System.out.println("Let’s play a game called “Odds and Evens”");

        System.out.println("What is your name?");

        Scanner input = new Scanner(System.in);

        String answer = input.next();

        System.out.println("Hi " + answer + ", which do you choose? (O)dds or (E)vens?");

        Scanner answerChoiceInput = new Scanner(System.in);

        String answerChoice = answerChoiceInput.next();

        while (answer.equalsIgnoreCase("e") || answer.equalsIgnoreCase("o")) {


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

        System.out.println("How many fingers do you put out?");

        Scanner userQuestion = new Scanner(System.in);

        String userNumber = input.next();


        Random rand = new Random();

        int computerNumber = rand.nextInt(6);

        System.out.println("The computer plays number fingers.");

        System.out.println("--------------------------------------------------");


        String sum = userNumber + computerNumber;

        System.out.println(userNumber + "," + computerNumber + sum);


    }
}

