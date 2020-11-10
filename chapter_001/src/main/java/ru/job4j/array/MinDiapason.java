package ru.job4j.array;

/**
 * Method MinDiapason.
 * Метод должен вернуть минимальное число из определенного диапахона в маасиве.
 *
 * @param data - массив.
 * @param start - начальное значение диапазона.
 * @param finish - онечное значение диапазона.
 * @return минимальный элемент в массиве.
 */

public class MinDiapason {
    public static int findMin(int[] data, int start, int finish) {
        int min = data[start];
            for (int i = start; i <= finish; i++) {
                if (data[i] < min) {
                min = data[i];
                }
            }
            return min;
    }
}

