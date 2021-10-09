package ru.job4j.array;

/**
 * Class Square
 * Класс для заполнения массива
 *
 * @author Aleksandr S.
 * @version 1
 * @since 09.10.2021
 */

public class Squarenew {
    /**
     * Возведение в квадрат
     *
     * @param bound - количество чисел в массиве.
     * @return Массив вычисленных значений.
     */
    public static int[] calculate(int bound) {
        int[] rst = new int[bound];
        int index = 0;
        for (int i = 1; i <= bound; i++) {
            rst[index++] = i * i;
        }
        return rst;
    }

    public static void main(String[] args) {
        /**
         * Вывод значений индексов массива в консоль
         */
        int[] array = calculate(5);
        for (int index : array) {
            System.out.println(index);
        }
    }
}