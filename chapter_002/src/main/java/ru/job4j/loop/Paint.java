package ru.job4j.loop;

public class Paint {
    public static void main(String[] arg) {
        int count = 10;

        // Внешний цикл
        for (int i = 0; i < count; i++) {
            for (int k = 0; k < count; k++) {
                // Вот наше сложное условие
                if (k == 0 || k == count - 1 || i == 0 || i == count - 1 || k == i) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

    }
}
