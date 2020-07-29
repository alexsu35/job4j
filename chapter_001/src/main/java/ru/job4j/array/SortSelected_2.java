package ru.job4j.array;

/**
 * SortSelected.
 * Класс для сортировки массива методом выборки.
 *
 * @author Aleksandr S. (subbotin0035@yandex.ru)
 */

public class SortSelected_2 {

    /**
     * Method sort.
     * Метод должен на основе методов поиска минимального числа и его индекса,
     * отсортировать массив по возрастанию значений.
     *
     * @param data - массив.
     * @return возращает отсортированный массив.
     */

    public static int[] sort(int[] data) {
        int temp;

        for (int i = 0; i < data.length; i++) {
            int min = MinDiapason.findMin(data, i, data.length);
            int index = FindLoopRange.indexOf(data, min, i, data.length);
            if (data[i] > min) {
                data[i] = min;
            }
            temp = data[min];
            data[min] = data[i];
            data[i] = temp;
        }
        return data;
    }
}
