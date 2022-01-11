package ru.job4j.loop;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class FactorialTest {
    @Test
    public void whenCalculateFactorialForFiveThenOneHundreedTwenty() {
        Factorial loop = new Factorial();
        int expected = 120;
        int result = loop.calc(5);
        assertThat(result, is(expected));
    }

    @Test
    public void whenCalculateFactorialForZeroThenOne() {
        Factorial loop = new Factorial();
        int expected = 1;
        int result = loop.calc(0);
        assertThat(result, is(expected));
    }
}