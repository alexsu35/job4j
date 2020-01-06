package ru.job4j.Calculator;

/**
 * Class Calculate
 * Класс для вычисления арифметических операций + - * /
 * @author Alex Su.
 * @since 27.12.2019
 * @version 1
 */

/**
 * Сложение
 * @param first первый аргумент
 * @param second второй аргумент
 */

public class Calculator {
    public static void add(double first, double second) {
        double result = first + second;
        System.out.println(first + "+" + second + "=" + result);
    }

    /**
     * Деление
     * @param first первый аргумент
     * @param second второй аргумент
     */

    public static void div(double first, double second) {
        double result = first / second;
        System.out.println(first + "/" + second + "=" + result);
    }

    /**
     * Произведение
     * @param first первый аргумент
     * @param second второй аргумент
     */

    public static void multiply(double first, double second) {
        double result = first * second;
        System.out.println(first + "*" + second + "=" + result);
    }

    /**
     * Вычитание
     * @param first первый аргумент
     * @param second второй аргумент
     */

    public static void subtruck(double first, double second) {
        double result = first - second;
        System.out.println(first + "-" + second + "=" + result);
    }

        public static void main(String[] args) {
        add(1, 1);
        div(4, 2);
        multiply(2, 1);
        subtruck(10, 5);

    }
}
