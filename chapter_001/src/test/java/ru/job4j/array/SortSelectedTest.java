package ru.job4j.array;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class SortSelectedTest {
    @Test
    public void whenSort() {
        int[] input = new int[] {3, 4, 1, 2, 5};
        int[] result = SortSelected.sort(input);
        int[] expect = new int[] {1, 2, 3, 4, 5};
        assertThat(result, is(expect));
    }

    @Test
    public void whenSort3() {
        int[] input = new int[] {9, 1, 4};
        int[] result = SortSelected.sort(input);
        int[] expect = new int[] {1, 4, 9};
        assertThat(result, is(expect));
    }

    @Test
    public void whenSort10() {
        int[] input = new int[] {11, 5, 3, 8, 8, 6, 2, 1, 1, 7};
        int[] result = SortSelected.sort(input);
        int[] expect = new int[] {1, 1, 2, 3, 5, 6, 7, 8, 8, 11};
        assertThat(result, is(expect));
    }
}