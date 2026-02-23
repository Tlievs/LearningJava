package LibraryControlSystem;

public class ReferenceBook extends Book {
    private String country;

    public ReferenceBook(String title, String isbn, String author, String country) {
        super("Reference book", title, isbn, author);
        setCountry(country);
    }

    public void setCountry(String country) {
        if (country.isBlank()) {
            System.out.println("Reference book country cannot be empty");
        } else {
            this.country = country;
        }
    }

    public String getCountry() {
        return this.country;
    }

    @Override
    public String getBookInfo() {
        return super.getBookInfo() + String.format("%nReference book country: %s%n", getCountry());
    }
}
