package ru.job4j.condition;

public class ChessBoard {
    public static int wayRook(int x1, int y1, int x2, int y2) {
        int rsl = 0;
        if (x1 == x2 || y1 == y2) {
            rsl = Math.abs(x2 - x1);
            rsl = rsl == 0 ? Math.abs(y2 - y1) : rsl;
        }
        return rsl;
    }

    public static int wayBishop(int x1, int y1, int x2, int y2) {
        int rsl = 0;
        if (x1 < 0 || x1 > 7 || y1 < 0 || y1 > 7 || x2 < 0 || x2 > 7 || y2 < 0 || y2 > 7) {
            rsl = 0;
        } else if (Math.abs(x2 - x1) == Math.abs(y2 - y1)) {  // Если абсолют. знач. x2 - x1 = аб. знач. y2 - y1,
            rsl = Math.abs(x2 - x1);                          // тогда фигура ходит по диагонали
        }                                                     // остается вычесть x2 - x1, чтобы узнать соклько ходов
        return rsl;
    }

    public static void main(String[] args) {
        System.out.println(wayRook(0, 0, 0, 5));
        System.out.println(wayRook(0, 0, 7, 0));
        System.out.println(wayBishop(0, 0, 5, 5));
        System.out.println(wayBishop(4, 3, 0, 7));
        System.out.println(wayBishop(-4, 3, 0, 7));
    }
}