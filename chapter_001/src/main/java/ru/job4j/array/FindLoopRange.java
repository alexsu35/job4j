package ru.job4j.array;

/**
 * FindLoopRange.
 * Класс для поиска элемента в массиве в определенном диапазоне.
 *
 * @author Aleksandr S. (subbotin0035@yandex.ru)
 */
public class FindLoopRange {
    /**
     * Method indexOf.
     * Метод должен вернуть индекс элемента массива равного искомому значению.
     *
     * @param data - массив.
     * @param el - искомое значение.
     * @return индекс элемента массива равного искомому значению.
     */

            public static int indexOf(int[] data, int el) {
                int rst = -1;

                for (int index = 0; index < data.length; index++) {
                    if (data[index] == el) {
                        rst = index;
                        break;
                    }
                }
                return rst;
            }

    /**
     * Method indexOf.
     * Метод должен вернуть индекс элемента массива равного искомому значению в диапазоне.
     * @param data - массив.
     * @param el - искомое значение.
     * @param start - индекс с которого начинаем поиск.
     * @param finish - индекс, которым заканчиваем поиск.
     * @return индекс элемента массива равного искомому значению.
     */
        public static int indexOf(int[] data, int el, int start, int finish) {
            int rst = -1;

            for (int index = start; index <= finish; index++) {
                if (data[index] == el) {
                    rst = index;
                    break;
                }
            }
            return rst;
        }
}

