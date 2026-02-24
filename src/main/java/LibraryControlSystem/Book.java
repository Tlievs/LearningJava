package LibraryControlSystem;

public abstract class Book {
    private final String bookType;
    private String title;
    private String isbn;
    private String author;
    private boolean isAvailable;

    public Book(String bookType, String title, String isbn, String author) {
        this.bookType = bookType;
        setTitle(title);
        setIsbn(isbn);
        setAuthor(author);
        this.isAvailable = true;
    }

    public void setTitle(String title) {
        if (title.isBlank()) {
            System.out.println("Book name cannot be empty");
        } else {
            this.title = title;
        }
    }

    public void setIsbn(String isbn) {
        if (isbn.length() != 13) {
            System.out.println("ISBN Length must be 13");
        } else {
            this.isbn = isbn;
        }
    }

    public void setAuthor(String author) {
        if (author.isBlank()) {
            System.out.println("Book author cannot be empty");
        } else {
            this.author = author;
        }
    }

    public void setAvailable(boolean available) {
        this.isAvailable = available;
    }

    public String getBookType() {
        return this.bookType;
    }

    public String getTitle() {
        return this.title;
    }

    public String getIsbn() {
        return this.isbn;
    }

    public String getAuthor() {
        return this.author;
    }

    public boolean isAvailable() {
        return this.isAvailable;
    }

    public String getBookInfo() {
        return String.format("%nBook title: %s%nBook ISBN: %s%nBook author: %s%nIs book available: %b%nBook type: %s ", getTitle(), getIsbn(), getAuthor(), isAvailable(), getBookType());
    }

    @Override
    public String toString(){
        return getBookInfo();
    }

    @Override
    public boolean equals(Object o) {
        if(this == o) {
            return true;
        }
        if (!(o instanceof Book book)) {
            return false;
        }
        return java.util.Objects.equals(this.isbn, book.isbn);
    }

    @Override
    public int hashCode(){
        return java.util.Objects.hash(isbn);
    }
}