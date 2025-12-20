package hexlet.code.games;

import static hexlet.code.Engine.COUNT_QUESTION;
import static hexlet.code.Engine.run;
import static hexlet.code.util.Utils.generateNumber;

public final class Prime {
    // Константы класса Минимальное и Максимальное значение
    private static final int MIN_NUMBER = 1;
    private static final int MAX_NUMBER = 100;
    private Prime() { }

    public static void prime() {
        final String messageQuestion = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";

        // Генератор вопросов и ответов

        String[][] questionsAndAnswers = new String[COUNT_QUESTION][2];

        for (int i = 0; i < COUNT_QUESTION; i++) {
            int randomNumber = generateNumber(MIN_NUMBER, MAX_NUMBER);

            boolean prime = isPrime(randomNumber);

            String question = Integer.toString(randomNumber);
            String answer = (prime) ? "yes" : "no";

            questionsAndAnswers[i][0] = question;
            questionsAndAnswers[i][1] = answer;
        }

        // Передаем вопрос игры и массив с вопросами и ответами
        run(messageQuestion, questionsAndAnswers);
    }

    private static boolean isPrime(int number) {
        if (number < 2) {
            return false;
        }

        if (number == 2) {
            return true;
        }

        if (number % 2 == 0) {
            return false;
        }

        /* Для всех нечетных чисел от 3 до квадратного корня из n:
        Проверяем, делится ли n на текущее число.
        Если делится, то число не является простым*
         */
        final int startNumber = 3;
        int limit = (int) Math.sqrt(number);   // Квадратный корень «снизу»
        for (int i = startNumber; i <= limit; i += 2) {
            if (number % i == 0) {          // Если делится – не простое
                return false;
            }
        }

        // Если ни одно условие не выполнено, то число простое
        return true;
    }
}
