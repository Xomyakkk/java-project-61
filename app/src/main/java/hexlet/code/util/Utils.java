package hexlet.code.util;

import static java.util.concurrent.ThreadLocalRandom.current;

public final class Utils {
    private Utils() { }


    public static int generateNumber(int min, int max) {
        return current().nextInt(min, max + 1);
    }

    public static int generateNumber(int max) {
        return current().nextInt(1, max + 1);
    }

    // Используется для случайного выбора length - 1
    public static int generateIndex(int length) {
        return current().nextInt(length);
    }
}
