package hexlet.code.games;

import static hexlet.code.Engine.COUNT_QUESTION;
import static hexlet.code.Engine.run;
import static hexlet.code.util.Utils.generateIndex;
import static hexlet.code.util.Utils.generateNumber;

public final class Calc {
    // Константы класса Минимальное и Максимальное значение
    private static final int MIN_NUMBER = 1;
    private static final int MAX_NUMBER = 100;
    private Calc() { }

    public static void calc() {
        final String[] expressions = {"+", "-", "*"};
        final String messageQuestion = "What is the result of the expression?";

        // Генератор вопросов и ответов
        String[][] questionsAndAnswers = new String[COUNT_QUESTION][2];

        for (int i = 0; i < COUNT_QUESTION; i++) {
            int a = generateNumber(MIN_NUMBER, MAX_NUMBER);
            int b = generateNumber(MIN_NUMBER, MAX_NUMBER);
            String option = expressions[generateIndex(expressions.length)];

            // Строка вопрос
            questionsAndAnswers[i][0] = a + " " + option + " " + b;
            // Вычисляем результат и передаем в качестве ответа в виде строки
            questionsAndAnswers[i][1] = Integer.toString(calculate(a, b, option));
        }

        // Передаем вопрос игры и массив с вопросами и ответами
        run(messageQuestion, questionsAndAnswers);
    }

    private static int calculate(int a, int b, String option) {
        switch (option) {
            case "+": return a + b;
            case "-": return a - b;
            case "*": return a * b;
            default:
                throw new IllegalArgumentException("Unsupported operator: " + option);
        }
    }
}
