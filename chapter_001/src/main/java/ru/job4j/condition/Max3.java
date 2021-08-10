package ru.job4j.condition;

public class Max3 {
    public static void main(String[] args) {
        int a = 5;
        int b = 9;
        int c = 1;
        int max = c;
        if (a > max) {
            max = a;
        }
        if (b > max) {
            max = b;
        }
        System.out.println(max);
    }
}
