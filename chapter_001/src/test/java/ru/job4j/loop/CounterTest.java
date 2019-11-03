package ru.job4j.loop;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class CounterTest {
    @Test
    public void whenSumEvenNumbersFromOneToTenThenThirty() {
        Counter loop = new Counter();
        int expected = 30;
        int result = loop.add(1, 10);
        assertThat(result, is(expected));
    }
}