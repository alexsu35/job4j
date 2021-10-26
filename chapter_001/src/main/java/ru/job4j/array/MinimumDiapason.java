package ru.job4j.array;

public class MinimumDiapason {
    public static int findMin(int[] array, int start, int finish) {
        int min = array[start];
        for (int i = start + 1; i <= array[finish]; i++) {
            if (array[start + 1] < min) {
                min = array[start + 1];
            }
        }
        return min;
    }
}