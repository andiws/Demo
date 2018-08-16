import java.util.Scanner;

public class OddsAndEvens {
    public static void main (String [] args)
    {
    System.out.println("Let’s play a game called “Odds and Evens”");

    System.out.println("What is your name?");

    Scanner input = new Scanner(System.in);

    String answer = input.next();

    System.out.println("Hi " + answer + ", which do you choose? (O)dds or (E)vens?");

    Scanner answerChoiceInput = new Scanner(System.in);

    String answerChoice = answerChoiceInput.next();

        int i = 0;
        do {
        if (answerChoice.equalsIgnoreCase("e")) {
            String xyz = "Odd";

            System.out.println(answer + " has picked " + answerChoice +
                    "! The computer will be " + xyz + ".");

        } else if (answerChoice.equalsIgnoreCase("o")) {
            System.out.println(answer + " has picked " + answerChoice +
                    "! The computer will be even.");

        }


            System.out.println ("--------------------------------------------------");
        } while (i > 20);
    }


    }

