package ru.job4j.array;

/**
 * Matrix.
 * Класс для заполнения двумерного массива методом перемножения строк на столбцы.
 *
 * @author Aleksandr S. (subbotin0035@yandex.ru)
 */

public class Matrix {

    /**
     * Method multiple.
     * Метод должен перемножать соответствующие значения индексов и записывать их
     * в определенную ячейку массива.
     *
     * @param size - размер массива.
     * @return возращает заполненный массив.
     */

    public int[][] multiple(int size) {
        int[][] table = new int[size][size];
        for (int i = 1; i <= size; i++) {
            for (int k = 1; k <= size; k++) {
                table[i - 1][k - 1] = i * k;
                {
        }
        return table;
    }
}
