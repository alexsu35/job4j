package ru.job4j.array;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class SortSelected_2Test {
    @Test
    public void whenSort() {
        int[] input = new int[] {3, 4, 1, 2, 5};
        int[] result = SortSelected.sort(input);
        int[] expect = new int[] {1, 2, 3, 4, 5};
        assertThat(result, is(expect));
    }

    @Test
    public void whenSort2() {
        int[] input = new int[] {4, 6, 9, 2, 11};
        int[] result = SortSelected.sort(input);
        int[] expect = new int[] {2, 4, 6, 9, 11};
        assertThat(result, is(expect));
    }

    @Test
    public void whenSort3() {
        int[] input = new int[] {-44, 6, 255, 33, -13, -1, 170};
        int[] result = SortSelected.sort(input);
        int[] expect = new int[] {-44, -13, -1, 6, 33, 170, 255};
        assertThat(result, is(expect));
    }
}