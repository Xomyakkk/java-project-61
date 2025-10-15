package hexlet.code;

import static hexlet.code.Engine.COUNT_QUESTION;
import static hexlet.code.Engine.checkingAnswers;

import java.util.concurrent.ThreadLocalRandom;

public class Even {
    public static void even(){
        Engine.greet();

        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");

        // Генератор вопросов и ответов

        String[][] questionsAndAnswers = new String[COUNT_QUESTION][2];

        for (int i = 0; i < COUNT_QUESTION; i++) {
            int randomNumber = ThreadLocalRandom.current().nextInt(1, 101);

            String even = (randomNumber % 2 == 0) ? "yes" : "no";
            String question = Integer.toString(randomNumber);

            questionsAndAnswers[i][0] = question;
            questionsAndAnswers[i][1] = even;
        }

        // Передаем массив с готовыми вопросами и ответами
        checkingAnswers(questionsAndAnswers);
    }
}