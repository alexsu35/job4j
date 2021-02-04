package ru.job4j.condition;

import org.junit.Test;
import static org.hamcrest.number.IsCloseTo.closeTo;
import static org.junit.Assert.assertThat;



public class PointTest {

    /**
     *  Test distance
     */
    @Test
    public void distanceToPoint() {
        Point point = new Point(1, 1);
        assertThat(point.distance(new Point(3, 8)), closeTo(7.28, 0.01));
    }

    @Test
    public void distanceToPoint2() {
        Point point = new Point(3, 7);
        assertThat(point.distance(new Point(2, 8)), closeTo(1.41, 0.01));
    }

}
