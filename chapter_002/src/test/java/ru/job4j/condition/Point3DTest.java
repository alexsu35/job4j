package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class Point3DTest {

    @Test
    public void pointOne() {
        Point3D a = new Point3D(0, 0);
        Point3D b = new Point3D(0, 2);
        double exp = 2.0;
        double out = a.distance(b);
        Assert.assertEquals(exp, out, 0);
    }

    @Test
    public void pointTwo() {
        Point3D a = new Point3D(0, -3, 3);
        Point3D b = new Point3D(3, 1, 3);
        double exp = 5.0;
        double out = a.distance3d(b);
        Assert.assertEquals(exp, out, 0);
    }
}