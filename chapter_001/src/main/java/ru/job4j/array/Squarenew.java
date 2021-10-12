package ru.job4j.array;

public class Squarenew {

    public static int[] calculate(int bound) {
        int[] rst = new int[bound];
        int index = 0;
        for (int i = 1; i <= bound; i++) {
            rst[index++] = i * i;
        }
        return rst;
    }

    public static void main(String[] args) {
        int[] array = calculate(5);
        for (int index : array) {
            System.out.println(index);
        }
    }
}