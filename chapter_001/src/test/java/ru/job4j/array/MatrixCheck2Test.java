package ru.job4j.array;

import org.junit.Assert;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class MatrixCheck2Test {
    @Test
    public void whenHasMonoHorizontal2() {
        char[][] input = {
                {' ', ' ', ' '},
                {'X', 'X', 'X'},
                {' ', ' ', ' '},
        };
        int row = 1;
        boolean result = MatrixCheck2.monoHorizontal(input, row);
        Assert.assertTrue(result);
    }

    @Test
    public void whenHasMonoHorizontal0() {
        char[][] input = {
                {' ', 'X', 'X'},
                {' ', ' ', ' '},
                {' ', ' ', ' '},
        };
        int row = 0;
        boolean result = MatrixCheck2.monoHorizontal(input, row);
        Assert.assertFalse(result);
    }

    @Test
    public void whenHasMonoHorizontal1() {
        char[][] input = {
                {'X', 'X', 'X'},
                {' ', ' ', ' '},
                {' ', ' ', ' '},
        };
        int row = 0;
        boolean result = MatrixCheck2.monoHorizontal(input, row);
        Assert.assertTrue(result);
    }

    @Test
    public void whenHasMonoHorizontal3() {
        char[][] input = {
                {' ', ' ', ' '},
                {' ', ' ', ' '},
                {'X', 'X', 'X'},
        };
        int row = 2;
        boolean result = MatrixCheck2.monoHorizontal(input, row);
        Assert.assertTrue(result);
    }

    @Test
    public void whenHasMonoVertical2() {
        char[][] input = {
                {' ', ' ', 'X'},
                {' ', ' ', 'X'},
                {' ', ' ', 'X'},
        };
        int column = 2;
        boolean result = MatrixCheck2.monoVertical(input, column);
        Assert.assertTrue(result);
    }

    @Test
    public void whenHasMonoVertical0() {
        char[][] input = {
                {'X', ' ', ' '},
                {'X', ' ', ' '},
                {'X', ' ', ' '},
        };
        int column = 0;
        boolean result = MatrixCheck2.monoVertical(input, column);
        Assert.assertTrue(result);
    }

    @Test
    public void whenHasMonoVertical1() {
        char[][] input = {
                {' ', 'X', ' '},
                {' ', 'X', ' '},
                {' ', 'X', ' '},
        };
        int column = 1;
        boolean result = MatrixCheck2.monoVertical(input, column);
        Assert.assertTrue(result);
    }

    @Test
    public void whenHasMonoVerticalNo() {
        char[][] input = {
                {' ', ' ', 'X'},
                {' ', 'X', ' '},
                {' ', 'X', ' '},
        };
        int column = 1;
        boolean result = MatrixCheck2.monoVertical(input, column);
        Assert.assertFalse(result);
    }

    @Test
    public void whenDiagonalFullX() {
        char[][] input = {
                {'X', ' ', ' '},
                {' ', 'X', ' '},
                {' ', ' ', 'X'},
        };
        char[] result = MatrixCheck2.extractDiagonal(input);
        char[] expected = {'X', 'X', 'X'};
        Assert.assertArrayEquals(expected, result);
    }

    @Test
    public void whenDiagonalFullOne() {
        char[][] input = {
                {'1', ' ', ' '},
                {' ', '1', ' '},
                {' ', ' ', '1'},
        };
        char[] result = MatrixCheck2.extractDiagonal(input);
        char[] expected = {'1', '1', '1'};
        Assert.assertArrayEquals(expected, result);
    }

    @Test
    public void whenDiagonalMix() {
        char[][] input = {
                {'X', ' ', ' '},
                {' ', 'Y', ' '},
                {' ', ' ', 'Z'},
        };
        char[] result = MatrixCheck2.extractDiagonal(input);
        char[] expected = {'X', 'Y', 'Z'};
        Assert.assertArrayEquals(expected, result);
    }
}