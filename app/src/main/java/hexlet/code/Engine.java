package hexlet.code;

import java.util.Scanner;

public final class Engine {
    private Engine() { }

    public static final int COUNT_QUESTION = 3;

    public static void run(String description, String[][] roundsData) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        String userName = scanner.next();
        System.out.println("Hello, " + userName + "!");

        System.out.println(description);

        for (String[] row : roundsData) {
            String question = row[0];
            String answer = row[1];
            System.out.println("Question: " + question);

            String playerAnswer = scanner.nextLine();

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
