package ru.job4j.sort;

import java.util.Arrays;

public class Machine {
    public static int[] change(int money, int price) {
        int[] coins = {10, 5, 2, 1};
        int[] rsl = new int[100];
        int size = 0;
        int sumChange = money - price;
        int index = 0;

        for (int i = 0; i < coins.length; i++) {
            while (sumChange - coins[i] >= 0) {
                rsl[index] = coins[i];
                index++;
                size++;
                sumChange = sumChange - coins[i];
            }
        }
        return Arrays.copyOf(rsl, size);
    }
}