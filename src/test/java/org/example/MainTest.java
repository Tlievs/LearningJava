package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {
    @Test
    void testEither24() {
        Main main = new Main(); // Создаем объект твоего класса

        // Проверяем разные сценарии (Assertions)
        assertTrue(main.either24(new int[]{1, 2, 2, 6})); // Ожидаем true
        assertTrue(main.either24(new int[]{4, 4, 1}));    // Ожидаем true
        assertFalse(main.either24(new int[]{1, 2, 2, 4, 4})); // Ожидаем false
    }

    @Test
    void testFizzArray2() {
        Main main = new Main();
        // Проверяем, что массив строк создается корректно
        assertArrayEquals(new String[]{"0", "1", "2"}, main.fizzArray2(3));
        assertArrayEquals(new String[]{"0"}, main.fizzArray2(1));
    }

    @Test
    void testIsEverywhere() {
        Main main = new Main();
        assertTrue(main.isEverywhere(new int[]{1, 2, 1, 3}, 1));
        assertFalse(main.isEverywhere(new int[]{1, 2, 4, 3}, 1));
    }

    @Test
    void testMatchUp() {
        Main main = new Main();
        assertEquals(2, main.matchUp(new int[]{1, 2, 3}, new int[]{2, 3, 10}));
        assertEquals(3, main.matchUp(new int[]{1, 2, 3}, new int[]{2, 3, 5}));
        assertEquals(2, main.matchUp(new int[]{1, 2, 3}, new int[]{2, 3, 3}));
    }

    @Test
    void testHas77() {
        Main main = new Main();
        assertTrue(main.has77(new int[]{1, 7, 7}));
        assertTrue(main.has77(new int[]{1, 7, 1, 7}));
        assertFalse(main.has77(new int[]{1, 7, 1, 1, 7}));
        assertTrue(main.has77(new int[]{7, 7, 1, 1, 7}));
    }

    @Test
    void testHas12() {
        Main main = new Main();
        assertTrue(main.has12(new int[]{1, 3, 2}));
        assertTrue(main.has12(new int[]{3, 1, 2}));
        assertTrue(main.has12(new int[]{3, 1, 4, 5, 2}));
    }

    @Test
    void testModThree() {
        Main main = new Main();
        assertTrue(main.modThree(new int[]{2, 1, 3, 5}));
        assertFalse(main.modThree(new int[]{2, 1, 2, 5}));
        assertTrue(main.modThree(new int[]{2, 4, 2, 5}));
    }

    @Test
    void testHaveThree() {
        Main main = new Main();
        assertTrue(main.haveThree(new int[]{3, 1, 3, 1, 3}));
        assertFalse(main.haveThree(new int[]{3, 1, 3, 3}));
        assertFalse(main.haveThree(new int[]{3, 4, 3, 3, 4}));
    }

    @Test
    void testLoneSum() {
        Main main = new Main();
        assertEquals(6, main.loneSum(1, 2, 3));
        assertEquals(2, main.loneSum(3, 2, 3));
        assertEquals(0, main.loneSum(3, 3, 3));
    }

    @Test
    void testLuckySum() {
        Main main = new Main();
        assertEquals(6, main.luckySum(1, 2, 3));
        assertEquals(3, main.luckySum(1, 2, 13));
        assertEquals(1, main.luckySum(1, 13, 3));
        assertEquals(0, main.luckySum(13, 2, 3));
    }

    @Test
    void testNoTeenSum() {
        Main main = new Main();
        assertEquals(6, main.noTeenSum(1, 2, 3));
        assertEquals(3, main.noTeenSum(2, 13, 1));
        assertEquals(3, main.noTeenSum(2, 1, 14));
    }

    @Test
    void testRoundSum() {
        Main main = new Main();
        assertEquals(60, main.roundSum(16, 17, 18));
        assertEquals(30, main.roundSum(12, 13, 14));
        assertEquals(10, main.roundSum(6, 4, 4));
    }

    @Test
    void testCloseFar() {
        Main main = new Main();
        assertTrue(main.closeFar(1, 2, 10));
        assertFalse(main.closeFar(1, 2, 3));
        assertTrue(main.closeFar(4, 1, 3));
    }

    @Test
    void testEvenlySpaced() {
        Main main = new Main();
        assertTrue(main.evenlySpaced(2, 4, 6));
        assertTrue(main.evenlySpaced(2, 4, 6));
        assertFalse(main.evenlySpaced(4, 6, 3));
        assertTrue(main.evenlySpaced(0, 0, 0));
    }
}