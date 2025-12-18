package hexlet.code.games;

import static hexlet.code.Engine.COUNT_QUESTION;
import static hexlet.code.Engine.greet;
import static hexlet.code.Engine.checkingAnswers;
import static hexlet.code.util.Utils.generateNumber;

public final class GCD {
    // Константы класса Минимальное и Максимальное значение
    private static final int MIN_NUMBER = 1;
    private static final int MAX_NUMBER = 100;
    private GCD() { }

    public static void gcd() {
        final String messageQuestion = "Find the greatest common divisor of given numbers.";

        // Генератор вопросов и ответов

        String[][] questionsAndAnswers = new String[COUNT_QUESTION][2];

        for (int i = 0; i < COUNT_QUESTION; i++) {
            int a = generateNumber(MIN_NUMBER, MAX_NUMBER);
            int b = generateNumber(MIN_NUMBER, MAX_NUMBER);

            questionsAndAnswers[i][0] = a + " " + b;

            questionsAndAnswers[i][1] = Integer.toString(gcd(a, b));
        }

        // Передаем массив с готовыми вопросами и ответами и передаем вопрос
        checkingAnswers(questionsAndAnswers, greet(messageQuestion));
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
