package ru.job4j.loop;

public class CheckPrimeNumber {
    public boolean check(int finish) {
        boolean prime = true;
        if (finish <= 1 || finish != 2 && finish % 2 == 0) {
            prime = false;
        } else {
            for (int i = 2; i < finish; i++) {
                if (finish % i == 0)
                    prime = false;
            }

        }
        return prime;
    }
}
