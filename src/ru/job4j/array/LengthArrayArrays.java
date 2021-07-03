package ru.job4j.array;

public class LengthArrayArrays {
    public static void main(String[] args) {
        int[][] nums = {{1}, {1, 2}, {1, 2, 3}, {1, 2, 3, 4}};

        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i].length);
        }
    }
}
