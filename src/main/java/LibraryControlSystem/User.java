package LibraryControlSystem;

import java.util.ArrayList;
import java.util.List;

public class User {
    private String userName;
    private int userId;
    private List<Book> rentedBooks;

    public User(String userName, int userId) {
        setUserName(userName);
        setUserId(userId);
        this.rentedBooks = new ArrayList<>();
    }

    public void setUserName(String userName) {
        if (userName.isBlank()) {
            System.out.println("User name cannot be empty");
        } else {
            this.userName = userName;
        }
    }

    public void setUserId(int userId) {
        if (userId < 0) {
            System.out.println("User id must be at least zero");
        } else {
            this.userId = userId;
        }
    }

    public void addBook(Book book) {
        this.rentedBooks.add(book);
    }

    public void removeBook(Book book) {
        this.rentedBooks.remove(book);
    }

    public String getUserName() {
        return userName;
    }

    public int getUserId() {
        return userId;
    }

    public List<Book> getRentedBooks() {
        return List.copyOf(rentedBooks);
    }
}
