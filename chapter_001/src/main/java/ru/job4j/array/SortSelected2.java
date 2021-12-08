package ru.job4j.array;

public class SortSelected2 {

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
