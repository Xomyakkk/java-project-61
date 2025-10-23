package hexlet.code.games;

import hexlet.code.Engine;

import static hexlet.code.Engine.COUNT_QUESTION;
import static hexlet.code.Engine.checkingAnswers;
import static hexlet.code.util.RandomConfig.MAX_NUMBER;
import static hexlet.code.util.RandomConfig.MIN_NUMBER;
import static hexlet.code.util.Utils.generateNumber;

public final class Gsd {
    private Gsd() { }

    public static void gcd() {
        final String messageQuestion = "Find the greatest common divisor of given numbers.";
        String userName = Engine.greet(messageQuestion);

        // Генератор вопросов и ответов

        String[][] questionsAndAnswers = new String[COUNT_QUESTION][2];

        for (int i = 0; i < COUNT_QUESTION; i++) {
            int a = generateNumber(MIN_NUMBER, MAX_NUMBER);
            int b = generateNumber(MIN_NUMBER, MAX_NUMBER);

            questionsAndAnswers[i][0] = a + " " + b;

            questionsAndAnswers[i][1] = Integer.toString(gcd(a, b));
        }

        // Передаем массив с готовыми вопросами и ответами
        checkingAnswers(userName, questionsAndAnswers);
    }
    private static int gcd(int a, int b) {
        while (b != 0) {
            int c = a % b;
            a = b;
            b = c;
        }
        return a;
    }
}
