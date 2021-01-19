package ru.job4j.oop;

public class DummyDic {
    public String engToRus(String eng) {
        return "Неизвестное слово " + eng;

    }

    public static void main(String[] args) {
        DummyDic vokabulary = new DummyDic();
        String say = vokabulary.engToRus("exit");
        System.out.println(say);
    }
}
