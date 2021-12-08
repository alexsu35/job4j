package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class MaxMaxTest {

    @Test
    public void maxThree() {
        Max test = new Max();
        int exp = 15;
        int out =  test.max(3, 15, 6);
        Assert.assertEquals(exp, out);
    }

    @Test
    public void maxFour() {
        Max test = new Max();
        int exp = 9;
        int out =  test.max(4, 2, 9, 7);
        Assert.assertEquals(exp, out);
    }

}