package ru.job4j.array;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
/**
 * FindLoopTest.
 * Класс для автоматического тестирования методов класса FindLoop.
 *
 * @author Aleksandr S. (subbotin0035@yandex.ru)
 * @since 27.01.2020;
 */
public class FindLoopTest {
    /**
     * Проверяет индекс элемента массива  со значением 5, индекс = 0(Тестирование).
     */
    @Test
    public void whenArrayHasLengh5Then0() {
        FindLoop find = new FindLoop();
        int[] input = new int[] {5, 10, 3};
        int value = 5;
        int result = find.indexOf(input, value);
        int expect = 0;
        assertThat(result, is(expect));
    }
    /**
     * Проверяет индекс элемента массива  со значением 2, значение отсутствует, результат -1(Тестирование).
     */
    @Test
    public void whenArrayNotFoundLenghThenMinusOne() {
        FindLoop find = new FindLoop();
        int[] input = new int[] {5, 10, 3};
        int value = 2;
        int result = find.indexOf(input, value);
        int expect = -1;
        assertThat(result, is(expect));
    }
}