package ru.job4j.array;

public class MatrixSum {
    public static int sum(int[][] array) {
        int rsl = 0;

        for (int i = 0; i < array.length; i++) {
            for (int k = 0; k < array[i].length; k++) {
                rsl = rsl + array[i][k];
            }
        }
        return rsl;
    }
}