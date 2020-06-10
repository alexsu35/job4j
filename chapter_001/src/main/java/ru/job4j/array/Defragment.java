package ru.job4j.array;

/**
 * Defragment.
 * Класс перемещает заполненные ячейки в начало, а пустые в конец.
 * @author Aleksandr S. (subbotin0035@yandex.ru)
 */

public class Defragment {
    /**
     *
     * @param array массив строк
     * @return входящий массив с заполненными ячейками вначале и пустыми в конце
     */
    public static String[] compress(String[] array) {
        String tmp;
        for (int index = 0; index < array.length; index++) {
            if (array[index] == null) {
                int point = 1; /* указатель на null ячейку. */
                /* переместить первую не null ячейку. Нужен цикл. */
                while (array[index] == null) {
                    tmp = array[index];
                    if (index + point >= array.length) {
                        break;
                    }
                    array[index] = array[index + point];
                    array[index + point] = tmp;
                    point++;
                }
            }
            System.out.print(array[index] + " ");
        }
        return array;
    }

    public static void main(String[] args) {
        String[] input = {"I", null, "wanna", null, "be", null, "compressed"};
        String[] compressed = compress(input);
        System.out.println();
        for (int index = 0; index < compressed.length; index++) {
            System.out.print(compressed[index] + " ");
        }
    }
}