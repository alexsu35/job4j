package ru.job4j.array;

/**
 * Min.
 * Класс для поиска минимального числа в масссиве.
 *
 * @author Aleksandr S. (subbotin0035@yandex.ru)
 */

public class Min {

    /**
     * Method findsMin.
     * Метод должен вернуть минимальное число в маасиве.
     *
     * @param data - массив.
     * @return минимальный элемент в массиве.
     */

    public static int findsMin(int[] data) {
        int min = data[0];
        int minIndex = 0;
        for (int index = 1; index < data.length; index++) {
            if (data[index] < min) {
                min = data[index];
                minIndex = index;
            }
        }
        return min;
    }
}
