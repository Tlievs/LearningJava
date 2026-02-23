package LibraryControlSystem;

public class Main {
    static void main(String[] args) {
    Library lib = new Library();
    Book beethoven = new FictionBook("Beethoven", "1111111111111", "Beethoven", "Musical");
    Book lev = new FictionBook("Lev", "1111111111112", "Tolstoy", "Poem");
    Book arithmetics = new TextBook("Beginner Arithmetics", "1111111111113", "Smart", "Math");
    Book spravochnik = new ReferenceBook("Spravochnik", "1111111111234", "Me", "England");
    User daniel = new User("Daniel", 1);
    lib.addBook(beethoven);
    lib.addBook(lev);
    lib.addBook(arithmetics);
    lib.addBook(spravochnik);
    lib.addUser(daniel);
    lib.rentBook(daniel, beethoven);
    lib.returnBook(daniel, beethoven);
    lib.returnBook(daniel, beethoven);
    lib.rentBook(daniel, spravochnik);
    }
}