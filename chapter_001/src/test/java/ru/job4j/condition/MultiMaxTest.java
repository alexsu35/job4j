package ru.job4j.condition;

import org.junit.Test;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class MultiMaxTest {
    @Test
    public void whenMax() {
        MultiMax check = new MultiMax();
        int result = check.max(15, 15, 15);
        assertThat(result, is(15));
    }

    @Test
    public void whenFirstMax2() {
        MultiMax check = new MultiMax();
        int result = check.max(11, 2, 3);
        assertThat(result, is(11));
    }

    @Test
    public void whenSecondMax3() {
        MultiMax check = new MultiMax();
        int result = check.max(2, 14, 5);
        assertThat(result, is(14));
    }

    @Test
    public void whenThirdMax4() {
        MultiMax check = new MultiMax();
        int result = check.max(3, 4, 44);
        assertThat(result, is(44));
    }
}