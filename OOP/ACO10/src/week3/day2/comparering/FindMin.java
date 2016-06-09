package week3.day2.comparering;


import week2.library.Book;

public class FindMin {
    public static void main(String[] args) {
        Book[] books = {new Book("Bye", "bbb", 124),
                new Book("Bye", "cc", 565),
                new Book("One", "fdf", 56),
                new Book("Two", "fdf", 155),};

        Book smallest = (Book) findSmallestBook(books);
        System.out.println(smallest);


    }

    public static Comparable findSmallestBook(Comparable[] books){
        Comparable smallest = books[0];
        for (int i = 1; i < books.length; i++) {
            if(smallest.compareTo(books[i]) > 0) smallest = books[i];
        }
        return smallest;
    }
}
