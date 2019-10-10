package ru.job4j.Calculator;

public class Fit {
    public static double manWeight(double height) {
        return ((height - 100) * 1.15); // формула идеального веса для мужчин
                                        // height - рост
    }

    public static double womanWeight(double height) {
        return ((height - 110) * 1.15); // формула идеального веса для женщин
    }

    public static void main(String[] args) {
        double man = manWeight(175);
        System.out.println("Man 175 sm is " + man + "kg");
        double woman = womanWeight(155);
        System.out.println("Woman 155 sm is " + woman + "kg");
    }

}
