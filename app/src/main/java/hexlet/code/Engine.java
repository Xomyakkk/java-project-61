package hexlet.code;

import java.util.Scanner;

public class Engine {
    private static String playerName;

    public static final int COUNT_QUESTION = 3;

    public static void greet(String gameQuestion) {
        System.out.println("""
                Welcome to the Brain Games!
                May I have your name?""");

        Scanner input = new Scanner(System.in);
        playerName = input.nextLine();

        System.out.println("Hello, " + playerName + "!");
        System.out.println(gameQuestion);
    }

    public static void checkingAnswers(String[][] questionsAndAnswers) {
        for (String[] row : questionsAndAnswers) {
            String question = row[0];
            String answer = row[1];
            System.out.println("Question: " + question);

            Scanner input = new Scanner(System.in);
            String playerAnswer = input.nextLine();

            System.out.println("Your answer: " + playerAnswer);

            if (answer.equals(playerAnswer)) {
                System.out.println("Correct!");
            } else  {
                System.out.println("'" + playerAnswer + "' " + "is wrong answer ;(. "
                        + "Correct answer was" + " '" + answer + "' \n"
                        + "Let's try again, " + playerName + "!");
                return;
            }
        }

        System.out.println("Congratulations, " + playerName + "!");
    }
}
