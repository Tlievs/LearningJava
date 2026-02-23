package LibraryControlSystem;
import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<Book> catalog = new ArrayList<>();
    private List<User> users = new ArrayList<>();

    public void addUser(User user) {
        users.add(user);
    }

    public void addBook(Book book) {
        catalog.add(book);
    }

    private boolean checkBookExistence(Book book) {
        for (Book libraryBook : catalog) {
            if (libraryBook.getIsbn().equals(book.getIsbn())) {
                return true;
            }
        }
        return false;
    }

    public void rentBook(User user, Book book) {
        boolean bookExists = checkBookExistence(book);
        if (!bookExists) {
            System.out.println("Book not found!");
            return;
        }
        if (!book.isAvailable()) {
            System.out.println("Book already taken!");
            return;
        }
        if (book instanceof ReferenceBook) {
            System.out.println("Reference books cannot be rented!");
            return;
        }
        book.setAvailable(false);
        user.addBook(book);
        System.out.println("Book " + book.getTitle() + " was rented by " + user.getUserName());
    }

    public void returnBook(User user, Book book) {
        if (!user.getRentedBooks().contains(book)) {
            System.out.println("User " + user.getUserName() + " has not rented book " + book.getTitle());
            return;
        }
        boolean bookExists = checkBookExistence(book);
        if (!bookExists) {
            System.out.println("Book not found!");
            return;
        }
        if (book.isAvailable()) {
            System.out.println("Book already returned!");
            return;
        }
        book.setAvailable(true);
        user.removeBook(book);
        System.out.println("Book " + book.getTitle() + " was returned by " + user.getUserName());
    }

    public List<Book> findBookByTitle(String title) {
        List<Book> result = new ArrayList<>();
        title = title.toLowerCase();
        for (Book librarybook : catalog) {
            if (librarybook.getTitle().toLowerCase().contains(title)) {
                result.add(librarybook);
            }
        }
        return result;
    }
    public List<Book> findBookByAuthor(String author) {
        List<Book> result = new ArrayList<>();
        author = author.toLowerCase();
        for (Book librarybook : catalog) {
            if (librarybook.getAuthor().toLowerCase().contains(author)) {
                result.add(librarybook);
            }
        }
        return result;
    }

    public String getLibraryStatistics() {
        int[] result = new int[3];
        for (Book libraryBook : catalog) {
            result[0]++;
            if (libraryBook.isAvailable()) {
                result[1]++;
            }
            if(!libraryBook.isAvailable()) {
                result[2]++;
            }
        }
        return String.format("Total books: %d%nAvailable books: %d%nRented books: %d%n", result[0], result[1], result[2]);
    }
}
