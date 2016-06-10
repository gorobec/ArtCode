package week2.library.model;


import java.io.Serializable;
import java.util.ArrayList;

public class BookReader implements Serializable{
    private String name;
    private String surname;
    private ArrayList<Book> books = new ArrayList<>();
    private boolean inBlacklist = false;

    public BookReader(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Book> getBooks() {
        return books;
    }

    public boolean isInBlacklist() {
        return inBlacklist;
    }

    public void setInBlacklist(boolean inBlacklist) {
        this.inBlacklist = inBlacklist;
    }

    public void addBook(Book book) {
        this.books.add(book);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof BookReader)) return false;

        BookReader that = (BookReader) o;

        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        if (surname != null ? !surname.equals(that.surname) : that.surname != null) return false;

        return true;
    }

    @Override
    public String toString() {
        return String.format("%2$s %1$s",name, surname);
    }
}
