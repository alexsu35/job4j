package ru.job4j.array;

public class ArrayDefinition {
    public static void main(String[] args) {
        short[] ages = new short[10];
        String[] surnames = new String[100500];
        float[] prices = new float[40];
        String[] names = new String[4];

        names[0] = "Vitaliy Sokolof";
        names[1] = "Sergey Golovach";
        names[2] = "Dmitry Hvatkov";
        names[3] = "Nikita Lomov";

        System.out.println(names[0]);
        System.out.println(names[1]);
        System.out.println(names[2]);
        System.out.println(names[3]);

        System.out.println("Размер массива ages равен: " + ages.length);
        System.out.println("Размер массива ages равен: " + surnames.length);
        System.out.println("Размер массива ages равен: " + prices.length);

    }
}
