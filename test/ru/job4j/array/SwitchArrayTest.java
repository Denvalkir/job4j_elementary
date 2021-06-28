package ru.job4j.array;

import org.junit.Assert;
import org.junit.Test;

public class SwitchArrayTest {
    @Test
    public void whenSwap0to3() {
        int[] input = {1, 2, 3, 4};
        int source = 0;
        int dest = input.length - 1;
        int[] result = SwitchArray.swap(input, source, dest);
        int[] expected = {4, 2, 3, 1};
        Assert.assertArrayEquals(expected, result);
    }

    @Test
    public void whenSwap1to4() {
        int[] input = {1, 2, 3, 4, 5, 6};
        int source = 1;
        int dest = input.length - 2;
        int[] result = SwitchArray.swap(input, source, dest);
        int[] expected = {1, 5, 3, 4, 2, 6};
        Assert.assertArrayEquals(expected, result);
    }

    @Test
    public void whenSwap0to6() {
        int[] input = {6, 5, 2, 8, 7, 8, 3, 1, 7};
        int source = 0;
        int dest = input.length - 4;
        int[] result = SwitchArray.swap(input, source, dest);
        int[] expected = {8, 5, 2, 8, 7, 6, 3, 1, 7};
        Assert.assertArrayEquals(expected, result);
    }
}