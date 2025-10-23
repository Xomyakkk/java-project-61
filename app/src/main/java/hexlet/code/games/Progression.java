package hexlet.code.games;

import hexlet.code.Engine;

import static hexlet.code.Engine.COUNT_QUESTION;
import static hexlet.code.Engine.checkingAnswers;
import static hexlet.code.util.Utils.generateIndex;
import static hexlet.code.util.Utils.generateNumber;

public final class Progression {
    private Progression() { }

    public static void progression() {
        final int startMin   = 1;
        final int startMax   = 50;

        final int stepMin    = 1;
        final int stepMax    = 10;

        final int lengthMin  = 6;
        final int lengthMax  = 10;
        final String messageQuestion = "What number is missing in the progression?";

        String userName = Engine.greet(messageQuestion);

        // Генератор вопросов и ответов

        String[][] questionsAndAnswers = new String[COUNT_QUESTION][2];

        for (int i = 0; i < COUNT_QUESTION; i++) {
            int start = generateNumber(startMin,  startMax);
            int step = generateNumber(stepMin,  stepMax);
            int length = generateNumber(lengthMin,  lengthMax);

            // Случайно выбираем позицию спрятанного элемента
            int removeIndex = generateIndex(length);

            String[] progression = getProgression(start, length, step); // Получаем прогрессию
            questionsAndAnswers[i][1] = progression[removeIndex]; // Выбираем элемент в качестве ответа

            progression[removeIndex] = ".."; // Прячем элемент

            questionsAndAnswers[i][0] = String.join(" ", progression); // Преобразовываем массив в строку с вопросом
        }

        // Передаем массив с готовыми вопросами и ответами
        checkingAnswers(userName, questionsAndAnswers);
    }

    private static String[] getProgression(int start, int length, int step) {
        String[] result = new String[length];
        for (int i = 0; i < length; i++) {
            result[i] = String.valueOf(start + i * step);
        }
        return result;
    }
}
