package hexlet.code.games;

import hexlet.code.Engine;

import java.util.concurrent.ThreadLocalRandom;

import static hexlet.code.Engine.COUNT_QUESTION;
import static hexlet.code.Engine.checkingAnswers;
import static hexlet.code.util.Utils.generateNumber;

public class Progression {
    public static void progression() {
        final int START_MIN   = 1;
        final int START_MAX   = 50;

        final int STEP_MIN    = 1;
        final int STEP_MAX    = 10;

        final int LENGTH_MIN  = 6;
        final int LENGTH_MAX  = 10;
        final String messageQuestion = "What number is missing in the progression?";

        Engine.greet(messageQuestion);

        // Генератор вопросов и ответов

        String[][] questionsAndAnswers = new String[COUNT_QUESTION][2];

        for (int i = 0; i < COUNT_QUESTION; i++) {
            int start = generateNumber(START_MIN,  START_MAX);
            int step = generateNumber(STEP_MIN,  STEP_MAX);
            int length = generateNumber(LENGTH_MIN,  LENGTH_MAX);

            // Случайно выбираем позицию спрятанного элемента
            int removeIndex = generateNumber(length);

            String[] progression = getProgression(start, length, step); // Получаем прогрессию
            questionsAndAnswers[i][1] = progression[removeIndex]; // Выбираем элемент в качестве ответа

            progression[removeIndex] = ".."; // Прячем элемент

            questionsAndAnswers[i][0] = String.join(" ", progression); // Преобразовываем массив в строку с вопросом
        }

        // Передаем массив с готовыми вопросами и ответами
        checkingAnswers(questionsAndAnswers);
    }

    private static String[] getProgression(int start, int length, int step) {
        String[] result = new String[length];
        for (int i = 0; i < length; i++) {
            result[i] = String.valueOf(start + i * step);
        }
        return result;
    }
}
