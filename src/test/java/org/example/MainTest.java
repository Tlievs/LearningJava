package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

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
    void testTwoTwo() {
        Main main = new Main();
        assertTrue(main.twoTwo(new int[]{4, 2, 2, 3}));
        assertTrue(main.twoTwo(new int[]{2, 2, 4}));
        assertFalse(main.twoTwo(new int[]{2, 2, 4, 2}));
        assertTrue(main.twoTwo(new int[]{}));
    }

    @Test
    void testSameEnds() {
        Main main = new Main();
        assertFalse(main.sameEnds(new int[]{5, 6, 45, 99, 13, 5, 6}, 1));
        assertTrue(main.sameEnds(new int[]{5, 6, 45, 99, 13, 5, 6}, 2));
        assertFalse(main.sameEnds(new int[]{5, 6, 45, 99, 13, 5, 6}, 3));
    }

    @Test
    void testTripleUp() {
        Main main = new Main();
        assertTrue(main.tripleUp(new int[]{1, 4, 5, 6, 2}));
        assertTrue(main.tripleUp(new int[]{1, 2, 3}));
        assertFalse(main.tripleUp(new int[]{1, 2, 4}));
    }

    @Test
    void testFizzArray3() {
        Main main = new Main();
        assertArrayEquals(new int[]{5, 6, 7, 8, 9}, main.fizzArray3(5, 10));
        assertArrayEquals(new int[]{11, 12, 13, 14, 15, 16, 17}, main.fizzArray3(11, 18));
        assertArrayEquals(new int[]{1, 2}, main.fizzArray3(1, 3));
    }

    @Test
    void testFinalBlock() {
        Main main = new Main();

        // shiftLeft
        assertArrayEquals(new int[]{2, 5, 3, 6}, main.shiftLeft(new int[]{6, 2, 5, 3}));

        // post4
        assertArrayEquals(new int[]{1, 2}, main.post4(new int[]{2, 4, 1, 2}));

        // withoutTen
        assertArrayEquals(new int[]{1, 2, 0, 0}, main.withoutTen(new int[]{1, 10, 10, 2}));
    }

    @Test
    void testTenRun() {
        Main main = new Main();
        assertArrayEquals(new int[]{2, 10, 10, 10, 20, 20}, main.tenRun(new int[]{2, 10, 3, 4, 20, 5}));
        assertArrayEquals(new int[]{10, 10, 20, 20}, main.tenRun(new int[]{10, 1, 20, 2}));
        assertArrayEquals(new int[]{10, 10, 10, 20}, main.tenRun(new int[]{10, 1, 9, 20}));
    }

    @Test
    void testPre4() {
        Main main = new Main();
        assertArrayEquals(new int[]{1, 2}, main.pre4(new int[]{1, 2, 4, 1}));
        assertArrayEquals(new int[]{3, 1}, main.pre4(new int[]{3, 1, 4}));
        assertArrayEquals(new int[]{1}, main.pre4(new int[]{1, 4, 4}));
    }

    @Test
    void testNotAlone() {
        Main main = new Main();
        assertArrayEquals(new int[]{1, 3, 3}, main.notAlone(new int[]{1, 2, 3}, 2));
        assertArrayEquals(new int[]{1, 3, 3, 5, 5, 2}, main.notAlone(new int[]{1, 2, 3, 2, 5, 2}, 2));
        assertArrayEquals(new int[]{3, 4}, main.notAlone(new int[]{3, 4}, 3));
    }

    @Test
    void testZeroFront() {
        Main main = new Main();
        assertArrayEquals(new int[]{0, 0, 1, 1}, main.zeroFront(new int[]{1, 0, 0, 1}));
        assertArrayEquals(new int[]{0, 0, 1, 1, 1}, main.zeroFront(new int[]{0, 1, 1, 0, 1}));
        assertArrayEquals(new int[]{0, 1}, main.zeroFront(new int[]{1, 0}));
    }

    @Test
    void testZeroMax() {
        Main main = new Main();
        assertArrayEquals(new int[]{5, 5, 3, 3}, main.zeroMax(new int[]{0, 5, 0, 3}));
        assertArrayEquals(new int[]{3, 4, 3, 3}, main.zeroMax(new int[]{0, 4, 0, 3}));
        assertArrayEquals(new int[]{1, 1, 0}, main.zeroMax(new int[]{0, 1, 0}));
    }

    @Test
    void testEvenOdd() {
        Main main = new Main();
        assertArrayEquals(new int[]{0, 0, 0, 1, 1, 1, 1}, main.evenOdd(new int[]{1, 0, 1, 0, 0, 1, 1}));
        assertArrayEquals(new int[]{2, 3, 3 }, main.evenOdd(new int[]{3, 3, 2}));
        assertArrayEquals(new int[]{2, 2, 2}, main.evenOdd(new int[]{2, 2, 2}));
    }

    @Test
    void testFizzBuzz() {
        Main main = new Main();
        assertArrayEquals(new String[]{"1", "2", "Fizz", "4", "Buzz"}, main.fizzBuzz(1, 6));
        assertArrayEquals(new String[]{"1", "2", "Fizz", "4", "Buzz", "Fizz", "7"}, main.fizzBuzz(1, 8));
        assertArrayEquals(new String[]{"1", "2", "Fizz", "4", "Buzz", "Fizz", "7", "8", "Fizz", "Buzz"}, main.fizzBuzz(1, 11));
    }
}