package ru.job4j.loop;

public class Mortgage {

    public int year(int amount, int salary, double percent) {
        int year = 1;
        double balance = (amount + amount * percent / 100) - salary;
        do {
            balance = (balance + balance * percent / 100) - salary;
            year++;
        } while (balance > 0);
        return year;
    }
}