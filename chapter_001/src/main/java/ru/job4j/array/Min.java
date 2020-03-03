package ru.job4j.array;

public class Min {
    public static int findsMin(int[] data) {
        int min = data[0];
        int minIndex = 0;
        for (int index = 1; index < data.length; index++) {
            // проверить, что эталон больше, чем элемент. записать в эталон элемент массива.
            if (data[index] < min) {
                min = data[index];
                minIndex = index;
            }
        }
        return min;
    }
}
