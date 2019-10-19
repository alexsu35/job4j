package ru.job4j.condition;
import org.junit.Test;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class SqMaxTest  {

    @Test
    public void whenFirstMax() {
        SqMax check = new SqMax();
        int expected = 44;
        int max = check.max(44, 5, 5, 4);
        assertThat(max, is(expected));
    }

    @Test
    public void whenSecondMax() {
        SqMax check = new SqMax();
        int expected = 44;
        int max = check.max(4, 44, 4, 5);
        assertThat(max, is(expected));
    }

    @Test
    public void whenThirdMax() {
        SqMax check = new SqMax();
        int expected = 44;
        int max = check.max(1, 7, 44, 2);
        assertThat(max, is(expected));
    }

    @Test
    public void whenFourthMax() {
        SqMax check = new SqMax();
        int expected = 44;
        int max = check.max(2, 2, 2, 44);
        assertThat(max, is(expected));
    }

    @Test
    public void whenAllEqual() {
        SqMax check = new SqMax();
        int expected = 44;
        int max = check.max(44, 44, 44, 44);
        assertThat(max, is(expected));
    }
}