package week2.library;

import java.util.ArrayList;


public class Library {
    ArrayList<Book> books = new ArrayList<>() ;
    ArrayList<Reader> readers = new ArrayList<>();
    ArrayList<Reader> blackList = new ArrayList<>();


//   return boolean or void
    public boolean addReader(Reader reader){
//       сделай проверку если пользователь уже зарегестрирован
        readers.add(reader);
        return true;
    }
//    возвращай булевый тип
    public boolean addBook(Book book){

        books.add(book);
        return true;
    }
//    показывай пользователей, который есть в библиотеке, а не которых ты передаешь
    public void showReader(){

        for (int i = 0; i< readers.size(); i++){
            System.out.println(readers.get(i));
        }
    }
//    тоже самое с книгами, показывай свои, а не те что приходят из вне
    public void showBook(){

        for (Book book : books) {
            System.out.println(book);
        }
    }


//возвращай boolean
    public  boolean giveBook(Reader reader, Book book){
        for (int i = 0; i < books.size(); i++) {
            if (this.books.get(i).compareBook(book) == true){
                // нужна проверка на количество книг у читателя
                //лучше написать внутри класса Читатель свой метод добавить книга
                //и вызывать его от сюда
                reader.readerBook.add(book);
                //после того как дала книгу читателю дай библиотеке знать, что книга отданна
                //для этого в классе Книга добавь поле "есть в наличии"
                //и просто меняй ее статус
                return true;
            }

        }
        return false;
    }
}

