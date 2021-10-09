package ru.job4j.array;

import org.junit.Assert;
import org.junit.Test;

public class SquarenewTest {
    @Test
    public void whenBound3Then114() {
        int bound = 3;
        int[] result = Squarenew.calculate(bound);
        int[] expected = new int[] {1, 4, 9};
        Assert.assertArrayEquals(expected, result);
    }

    @Test
    public void whenBound5Then114() {
        int bound = 5;
        int[] result = Squarenew.calculate(bound);
        int[] expected = new int[] {1, 4, 9, 16, 25};
        Assert.assertArrayEquals(expected, result);
    }
}

