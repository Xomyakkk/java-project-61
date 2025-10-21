package hexlet.code.util;

import static java.util.concurrent.ThreadLocalRandom.current;

public final class Utils {
    private Utils() { }

    // Минимальное и максимальное значение по умолчанию (1..100)
    private static final int DEFAULT_MIN = 1;
    private static final int DEFAULT_MAX = 100;

    public static int generateNumber(int min, int max) {
        return current().nextInt(min, max + 1);
    }

    public static int generateNumber() {
        return generateNumber(DEFAULT_MIN, DEFAULT_MAX);
    }

    public static int generateNumber(int max) {
        return current().nextInt(1, max + 1);
    }

    // Используется для случайного выбора length - 1
    public static int generateIndex(int length) {
        return current().nextInt(length);
    }
}
