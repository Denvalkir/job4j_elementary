package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class MaxTest {
    @Test
    public void whenMax2To3Then3() {
        int left = 2;
        int right = 3;
        int result = Max.max(left, right);
        int expected = 3;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenMax3To2Then3() {
        int left = 3;
        int right = 2;
        int result = Max.max(left, right);
        int expected = 3;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenMax2To2Then2() {
        int left = 2;
        int right = 2;
        int result = Max.max(left, right);
        int expected = 2;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void testMaxWhen2Nums() {
        int a = 3;
        int b = 4;
        int result = Max.max(a, b);
        int expected = 4;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void testMaxWhen3Nums() {
        int a = 3;
        int b = 4;
        int c = 5;
        int result = Max.max(a, b, c);
        int expected = 5;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void testMaxWhen4Nums() {
        int a = 3;
        int b = 4;
        int c = 5;
        int d = 6;
        int result = Max.max(a, b, c, d);
        int expected = 6;
        Assert.assertEquals(result, expected);
    }
}