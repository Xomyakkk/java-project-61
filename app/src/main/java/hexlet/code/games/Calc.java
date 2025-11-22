package hexlet.code.games;

import hexlet.code.Engine;

import static hexlet.code.Engine.COUNT_QUESTION;
import static hexlet.code.Engine.checkingAnswers;
import static hexlet.code.util.Utils.generateIndex;
import static hexlet.code.util.Utils.generateNumber;

public final class Calc {
    private Calc() { }

    public static void calc() {
        final int MIN_NUMBER = 1;
        final int MAX_NUMBER = 100;
        final String[] expressions = {"+", "-", "*"};
        final String messageQuestion = "What is the result of the expression?";
        String userName = Engine.greet(messageQuestion);

        // Генератор вопросов и ответов
        String[][] questionsAndAnswers = new String[COUNT_QUESTION][2];

        for (int i = 0; i < COUNT_QUESTION; i++) {
            int a = generateNumber(MIN_NUMBER, MAX_NUMBER);
            int b = generateNumber(MIN_NUMBER, MAX_NUMBER);
            String option = expressions[generateIndex(expressions.length)];

            // Строка вопрос
            questionsAndAnswers[i][0] = createQuestion(a, b, option);
            // Вычисляем результат и передаем в качестве ответа в виде строки
            questionsAndAnswers[i][1] = Integer.toString(calculate(a, b, option));
        }

        // Передаем массив с готовыми вопросами и ответами
        checkingAnswers(userName, questionsAndAnswers);
    }

    private static String createQuestion(int a, int b, String option) {
        return a + " " + option + " " + b;
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
