package ru.job4j.array;

import org.junit.Assert;
import org.junit.Test;

public class MinimumTest {
    @Test
    public void whenFirstMin() {
        int[] array = new int[] {0, 5, 10};
        int result = Minimum.findMin(array);
        int expected = 0;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenLastMin() {
        int[] array = new int[] {10, 5, 3};
        int result = Minimum.findMin(array);
        int expected = 3;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenMiddleMin() {
        int[] array = new int[] {10, 2, 5};
        int result = Minimum.findMin(array);
        int expected = 2;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenMiddleMin2() {
        int[] array = new int[] {10, 2, 24, 3, 1, 34, -3, 55, -18, 5};
        int result = Minimum.findMin(array);
        int expected = -18;
        Assert.assertEquals(expected, result);
    }
}

