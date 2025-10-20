package hexlet.code.games;

import hexlet.code.Engine;

import static hexlet.code.Engine.COUNT_QUESTION;
import static hexlet.code.Engine.checkingAnswers;
import static hexlet.code.util.Utils.generateNumber;

public class Calc {
    public static void calc() {
        final String messageQuestion = "What is the result of the expression?";

        Engine.greet(messageQuestion);

        // Генератор вопросов и ответов

        String[][] questionsAndAnswers = new String[COUNT_QUESTION][2];

        for (int i = 0; i < COUNT_QUESTION; i++) {
            int a = generateNumber();
            int b = generateNumber();

            int c = generateNumber(1, 3);

            switch (c) {
                case 1:
                    questionsAndAnswers[i][0] = a + " + " + b;
                    questionsAndAnswers[i][1] = Integer.toString(a + b);
                    break;
                case 2:
                    questionsAndAnswers[i][0] = a + " - " + b;
                    questionsAndAnswers[i][1] = Integer.toString(a - b);
                    break;
                case 3:
                    questionsAndAnswers[i][0] = a + " * " + b;
                    questionsAndAnswers[i][1] = Integer.toString(a * b);
                    break;
                default:
                    break;
            }
        }

        // Передаем массив с готовыми вопросами и ответами
        checkingAnswers(questionsAndAnswers);
    }
}
