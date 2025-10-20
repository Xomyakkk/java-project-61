package hexlet.code.util;

import static java.util.concurrent.ThreadLocalRandom.current;

public final class Utils {
    private Utils() { }

    // Минимальное и максимальное значение по умолчанию (1..100)
    public static final int DEFAULT_MIN = 1;
    public static final int DEFAULT_MAX = 100;

    public static int generateNumber(int min, int max) {
        return current().nextInt(min, max + 1);
    }

    public static int generateNumber() {
        return generateNumber(DEFAULT_MIN, DEFAULT_MAX);
    }

    public static int generateNumber(int max) {
        return current().nextInt(0, max + 1);
    }
}
