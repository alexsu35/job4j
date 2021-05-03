package ru.job4j.pojo;

import javax.crypto.spec.PSource;

public class Library {
    public static void main(String[] args) {
        System.out.println();
        System.out.println("Список всех книг в массиве");
        System.out.println("---------------------------");
        Book book = new Book("Основы программирования", 419);
        Book book1 = new Book("Пиши,сокращай.", 440);
        Book book2 = new Book("Совершенный код", 914);
        Book book3 = new Book("Clean code", 464);
        Book[] liter = new Book[4];
        liter[0] = book;
        liter[1] = book1;
        liter[2] = book2;
        liter[3] = book3;
        for (int index = 0; index < liter.length; index++) {
            Book da = liter[index];
            System.out.println(da.getName() + " - " + da.getPages() + " стр.");
        }
        System.out.println();
        System.out.println("Меняем местами индекс 0 и 3");
        System.out.println("---------------------------");
        Book temp = liter[0];
        liter[0] = liter[3];
        liter[3] = temp;
        for (int index = 0; index < liter.length; index++) {
            Book da = liter[index];
            System.out.println(da.getName() + " - " + da.getPages() + " стр.");
        }
        System.out.println();
        System.out.println("Выводим только книги с именем \"Clean code\"");
        System.out.println("---------------------------");
        for (int index = 0; index < liter.length; index++) {
            Book da = liter[index];
            if (da.getName().equals("Clean code")) {
                System.out.println(da.getName() + " - " + da.getPages() + " стр.");
            }
        }
    }
}
