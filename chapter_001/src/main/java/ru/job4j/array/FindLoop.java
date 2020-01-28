package ru.job4j.array;
/**
 * FindLoop.
 * Класс для поиска элемента в массиве.
 *
 * @author Aleksandr S. (subbotin0035@yandex.ru)
 * @since 27.01.2020;
 */
public class FindLoop {
    /**
     * Method indexOf.
     * Метод должен вернуть индекс элемента массива равного искомому значению.
     *
     * @param data - массив.
     * @param el - искомое значение.
     * @return индекс элемента массива равного искомому значению.
     */
    public static int indexOf(int[] data, int el) {
        int rst = -1; // если элемента нет в массиве, то возвращаем -1.

        for ( int index = 0; index < data.length; index++) {
            if (data[index] == el) {
                rst = index;
                break;
            }
        }
        return rst;
    }
}
