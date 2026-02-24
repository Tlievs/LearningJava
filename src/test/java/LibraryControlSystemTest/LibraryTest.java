package LibraryControlSystemTest;

import LibraryControlSystem.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class LibraryTest {
    private Library library;
    private User user;
    private FictionBook fictionBook;
    private ReferenceBook referenceBook;
    private TextBook textBook;

    @Nested
    @DisplayName("Проверка аренды книг")
    class BookRentTest {
        @BeforeEach
        void setUp() {
            library = new Library();
            user = new User("Daniel", 1);
            fictionBook = new FictionBook("The Witcher", "1234567890123", "Sapkowski", "Fantasy");
            referenceBook = new ReferenceBook("Spravochnik", "1111111111111", "Me", "German");

            library.addBook(fictionBook);
            library.addBook(referenceBook);
            library.addUser(user);
        }

        @Test
        @DisplayName("Аренда книги")
        void testSuccessfulRent() {
            library.rentBook(user, fictionBook);

            assertFalse(fictionBook.isAvailable(), "Книга должна стать недоступной после аренды");
            assertTrue(user.getRentedBooks().contains(fictionBook), "Книга должна появиться у пользователя");
        }

        @Test
        @DisplayName("Возврат книги")
        void testSuccessfulReturn() {
            library.rentBook(user, fictionBook);

            assertFalse(fictionBook.isAvailable(), "Книга должна стать недоступной после аренды");
            assertTrue(user.getRentedBooks().contains(fictionBook), "Книга должна появиться у пользователя после аренды");

            library.returnBook(user, fictionBook);

            assertTrue(fictionBook.isAvailable(), "Книга должна стать доступной после возврата");
            assertFalse(user.getRentedBooks().contains(fictionBook), "Книга должна пропасть из списка книг у пользователя после возврата");
        }

        @Test
        @DisplayName("Ошибка аренды справочника")
        void testRentReferenceBookFails() {
            library.rentBook(user, referenceBook);

            assertTrue(referenceBook.isAvailable(), "Справочник должен оставаться доступным после попытки аренды");
            assertFalse(user.getRentedBooks().contains(referenceBook), "Справочник не должен появляться у пользователя после попытки аренды");
        }
    }

    @Nested
    @DisplayName("Проверка работы поиска")
    class SearchTest {
        @BeforeEach
        void setUp() {
            library = new Library();
            user = new User("Daniel", 1);
            fictionBook = new FictionBook("The Witcher", "1234567890123", "Sapkowski", "Fantasy");
            referenceBook = new ReferenceBook("Spravochnik", "1111111111111", "Me", "German");

            library.addBook(fictionBook);
            library.addBook(referenceBook);
            library.addUser(user);
        }

        @Test
        @DisplayName("Поиск по автору с частичным совпадением")
        void searchByAuthorPartially() {
            List<Book> expected = List.of(fictionBook);
            List<Book> actual = library.findBookByAuthor("sa");

            assertEquals(expected, actual, "Списки должны совпадать");
        }

        @Test
        @DisplayName("Поиск по автору по полному совпадению")
        void searchByAuthorFull() {
            List<Book> expected = List.of(fictionBook);
            List<Book> actual = library.findBookByAuthor("Sapkowski");

            assertEquals(expected, actual, "Списки должны совпадать");
        }

        @Test
        @DisplayName("Поиск по заголовку с частичным совпадением")
        void searchByTitlePartially() {
            List<Book> expected = List.of(fictionBook);
            List<Book> actual = library.findBookByTitle("witch");

            assertEquals(expected, actual, "Списки должны совпадать");
        }

        @Test
        @DisplayName("Поиск по заголовку с полным совпадением")
        void searchByTitleFull() {
            List<Book> expected = List.of(fictionBook);
            List<Book> actual = library.findBookByTitle("The Witcher");

            assertEquals(expected, actual, "Списки должны совпадать");
        }
    }

    @Nested
    @DisplayName("Проверка работы статистики")
    class StatisticsTest {
        @BeforeEach
        void setUp() {
            library = new Library();
            user = new User("Daniel", 1);
            fictionBook = new FictionBook("The Witcher", "1234567890123", "Sapkowski", "Fantasy");
            referenceBook = new ReferenceBook("Spravochnik", "1111111111111", "Me", "German");
            textBook = new TextBook("Beginners Math", "2222222222222", "Browning", "Math");

            library.addBook(fictionBook);
            library.addBook(referenceBook);
            library.addBook(textBook);
            library.addUser(user);
        }

        @Test
        @DisplayName("Все книги доступны к аренде")
        void testAllBooksAvailable() {
            assertEquals("Total books: 3\nAvailable books: 3\nRented books: 0\n", library.getLibraryStatistics(), "Все книги должны быть не в аренде");
        }

        @Test
        @DisplayName("Все книги арендованы")
        void testAllBooksRented() {
            library.rentBook(user, fictionBook);
            library.rentBook(user, referenceBook); //Справочник нельзя взять в аренду
            library.rentBook(user, textBook);
            assertEquals("Total books: 3\nAvailable books: 1\nRented books: 2\n", library.getLibraryStatistics(), "Все книги, кроме справочника, должны быть в аренде");
        }
    }
}
