package ru.job4j.condition;

import org.junit.Test;
import org.junit.Assert;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class ChessBoardTest {
    @Test
    public void wayRookIs5() {
        int way = ChessBoard.wayRook(0, 0, 0, 5);
        assertThat(way, is(5));
    }

    @Test
    public void wayRookIs7() {
        int way = ChessBoard.wayRook(0, 0, 7, 0);
        assertThat(way, is(7));
    }

    @Test
    public void wayRookIs0() {
        int way = ChessBoard.wayRook(0, 0, 5, 6);
        assertThat(way, is(0));
    }

    @Test
    public void whenX1isMinus1ThenWayBishopIs0() {
        int x1 = -1;
        int y1 = 6;
        int x2 = 4;
        int y2 = 1;
        int result = ChessBoard.wayBishop(x1, y1, x2, y2);
        int expected = 0;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenY1isMinus1ThenWayBishopIs0() {
        int x1 = 2;
        int y1 = -1;
        int x2 = 4;
        int y2 = 1;
        int result = ChessBoard.wayBishop(x1, y1, x2, y2);
        int expected = 0;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenX2isMinus1ThenWayBishopIs0() {
        int x1 = 2;
        int y1 = 6;
        int x2 = -1;
        int y2 = 1;
        int result = ChessBoard.wayBishop(x1, y1, x2, y2);
        int expected = 0;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenY2isMinus1ThenWayBishopIs0() {
        int x1 = 2;
        int y1 = 6;
        int x2 = 4;
        int y2 = -1;
        int result = ChessBoard.wayBishop(x1, y1, x2, y2);
        int expected = 0;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenX1isGreater7ThenWayBishopIs0() {
        int x1 = 10;
        int y1 = 6;
        int x2 = 4;
        int y2 = 1;
        int result = ChessBoard.wayBishop(x1, y1, x2, y2);
        int expected = 0;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenY1isGreater7ThenWayBishopIs0() {
        int x1 = 2;
        int y1 = 10;
        int x2 = 4;
        int y2 = 1;
        int result = ChessBoard.wayBishop(x1, y1, x2, y2);
        int expected = 0;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenX2isGreater7ThenWayBishopIs0() {
        int x1 = 2;
        int y1 = 6;
        int x2 = 10;
        int y2 = 1;
        int result = ChessBoard.wayBishop(x1, y1, x2, y2);
        int expected = 0;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenY2isGreater7ThenWayBishopIs0() {
        int x1 = 2;
        int y1 = 6;
        int x2 = 4;
        int y2 = 10;
        int result = ChessBoard.wayBishop(x1, y1, x2, y2);
        int expected = 0;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenX1is2Y1is6X2is4Y2is4ThenWayBishopIs2() {
        int x1 = 2;
        int y1 = 6;
        int x2 = 4;
        int y2 = 4;
        int result = ChessBoard.wayBishop(x1, y1, x2, y2);
        int expected = 2;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenX1is0Y1is0X2is5Y2is5ThenWayBishopIs5() {
        int x1 = 0;
        int y1 = 0;
        int x2 = 5;
        int y2 = 5;
        int result = ChessBoard.wayBishop(x1, y1, x2, y2);
        int expected = 5;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenX1is4Y1is3X2is0Y2is7ThenWayBishopIs4() {
        int x1 = 4;
        int y1 = 3;
        int x2 = 0;
        int y2 = 7;
        int result = ChessBoard.wayBishop(x1, y1, x2, y2);
        int expected = 4;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenX1is6Y1is0X2is5Y2is1ThenWayBishopIs1() {
        int x1 = 6;
        int y1 = 0;
        int x2 = 5;
        int y2 = 1;
        int result = ChessBoard.wayBishop(x1, y1, x2, y2);
        int expected = 1;
        Assert.assertEquals(expected, result);
    }
}