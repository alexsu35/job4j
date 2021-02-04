package ru.job4j.condition;

public class MaxMax {

    public int maxMax(int first, int second) {
        return (first > second) ? first : second;

    }

    public int maxMax(int first, int second, int third) {
        return maxMax(first,
                  maxMax(second, third));
    }
    public int maxMax(int first, int second, int third, int fourth) {
        return maxMax(first,
                maxMax(second, third, fourth));
    }
}
