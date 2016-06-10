package week2.library.utils;

import week2.library.controller.Library;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class LibraryFactory {
    public Library createLibrary(String filePath){
        ObjectInputStream ois = null;
        try {
            ois = new ObjectInputStream(new FileInputStream(filePath));
            try {
                return (Library)ois.readObject();
            } catch (ClassNotFoundException e) {

                return new Library();
            }
        } catch (IOException e) {
            return new Library();
        } finally {
            try {
                if (ois != null)
                    ois.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
