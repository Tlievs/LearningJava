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
        assertEquals(main.matchUp(new int[]{1, 2, 3}, new int[]{2, 3, 10}), 2);
        assertEquals(main.matchUp(new int[]{1, 2, 3}, new int[]{2, 3, 5}), 3);
        assertEquals(main.matchUp(new int[]{1, 2, 3}, new int[]{2, 3, 3}), 2);
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
}