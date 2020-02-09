package ru.job4j.array;

/**
 * Check.
 * Класс для поиска true или false массивов.
 *
 * @author Aleksandr S. (subbotin0035@yandex.ru)
 * @since 30.01.2020;
 */

public class Check {
    public static boolean mono(boolean[] data) {
        boolean result = false;
        for (int i = 0; i < data.length - 1; i++) {
            if (data[i] != data[i + 1]) {
                break;
            } else {
                result = true;
            }
        }
        return result;
    }
}
