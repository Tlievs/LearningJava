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
}