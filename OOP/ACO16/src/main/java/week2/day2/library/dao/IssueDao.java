package week2.day2.library.dao;

import week2.day2.library.database.LibraryDB;
import week2.day2.library.enums.Genre;
import week2.day2.library.model.Book;
import week2.day2.library.model.PeriodicalIssue;

/**
 * Created by gorobec on 22.10.16.
 */
public class IssueDao {

    private LibraryDB db;

    public IssueDao() {
        db = LibraryDB.getInstance();

    }

    public boolean findIssue(String name, String author, int year, Genre genre){
        return db.findIssue(new Book(name, author, year, genre));
    }

    public PeriodicalIssue getIssue(String name, String author, int year, Genre genre){
        return db.getIssue(new Book(name, author, year, genre));
    }
}
