package ru.job4j.array;

/**
 * Class Square
 * Класс для заполнения массива
 *
 * @author Aleksandr S.
 * @version 1
 * @since 26.01.2020
 */
public class Square {
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
        int[] array = calculate(4);
        for (int index = 0; index < array.length; index++) {
            System.out.println(array[index]);
        }
    }
}
