package ru.job4j.condition;

public class Triangle {

    public static boolean exist(double ab, double ac, double bc) {
        if ((ab+ac >= bc) && (ab+bc >= ac) && (bc+ac >= ab)) {
            System.out.println("Треугольник существует");
        } else {
            System.out.println("Треугольник не существует");
        }
        return true;
    }
}