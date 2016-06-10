package week2.library.controller;


import week2.library.model.Book;
import week2.library.model.BookReader;

import java.io.Serializable;
import java.util.ArrayList;


public class Library implements ILibrary, Serializable{
    private String name = "Vernadskogo Library";
    private ArrayList<Book> books = new ArrayList<>();
    private ArrayList<BookReader>bookReaders = new ArrayList<>();
    private static final int LAST_PUBLICATION_YEAR = 2013;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void showReadersList() {
        if(bookReaders.size() > 0) {
        System.out.println("Our readers: ");
            for (BookReader bookReader : bookReaders) {
                System.out.println(bookReader);
            }
        } else {
            System.out.println("Readers list is empty");
        }
    }

    @Override
    public void showAvailableBooks() {
        if(books.size() > 0) {
            System.out.println("Available Books: ");
            for (int i = 0; i < books.size() - 1; i++) {
                if (books.get(i).isAvailable() == true)
                    System.out.println(books.get(i));
            }
        } else {
            System.out.println("Book list is empty");
        }
    }

    @Override
    public boolean addBook(Book book) {
        books.add(book);
        return true;
    }

    @Override
    public boolean addBookReader(BookReader reader) {
        for (BookReader bookReader : bookReaders) {
            if (bookReader.equals(reader)){
                System.out.println("Reader is already register");
                return false;
            }
        }
        bookReaders.add(reader);
        return true;
    }

    @Override
    public boolean giveBook(BookReader reader, Book someBook) {
        BookReader bookReader = findReader(reader);
        if(bookReader != null){
            Book book = findBook(someBook);
            if (book != null && book.isAvailable()){
                if(!bookReader.isInBlacklist() && bookReader.getBooks().size() < 3 ){
                    bookReader.addBook(book);
                    book.setAvailable(false);
                    return true;
                }else {
                    System.out.println("you're not allowed to take books!");
                    return false;
                }
            }else{
                System.out.println("There are no such book in library!");
                return false;
            }
        }else{
            System.out.println("Reader doesn't register!");
            return false;
        }
    }

    private Book findBook(Book aBook) {
        for (Book book : books) {
            if (aBook.equals(book)) return book;
        }
        return null;
    }

    private BookReader findReader(BookReader bookReader) {
        for (BookReader reader : bookReaders) {
            if (bookReader.equals(reader)) return reader;
        }
        return null;
    }

    @Override
    public void showTakenBooks() {
        if(books.size() > 0&& bookReaders.size() > 0) {
            for (BookReader bookReader : bookReaders) {
                if(bookReader.getBooks().size() > 0) {
                    System.out.println(bookReader + " books:");
                    for (Book book : bookReader.getBooks()) {
                        System.out.println(book);
                    }
                }
            }

        } else {
            System.out.println("Book list is empty");
        }
    }

    @Override
    public void showReadersBooks(BookReader reader) {
        BookReader bookReader = findReader(reader);
        if(bookReader != null){
            if(bookReader.getBooks().size() > 0) {
                System.out.println(bookReader + " books:");
                for (Book book : bookReader.getBooks()) {
                    System.out.println(book);
                }
            } else {
                System.out.printf("%s doesn't have books!", bookReader.getName());
            }
        }else{
            System.out.println("Reader doesn't register!");

        }
    }

    @Override
    public boolean addToBlacklist(BookReader reader) {
        BookReader bookReader = findReader(reader);
        if (bookReader == null){
            System.out.println("Reader doesn't register!");
            return false;
        }else{
            bookReader.setInBlacklist(true);
            System.out.println("Reader added to blacklist!");
            return true;
        }
    }

    @Override
    public void showBooksByAuthor(String authorName) {
        for (Book book : books) {
            if(book.getAuthor().equals(authorName))
                System.out.println(book);
        }
    }

    @Override
    public void showNewBooks() {
        for (Book book : books) {
            if(book.getDate() >= LAST_PUBLICATION_YEAR)
                System.out.println(book);
        }
    }
}
