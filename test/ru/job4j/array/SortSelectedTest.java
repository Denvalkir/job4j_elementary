package ru.job4j.array;

import org.junit.Assert;
import org.junit.Test;

public class SortSelectedTest {
    @Test
    public void whenSort5Nums() {
        int[] data = new int[] {3, 4, 1, 2, 5};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {1, 2, 3, 4, 5};
        Assert.assertArrayEquals(expected, result);
    }

    @Test
    public void whenSort3Nums() {
        int[] data = new int[] {8, 1, -1};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {-1, 1, 8};
        Assert.assertArrayEquals(expected, result);
    }

    @Test
    public void whenSort7Nums() {
        int[] data = new int[] {0, -4, -1, 3, 6, 7, 0};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {-4, -1, 0, 0, 3, 6, 7};
        Assert.assertArrayEquals(expected, result);
    }
}