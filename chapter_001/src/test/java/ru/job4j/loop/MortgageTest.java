package ru.job4j.loop;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class MortgageTest {
    @Test
    public void when4Year() {
        Mortgage mortgage = new Mortgage();
        int year = mortgage.year(1000, 500, 30);
        assertThat(year, is(4));
    }

    @Test
    public void when2Year() {
        Mortgage mortgage = new Mortgage();
        int year = mortgage.year(100, 120, 50);
        assertThat(year, is(2));
    }

    @Test
    public void when7Year() {
        Mortgage mortgage = new Mortgage();
        int year = mortgage.year(100, 30, 20);
        assertThat(year, is(7));
    }
}