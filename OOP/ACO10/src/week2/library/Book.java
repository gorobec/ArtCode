package week2.library;

import java.io.Serializable;

public class Book implements Comparable, Serializable{
    String name;
    String autor;
    int publishYear;

    public Book() {
    }

    public Book(String name, String autor, int publishYear){
        this.name = name;
        this.autor = autor;
        this.publishYear = publishYear;
    }
//вместо того что бы писать этот метод нужно было переопределить метод equals, было бы проще и правельнее
    public boolean compareBook(Book book1){
        if (this.name.equals(book1.name) && this.autor.equals(book1.autor)  && this.publishYear ==book1.publishYear){
            return true;
        }   return false;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", autor='" + autor + '\'' +
                ", publishYear=" + publishYear +
                '}';
    }

    @Override
    public int compareTo(Object o) {
        Book book = (Book)o;
        if(this.name.compareTo(book.name) > 0) return 1;
        else if(this.name.compareTo(book.name) < 0) return -1;
        else {
            if(this.publishYear > book.publishYear) return 1;
            else if(this.publishYear < book.publishYear) return -1;
        }
        return 0;
    }


}