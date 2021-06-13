package ru.job4j.condition;

public class SqArea {
    public static double square(double p, double k) {
        double h = p / (2 * (k + 1));
        double l = h * k;
        double square = l * h;
        return square;
    }

    public static void main(String[] args) {
        double squareTriangle = SqArea.square(6, 2);
        System.out.println(" p = 6, k = 2, s triangle = " + squareTriangle);
    }
}