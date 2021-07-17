package ru.job4j.condition;

public class Max {
    public static int max(int a, int b) {
        return a > b ? a : b;
    }

    public static int max(int a, int b, int c) {
        return max(a, max(b, c));
    }

    public static int max(int a, int b, int c, int d) {
        return max(a, max(b, c, d));
    }

    public static void main(String[] args) {
        System.out.println(max(2, 3));
        System.out.println(max(3, 2));
        System.out.println(max(2, 2));
    }
}