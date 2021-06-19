package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class TriangleTest {
    @Test
    public void whenExistTrue() {
        double ab = 5.0;
        double ac = 7.0;
        double bc = 10.0;
        boolean result = Triangle.exist(ab, ac, bc);
        Assert.assertTrue(result);
    }

    @Test
    public void whenExistFalse() {
        double ab = 2.0;
        double ac = 7.0;
        double bc = 10.0;
        boolean result = Triangle.exist(ab, ac, bc);
        Assert.assertFalse(result);
    }
}