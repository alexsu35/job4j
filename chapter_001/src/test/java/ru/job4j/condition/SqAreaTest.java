package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class SqAreaTest {

    @Test
    public void square1 () {
        double s = 2;
        double out = SqArea.square(4,1);
        Assert.assertEquals(s, out, 001);
    }

    @Test
    public void square2 () {
        double s = 2;
        double out = SqArea.square(6,2);
        Assert.assertEquals(s, out, 001);
    }
}
