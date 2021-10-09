package ru.job4j.array;

public class ArrayLoop {
    public static void main(String[] args) {
        int[] funk = new int[5];
        for (int index = 0; index < funk.length; index++) {
            funk[index] = index * 2 + 3;
        }
        for (int index : funk) {
            System.out.println(index);
        }
    }

}
