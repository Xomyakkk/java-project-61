package hexlet.code;

import java.util.Scanner;

public class Even {
    public static void even(){
        int countQuestion = 3;
        System.out.println("Welcome to the Brain Games!");
        System.out.println("May I have your name?");

        Scanner input = new Scanner(System.in);
        String name = input.nextLine();

        System.out.println("Hello, " + name + "!");

        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");

        for (int i = 1; i <= countQuestion; i++) {
            int randomNumber = (int)(Math.random() * 100) + 1;
            String even;

            if (randomNumber % 2 == 0) {
                even = "yes";
            } else {
               even = "no";
            }

            System.out.println("Question: " + randomNumber);

            //Scanner input = new Scanner(System.in);
            String answer = input.nextLine();

            System.out.println("Your answer: " + answer);

            if (answer.equals(even)) {
                System.out.println("Correct!");
            } else  {
                System.out.println("'" + answer + "' " + "is wrong answer ;(. Correct answer was" + " '" + even + "' \n" +
                        "Let's try again, " + name + "!");
                return;
            }
        }

        System.out.println("Congratulations, " + name + "!");
    }
}
