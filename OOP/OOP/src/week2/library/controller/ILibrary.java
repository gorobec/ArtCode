package week2.library.controller;

import week2.library.model.Book;
import week2.library.model.BookReader;

public interface ILibrary {
    void showReadersList();
    void showAvailableBooks();
    boolean addBook(Book book);
    boolean addBookReader(BookReader bookReader);
    boolean giveBook(BookReader bookReader, Book book);
    void showTakenBooks();
    void showReadersBooks(BookReader bookReader);
    boolean addToBlacklist(BookReader reader);
    void showBooksByAuthor(String authorName);
    void showNewBooks();
}
