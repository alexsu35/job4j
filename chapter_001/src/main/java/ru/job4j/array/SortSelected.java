package ru.job4j.array;

public class SortSelected {
    public static int[] sort(int[] data) {
        int min, temp;
        for (int i = 0; i < data.length; i++) {
            min = i;
            for (int scan = i + 1; scan < data.length; scan++) {
                if (data[scan] < data[min]) {
                    min = scan;
                }
            }
                temp = data[min];
                data[min] = data[i];
                data[i] = temp;
        }
        return data;
    }
}
