package week2.library;


import week2.library.utils.LibraryFactory;
import week2.library.view.Menu;

import java.io.IOException;

public class Run {
    public static void main(String[] args) throws IOException {
        new Menu(new LibraryFactory().createLibrary("src/week2/library/resources/library.txt")).start();
    }
}
