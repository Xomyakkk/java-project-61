package hexlet.code;

import java.util.concurrent.ThreadLocalRandom;

import static hexlet.code.Engine.COUNT_QUESTION;
import static hexlet.code.Engine.checkingAnswers;

public class Gsd {
    public static void gcd() {
        Engine.greet();

        System.out.println("Find the greatest common divisor of given numbers.");

        // Генератор вопросов и ответов

        String[][] questionsAndAnswers = new String[COUNT_QUESTION][2];

        for (int i = 0; i < COUNT_QUESTION; i++) {
            int a = ThreadLocalRandom.current().nextInt(1, 101);
            int b = ThreadLocalRandom.current().nextInt(1, 101);

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
