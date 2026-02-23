package LibraryControlSystem;

public class FictionBook extends Book{
    private String genre;

    public FictionBook(String title, String isbn, String author, String genre) {
        super("Fiction book", title, isbn, author);
        setGenre(genre);
    }

    public void setGenre(String genre) {
        if (genre.isBlank()) {
            System.out.println("Fiction book genre must not be empty");
        } else {
            this.genre = genre;
        }
    }

    public String getGenre() {
        return genre;
    }

    @Override
    public String getBookInfo() {
        return super.getBookInfo() + String.format("Fiction book genre: %s", getGenre());
    }
}
