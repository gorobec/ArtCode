package week2.library.view;


import utils.IOUtils;
import week2.library.controller.Library;
import week2.library.model.Book;
import week2.library.model.BookReader;

import java.io.*;


public class Menu {
    private static final String LIBRARY_PATH = "src/week2/library/resources/library.txt";
    private static final String PATH = "src/week2/library/resources/menu.txt";
    private Library library;

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public Menu(Library library) {
        this.library = library;
    }

    public void showMenuList(){
        try {
            System.out.println(IOUtils.readAll(new FileInputStream(PATH)));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public void start() throws IOException {
        System.out.println("Welcome to the " + library.getName() + " menu");
        showMenuList();
        out: while (true) {
               System.out.println("\n***Make your choice***");
               String choose = br.readLine();
               switch (choose) {
                   case "1":
                       library.showReadersList();
                       break;
                   case "2":
                       library.showAvailableBooks();
                       break;
                   case "3":
                       addBook();
                       break;
                   case "4":
                       addReader();
                       break;
                   case "5":
                       giveBook();
                       break;
                   case "6":
                       library.showTakenBooks();
                       break;
                   case "7":
                       showReaderBooks();
                       break;
                   case "8":
                       library.addToBlacklist(new BookReader(getReaderName(), getReaderSurname()));
                       break;
                   case "9":
                       library.showBooksByAuthor(getAuthorName());
                       break;
                   case "10":
                       library.showNewBooks();
                       break;
                   case "11":
                       System.out.println("Goodbye");
                       break out;
                   case "help":
                       showMenuList();
                       break;
                   default:
                       System.out.println("Incorrect enter. Try again");

               }
        }
    }

    private void showReaderBooks() throws IOException {

        library.showReadersBooks(new BookReader(getReaderName(), getReaderSurname()));
    }

    private void giveBook() throws IOException {

        library.giveBook(new BookReader(getReaderName(), getReaderSurname()),
                            new Book(getBookName(), getAuthorName()));
        save();
    }

    private String getAuthorName() throws IOException {
        System.out.print("Enter author name: ");
        return br.readLine();
    }

    private String getReaderSurname() throws IOException {
        System.out.print("Enter reader surname: ");
        return br.readLine();
    }

    private void addReader() throws IOException {
        String readerName = getReaderName();
        String readerSurname = getReaderSurname();
        library.addBookReader(new BookReader(readerName, readerSurname));
        save();
    }

    private String getReaderName() throws IOException {
        System.out.print("Enter reader name: ");
        return br.readLine();
    }

    private void addBook() throws IOException {
        String bookName = getBookName();
        String authorName = getAuthorName();
        System.out.print("Enter year of publishing: ");
        int year = Integer.parseInt(br.readLine());
        library.addBook(new Book(bookName, authorName, year));
        save();
    }

    private String getBookName() throws IOException {
        System.out.print("Enter book name: ");
        return br.readLine();
    }

    private void save () {
        ObjectOutputStream oos = null;
        try {
            oos = new ObjectOutputStream(new FileOutputStream(LIBRARY_PATH));

        } catch (IOException e) {
            try {
                new File(LIBRARY_PATH).createNewFile();
            } catch (IOException e1) {
                e1.printStackTrace();
            }
        }
        try {
            oos.writeObject(library);
            oos.flush();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (oos != null)
                    oos.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}

