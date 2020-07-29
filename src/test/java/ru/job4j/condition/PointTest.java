package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class PointTest {

    @Test
    public void distance1() {
        double result1 = 2;
        double out = Point.distance(0, 0, 2, 0);
        Assert.assertEquals(result1, out, 001);
    }

    @Test
    public void distance2() {
        double result2 = 3;
        double out = Point.distance(5, 1, 2, 1);
        Assert.assertEquals(result2, out, 001);
    }
}
