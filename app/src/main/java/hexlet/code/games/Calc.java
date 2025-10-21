package hexlet.code.games;

import hexlet.code.Engine;

import static hexlet.code.Engine.COUNT_QUESTION;
import static hexlet.code.Engine.checkingAnswers;
import static hexlet.code.util.Utils.generateNumber;

public final class Calc {
    private Calc() { }

    public static void calc() {
        final String messageQuestion = "What is the result of the expression?";

        Engine.greet(messageQuestion);

        // Генератор вопросов и ответов

        String[][] questionsAndAnswers = new String[COUNT_QUESTION][2];

        for (int i = 0; i < COUNT_QUESTION; i++) {
            int a = generateNumber();
            int b = generateNumber();

            int c = generateNumber(1, 3);

            generateQuestion(a, b, c, questionsAndAnswers[i]);
        }

        // Передаем массив с готовыми вопросами и ответами
        checkingAnswers(questionsAndAnswers);
    }

    private static void generateQuestion(int a, int b, int c, String[] questionsAndAnswers) {
        switch (c) {
            case 1:
                questionsAndAnswers[0] = a + " + " + b;
                questionsAndAnswers[1] = Integer.toString(a + b);
                break;
            case 2:
                questionsAndAnswers[0] = a + " - " + b;
                questionsAndAnswers[1] = Integer.toString(a - b);
                break;
            case 3:
                questionsAndAnswers[0] = a + " * " + b;
                questionsAndAnswers[1] = Integer.toString(a * b);
                break;
            default:
                break;
        }
    }
}
