package hexlet.code;

import java.util.concurrent.ThreadLocalRandom;

import static hexlet.code.Engine.COUNT_QUESTION;
import static hexlet.code.Engine.checkingAnswers;

public class Prime {
    public static void prime() {
        Engine.greet();

        System.out.println("Answer 'yes' if given number is prime. Otherwise answer 'no'.");

        // Генератор вопросов и ответов

        String[][] questionsAndAnswers = new String[COUNT_QUESTION][2];

        for (int i = 0; i < COUNT_QUESTION; i++) {
            int randomNumber = ThreadLocalRandom.current().nextInt(1, 101);

            boolean prime = checkingPrime(randomNumber);

            String question = Integer.toString(randomNumber);
            String answer = (prime) ? "yes" : "no";

            questionsAndAnswers[i][0] = question;
            questionsAndAnswers[i][1] = answer;
        }

        // Передаем массив с готовыми вопросами и ответами
        checkingAnswers(questionsAndAnswers);
    }

    private static boolean checkingPrime(int number) {
        if (number < 2) {
            return false;
        }

        if (number == 2) {
            return true;
        }

        if (number % 2 == 0) {
            return false;
        }

        int limit = (int) Math.sqrt(number);   // Квадратный корень «снизу»
        for (int i = 3; i <= limit; i += 2) {
            if (number % i == 0) {          // Если делится – не простое
                return false;
            }
        }

        // Если ни одно условие не выполнено, то число простое
        return true;
    }
}
