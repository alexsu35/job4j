package ru.job4j.condition;

import org.junit.Test;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class SqMaxTest {
    @Test
    public void whenMax() {
        SqMax check = new SqMax();
        int result = check.max(33, 5, 3, 4);
        assertThat(result, is(33));
    }
}
