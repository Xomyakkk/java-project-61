package hexlet.code;

import java.util.Scanner;

public final class Engine {
    private Engine() { }

    public static final int COUNT_QUESTION = 3;

    private static String userName;


    public static void greet(String gameQuestion) {
        System.out.println("""
                Welcome to the Brain Games!
                May I have your name?""");

        Scanner input = new Scanner(System.in);
        userName = input.nextLine();

        System.out.println("Hello, " + userName + "!");
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
                        + "Let's try again, " + userName + "!");
                return;
            }
        }

        System.out.println("Congratulations, " + userName + "!");
    }
}
