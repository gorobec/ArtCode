package week3.day2.library;


public class Book {
    String name;
    int pages;
    String author;

    public Book(String name, int pages, String author) {
        this.name = name;
        this.pages = pages;
        this.author = author;
    }

    public String getInfo(){
        return "Book: " + name + " author - " + author + "pages - " + pages;
    }
}
