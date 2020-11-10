package ru.job4j.array;

/**
 * BarleyBreak.
 * Класс для заполнения двумерного массива.
 *
 * @author Aleksandr S. (subbotin0035@yandex.ru)
 */

public class BarleyBreak {

    /**
     * Method main.
     * Метод заполняет массив значениями и выводит в консоль
     */

    public static void main(String[] args) {
        int[][] arr = new int[3][3];
        int count = 1;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                arr[i][j] = count++;
            }
        }
        for (int[] anArr : arr) {
            for (int anAnArr : anArr) {
                System.out.print(anAnArr + " ");
            }
            System.out.println();
        }
    }
}
