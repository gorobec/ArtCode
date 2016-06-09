package week3.day2.library;


public class TestLibrary {
    public static void main(String[] args) {
        Library library = new Library();
        Book book = new Book("Idiot", 500, "Dostoevskiy");
        Book book2 = new Book("War and Peace", 500, "Tolstoy");
        Book book3 = new Book("Idiot", 500, "Dostoevskiy");

        library.fillLibrary(book, book2, book3);
        library.showBooks();

    }
}
