package ru.job4j.array;

public class Matrix {
    public static int[][] multiple(int size) {
        int[][] rsl = new int[size][size];

        for (int i = 1; i <= size; i++) {
            for (int k = 1; k <= size; k++) {
                rsl[i - 1][k - 1] = i * k;
            }
        }
        return rsl;
    }
}
