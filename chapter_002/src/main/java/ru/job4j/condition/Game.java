package ru.job4j.condition;

/**
 * Class Game
 * @author Alex Su.
 * @since 05.08.2021
 * @version 1
 */

public class Game {
    public static void menu(String name) {
        if (name.equals("super mario")) {
            System.out.println("Start - super mario");
        }
        if (name.equals("tanks")) {
            System.out.println("Start - tanks");
        }
        if (name.equals("tetris")) {
            System.out.println("Start - tetris");
        }
    }

    public static void main(String[] args) {
        Game.menu("tanks");
    }
}
