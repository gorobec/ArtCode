package week2.library;


import java.util.ArrayList;


public class Reader {
    String name;
    int id;
    ArrayList<Book> readerBook = new ArrayList<>(3);

    Reader (String name, int id){
        this.name = name;
        this.id = id;
    }

}