package week2.library.model;


import java.io.Serializable;
import java.util.Formatter;

public class Book implements Serializable{
    private String name;
    private String author;
    private int date;
    private boolean isAvailable = true;

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean isAvailable) {
        this.isAvailable = isAvailable;
    }

    public Book(String name, String author, int date) {
        this.name = name;
        this.author = author;
        this.date = date;
    }

    public Book(String name, String author) {
        this.name = name;
        this.author = author;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public int getDate() {
        return date;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Book)) return false;

        Book book = (Book) o;

        if (author != null ? !author.equals(book.author) : book.author != null) return false;
        if (name != null ? !name.equals(book.name) : book.name != null) return false;

        return true;
    }

    @Override
    public String toString() {
        Formatter formatter = new Formatter();
        return formatter.format("%15s - %-1s (%d)", author, name, date).toString();
    }
}