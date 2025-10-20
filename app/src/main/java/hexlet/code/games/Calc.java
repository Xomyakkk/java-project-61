package hexlet.code.games;

import hexlet.code.Engine;

import java.util.concurrent.ThreadLocalRandom;

import static hexlet.code.Engine.COUNT_QUESTION;
import static hexlet.code.Engine.checkingAnswers;

public class Calc {
    public static void calc() {
        final String messageQuestion = "What is the result of the expression?";

        Engine.greet(messageQuestion);

        // Генератор вопросов и ответов

        String[][] questionsAndAnswers = new String[COUNT_QUESTION][2];

        for (int i = 0; i < COUNT_QUESTION; i++) {
            int a = ThreadLocalRandom.current().nextInt(1, 101);
            int b = ThreadLocalRandom.current().nextInt(1, 101);

            int c = ThreadLocalRandom.current().nextInt(1, 3);

            switch (c) {
                case 1:
                    questionsAndAnswers[i][0] = a + " + " + b;
                    questionsAndAnswers[i][1] = Integer.toString(a + b);
                    break;
                case 2:
                    questionsAndAnswers[i][0] = a + " - " + b;
                    questionsAndAnswers[i][1] = Integer.toString(a - b);
                    break;
                case 3:
                    questionsAndAnswers[i][0] = a + " * " + b;
                    questionsAndAnswers[i][1] = Integer.toString(a * b);
                    break;
                default:
                    break;
            }
        }

        // Передаем массив с готовыми вопросами и ответами
        checkingAnswers(questionsAndAnswers);
    }
}
