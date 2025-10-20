package hexlet.code.games;

import hexlet.code.Engine;

import static hexlet.code.Engine.COUNT_QUESTION;
import static hexlet.code.Engine.checkingAnswers;
import static hexlet.code.util.Utils.generateNumber;

public final class Gsd {
    private Gsd() { }

    public static void gcd() {
        final String messageQuestion = "Find the greatest common divisor of given numbers.";

        Engine.greet(messageQuestion);

        // Генератор вопросов и ответов

        String[][] questionsAndAnswers = new String[COUNT_QUESTION][2];

        for (int i = 0; i < COUNT_QUESTION; i++) {
            int a = generateNumber();
            int b = generateNumber();

            questionsAndAnswers[i][0] = a + " " + b;

            while (b != 0) {
                int c = a % b;
                a = b;
                b = c;
            }

            questionsAndAnswers[i][1] = Integer.toString(a);
        }

        // Передаем массив с готовыми вопросами и ответами
        checkingAnswers(questionsAndAnswers);
    }
}
