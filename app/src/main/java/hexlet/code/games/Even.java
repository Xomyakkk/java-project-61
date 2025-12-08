package hexlet.code.games;

import hexlet.code.Engine;

import static hexlet.code.Engine.COUNT_QUESTION;
import static hexlet.code.Engine.checkingAnswers;
import static hexlet.code.util.Utils.generateNumber;

public final class Even {
    // Константы класса Минимальное и Максимальное значение
    private static final int MIN_NUMBER = 1;
    private static final int MAX_NUMBER = 100;
    private Even() { }

    public static void even() {
        final String messageQuestion = "Answer 'yes' if the number is even, otherwise answer 'no'.";
        Engine.greet(messageQuestion);

        // Генератор вопросов и ответов

        String[][] questionsAndAnswers = new String[COUNT_QUESTION][2];

        for (int i = 0; i < COUNT_QUESTION; i++) {
            int randomNumber = generateNumber(MIN_NUMBER, MAX_NUMBER);

            String even = (randomNumber % 2 == 0) ? "yes" : "no";
            String question = Integer.toString(randomNumber);

            questionsAndAnswers[i][0] = question;
            questionsAndAnswers[i][1] = even;
        }

        // Передаем массив с готовыми вопросами и ответами
        checkingAnswers(questionsAndAnswers);
    }
}
