package hexlet.code;

import java.util.concurrent.ThreadLocalRandom;

import static hexlet.code.Engine.COUNT_QUESTION;
import static hexlet.code.Engine.checkingAnswers;

public class Progression {
    public static void progression() {
        Engine.greet();

        System.out.println("What number is missing in the progression?");

        // Генератор вопросов и ответов

        String[][] questionsAndAnswers = new String[COUNT_QUESTION][2];

        for (int i = 0; i < COUNT_QUESTION; i++) {
            int start = ThreadLocalRandom.current().nextInt(1, 50);
            int step = ThreadLocalRandom.current().nextInt(1, 10);
            int length = ThreadLocalRandom.current().nextInt(6, 10);
            int removeIndex =  ThreadLocalRandom.current().nextInt(length); // Случайно выбираем позицию спрятанного элемента

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
