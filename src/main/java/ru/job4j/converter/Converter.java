package ru.job4j.converter;

public class Converter {
    public static int rubleToEuro(int value) {
        return value / 70;
    }

    public static int euroToruble(int value) {
        return value * 70;
    }

    public static int rubleToDollar(int value) {

        return value / 60;
    }

    public static int dollarToruble(int value) {

        return value * 60;
    }

    public static void main(String[] args) {
        int euro = rubleToEuro(140);
        int dollar = rubleToDollar(120);
        int ruble1 = euroToruble(3);
        int ruble2 = dollarToruble(5);

        System.out.println("140 rubles are " + euro + " euro.");
        System.out.println("120 rubles are " + dollar + " dollar.");
        System.out.println("3 euro are " + ruble1 + " ruble.");
        System.out.println("5 dollar are " + ruble2 + " ruble.");
        System.out.println();

        int in = 140;
        int expected = 2;
        int out = rubleToEuro(in);
        boolean passed = expected == out;
        System.out.println("140 rubles are 2. Test result : " + passed);

        int in2 = 120;
        int expected2 = 2;
        int out2 = rubleToDollar(in2);
        boolean passed2 = expected2 == out2;
        System.out.println("120 rubles are 2. Test result : " + passed2);

        int in3 = 3;
        int expected3 = 210;
     //   int out3 = EuroToruble(in3);
     //   boolean passed3 = expected3 == out3;
     //   System.out.println("3 euro are 210. Test result : " + passed3);

        int in4 = 5;
        int expected4 = 300;
    //    int out4 = DollarToruble(in4);
    //    boolean passed4 = expected4 == out4;
    //    System.out.println("5 dollar are 300. Test result : " + passed4);
    }
}
