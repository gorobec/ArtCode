package week2.library;

import java.util.ArrayList;


public class ReaderTest {
    public static void main(String[] args) {
        Library biblioteka = new Library();
//        эти массивы есть внутри бибиотеки
        //ArrayList<Reader> readers = new ArrayList<>();
        //ArrayList<Book> books = new ArrayList<>();

        Reader kate = new Reader("Kate", 1);
        Reader kate1 = new Reader("Kate", 2);
        Reader kate2 = new Reader("Kate", 3);
        Reader kate4 = new Reader("Kate", 4);
//      чтобы выводило не ссылки переопредели метод toString в классе читатель
        biblioteka.addReader(kate);
        biblioteka.addReader(kate1);
        biblioteka.addReader(kate2);
        biblioteka.addReader(kate4);

        System.out.println(biblioteka.readers.size());
//        System.out.println(readers.get(1));
//        у тебя же есть свой метод
        biblioteka.showReader();


//          ересь, передавала пустой массив
//        biblioteka.showReader(readers);

        Book b1 = new Book("mm", "mm", 1);
        Book b2 = new Book("mm", "mm", 1);

//      книги передавать в библиотеку нужно
       /* books.add(b1);
        books.add(b2)*/;

        biblioteka.addBook(b1);
        biblioteka.addBook(b2);

        System.out.println(biblioteka.giveBook(kate1, b1));
    }

}
