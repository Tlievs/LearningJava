package LibraryControlSystem;

public class TextBook extends Book {
    private String subject;

    public TextBook(String title, String isbn, String author, String subject) {
        super("Text book", title, isbn, author);
        setSubject(subject);
    }

    public void setSubject(String subject) {
        if (subject.isBlank()) {
            System.out.println("Text book subject cannot be empty");
        } else {
            this.subject = subject;
        }
    }

    public String getSubject() {
        return subject;
    }

    @Override
    public String getBookInfo() {
        return super.getBookInfo() + String.format("Text book subject: %s", getSubject());
    }
}
