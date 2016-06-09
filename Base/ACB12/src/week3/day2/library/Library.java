package week3.day2.library;


public class Library {
    Book[] books = new Book[3];


    public void fillLibrary(Book book, Book book2, Book book3){
        books[0] = book;
        books[1] = book2;
        books[2] = book3;
    }

    public void showBooks(){
        for (int i = 0; i < books.length; i++) {
            System.out.println(books[i].getInfo());
        }
    }

}
