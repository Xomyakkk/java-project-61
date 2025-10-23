package hexlet.code.games;

import hexlet.code.Engine;

import static hexlet.code.Engine.COUNT_QUESTION;
import static hexlet.code.Engine.checkingAnswers;
import static hexlet.code.util.Utils.generateNumber;

public final class Gsd {
    private Gsd() { }

    public static void gcd() {
        final String messageQuestion = "Find the greatest common divisor of given numbers.";
        String userName = Engine.greet(messageQuestion);

        // Генератор вопросов и ответов

        String[][] questionsAndAnswers = new String[COUNT_QUESTION][2];

        for (int i = 0; i < COUNT_QUESTION; i++) {
            int a = generateNumber(1, 100);
            int b = generateNumber(1, 100);

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
