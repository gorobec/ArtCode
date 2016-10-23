package week2.day2.library.dao;

import week2.day2.library.database.LibraryDB;
import week2.day2.library.model.Reader;

/**
 * Created by gorobec on 22.10.16.
 */
public class ReaderDao {
    private LibraryDB db;

    public ReaderDao() {
        db = LibraryDB.getInstance();

    }

    public boolean findReader(String name){
        return db.findReader(new Reader(name));
    }

    public Reader getReader(String name){
        return db.getReader(new Reader(name));
    }


}
