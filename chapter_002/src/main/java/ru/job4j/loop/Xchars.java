package ru.job4j.loop;

import java.util.*;

public class Xchars {
    public static void main(String[] args) {
        System.out.println(drawCross(15));
    }

    public static String drawCross(int size) {
        StringBuilder sb = new StringBuilder();
        int gap = size;
        for (int j = 0; j < size; j++) {
            for (int i = 0; i < size; i++) {
                if (i == size - gap || i == gap - 1 || i == 0
                        || j == 0 || i == size - 1 || j == size - 1) {
                    sb.append('*');
                } else {
                    sb.append(' ');
                }
            }
            sb.append('\n');
            gap--;
        }
        return sb.toString();
    }
}
